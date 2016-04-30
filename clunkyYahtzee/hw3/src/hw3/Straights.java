package hw3;
/**
 * This class extends both large and small straight methods.
 * They both use very similar methods for isSatifiedBy and
 * are differentiated by N.
 *
 */
public class Straights extends Utility {
	/**
	 * point value for filling this category
	 */
	private final int POINTS;
	/**
	 * integer used for isSatisfiedBy methods
	 */
	private final int N;
	/**
	 * Constructs a Straights object that extends Utility and is extended by both straight types.
	 * @param displayName
	 * 	name of category
	 * @param points
	 * 	points awarded for filling category
	 * @param N
	 * 	Used for isSatisfiedBy method
	 */
	public Straights(String displayName, int points,int N) {
		super(displayName);
		POINTS = points;
		this.N = N;
	}

	/**
	 * Does it satisfy the category condition
	 * @param dice
	 * 	given hand
	 * @return
	 * 	True if there are numDice - N consecutive values in a hand. 
	 */
	public boolean isSatisfiedBy(Hand dice) {
		//count for occurances
		int maxCount = 1;
		//iterate through hand
		for(int i = 1; i < dice.getAll().length; i++){
			//check if the difference between current elements and the one before is 1
			if((dice.getAll()[i] - dice.getAll()[i-1]) == 1){
				//if so, add one to count
				maxCount += 1;
				//if count reaches critical value, return true
				if(maxCount == dice.getNumDice()-N)
					return true;
			}
			//if difference is 0 (they are the same value) do nothing a move on to next element
			else if((dice.getAll()[i] - dice.getAll()[i-1]) == 0)
				continue;
			else
				//if difference is not 0 or 1, reset count to 1;
				maxCount = 1;
		}
		return false;
	}

	/**
	 * gets score awarded for filling this Category
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
