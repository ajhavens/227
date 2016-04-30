package hw3;

/**
 * Scoring category for a generalized full house.  A hand
 * with N dice satisfies this category only in the following cases:
 * If N is even, there are two different values, each occurring exactly N/2 times.
 * If N is odd, there are two different values, one of them occurring N/2 times and
 * the other occurring N/2 + 1 times.  For a hand that satisfies
 * this category, the score is a fixed value specified in the constructor;
 * otherwise, the score is zero.
 */
public class FullHouse extends Utility
{
	/**
	 * Constructs a FullHouse category with the given display name
	 * and score.
	 * @param displayName
	 *   name of this category
	 * @param points
	 *   points awarded for a hand that satisfies this category
	 */  
	private final int POINTS;
	
	public FullHouse(String displayName, int points){
		super(displayName);
		POINTS = points;
    
	}
	/**
	 * Is condition to fill category satisfied?
	 * @param dice
	 * 	given hand
	 * @return
	 * 	Scoring category for a generalized full house. A hand with N dice satisfies this category only in the following cases: If N is even, there are two different values, each occurring exactly N/2 times. If N is odd, there are two different values, one of them occurring N/2 times and the other occurring N/2 + 1 times. For a hand that satisfies this category, the score is a fixed value specified in the constructor; otherwise, the score is zero.
	 * 	If there are only 2 die values that occur and the difference between the number of occurrences is 1 or less, return true.
	 * (explanation in line comments)
	 */
	public boolean isSatisfiedBy(Hand dice) {
		//creates new array of length max die value
		int[] arr = new int[dice.getMaxValue()];
		//if there are less than 2 elements in hand return false
		if(dice.getAll().length < 2)
			return false;
		//iterate through hand
		for(int i : dice.getAll()){
			//add one to index of element value. Counting occurance of each value
			arr[i-1] += 1;
		}
		int count = 0;
		//initialize array of length 2 to later compare values
		int[] b = new int[2];
		//iterate through occurance counts
		for(int i = 0; i < arr.length; i++){
			//look for none zero values
			if(arr[i] != 0){
				//there can only be none-zero values
				if(count < 2)
					//adds it to comparison array
					b[count] = arr[i];
				//advance count of none-zeros
				count += 1;
				//if there are more than 2 counts at this points return false
				if(count > 2){
					return false;
				}
			}			
		}
		//check to see if the 2 none-zero values have difference of 1 or less
		if(count == 2 && Math.abs(b[0]-b[1])<= 1){
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 * get potential score awarded for filling this Category
	 * @param dice
	 * 	given hand
	 * @return
	 * 	Potential score awarded for filling this Category. 0 if otherwise
	 */
	public int getPotentialScore(Hand dice) {
		if(isSatisfiedBy(dice))
			return POINTS;
		else 
			return 0;
	}
}
