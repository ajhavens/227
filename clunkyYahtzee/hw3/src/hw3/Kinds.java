package hw3;
/**
 * This a super class used for allbutone, allbuttwo
 * and all of a kind. These classes share a very similar 
 * isSatisfied method and 2 share similar scoring mechanisms
 *	
 */
public class Kinds extends Utility{
	/**
	 * N will be used in the algorithm and will be different for the 3 types of kinds
	 */
	private final int N;
	/**
	 * Contructs Kinds to extend to Allbuttwo allbutone and allofakind
	 * @param displayName
	 *  the name of that category
	 * @param N
	 * 	used for isSatisfied. 0 for all, 1 for allbutone and 2 for allbuttwo
	 */
	public Kinds(String displayName,int N) {
		super(displayName);
		this.N = N;
	}

	/**
	 * Does this hand have numDice - N of a kind?
	 * @param dice
	 * 	given hand
	 * @return
	 * 	True if there are numDice - N of the same value in one hand
	 */
	public boolean isSatisfiedBy(Hand dice) {
		//create new array with a length of maximum value a dice can be
		int[] arr = new int[dice.getMaxValue()];
		//iterate through all dice values
		for(int i : dice.getAll()){
			//save the value of dice into the corresponding index of arr
			//to count occurances of value
			arr[i - 1] += 1;
		}
		//iterate through arr to see if there are any values equal to or larger than 
		for(int i : arr){
			if(i >= dice.getNumDice() - N)
				return true;
		}
		return false;
	}

	/**
	 * Get score awarded if filled
	 * @param dice
	 * 	given hand
	 * @return
	 * 	sum of all die values. 0 if not satisfied.
	 */
	public int getPotentialScore(Hand dice){
		if(isSatisfiedBy(dice)){
		int score = 0;
		for(int i : dice.getAll())
			score += i;
		return score;
		}
		else 
			return 0;
	}
}
