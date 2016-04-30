package hw3;
import hw3.Hand;
/**
 * Scoring category that is based on counting occurrences
 * of a particular target value (specified in the constructor).
 * This category is satisfied by any hand.  The score
 * is the sum of just the die values that match the target value.
 */
public class CountOccurrences extends Utility{
  /**
   * Constructs a CountOccurrences category with the given display name and 
   * target value.
   * @param displayName
   *   name for this category
   * @param whichValue
   *   target value that must be matched for a die to count toward the
   *   score
   */
	
	private int value;
	public CountOccurrences(String displayName, int whichValue){
		super(displayName);
		value = whichValue;
	}	 
	
	/**
	 * Does it fit criteria to fill category?
	 * @param dice
	 * 	given hand
	 * @return
	 * 	true for any hand
	 */
	public boolean isSatisfiedBy(Hand dice) {
		return true;
	}
	/**
	 * get potential score awarded for filling this Category
	 * @param dice
	 * 	given hand
	 * @return
	 * 	Sums value of all target value occurrences
	 */
	public int getPotentialScore(Hand dice) {
		int score = 0;
		if(isSatisfiedBy(dice)){
			for(int i : dice.getAll()){
				if(i == value)
					score += i;
			}
		}
		return score;
	}

}
