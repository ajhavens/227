package hw3;

/**
 * Scoring category that is satisfied by any hand.
 * The score is the sum of all die values.
 */
public class Chance extends Utility{
	/**
	 * Constructs a Chance category with the given display name.
	 * @param displayName
	 *   name for this category
	 */
	public Chance(String displayName){
		super(displayName);
	}

	/**
	 * has the condition for this category been satisfied
	 * @param dice
	 * 	given hand
	 * @return
	 * 	true for any hand
	 */
	public boolean isSatisfiedBy(Hand dice) {
		return true;
	}

	/**
	 * Potential score awarded for filling this Category
	 * @param dice
	 * 	given hand
	 * @return
	 * 	sum of all die values in hand
	 */
	public int getPotentialScore(Hand dice) {
		if(isSatisfiedBy(dice)){
			int score = 0;
			for(int i : dice.getAll())
				score += i;
			return score;
		}
		return 0;
	}
}
