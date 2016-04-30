package hw3;

/**
 * Scoring category for a "yahtzee".  A hand
 * with N dice satisfies this category only if all N
 * values are the same.  For a hand that satisfies
 * this category, the score is a fixed value specified in the constructor;
 * otherwise, the score is zero.
 */
public class AllOfAKind extends Kinds
{
	/**
	 * Fixed point value awarded for filling this category
	 */
	private final int POINTS;
	/**
	 * Constructs an AllOfAKind with the given display name
	 * and score.
	 * @param displayName
	 *   name of this category
	 * @param points
	 *   points awarded for a hand that satisfies this category
	 *   
	 * Calls super to initialize N as 0.
	 */  
	public AllOfAKind(String displayName, int points){
		super(displayName,0);
		POINTS = points;
	}
	/**
	 * Overrides the scoring method used in Kinds super class
	 * @param dice
	 * 	given hand
	 * @return
	 * 	Fixed point value for filling this category. 0 if not satisfied.
	 */
	@Override
	public int getPotentialScore(Hand dice){
		if(isSatisfiedBy(dice))
			return POINTS;
		else
			return 0;
	}
}
