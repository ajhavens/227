package hw3;

/**
 * Scoring category for a "large straight".  A hand
 * with N dice satisfies this category only if there are
 * N distinct consecutive values.  For a hand that satisfies
 * this category, the score is a fixed value specified in the constructor;
 * otherwise, the score is zero.
 */
public class LargeStraight extends Straights 
{
  /**
   * Constructs a LargeStraight category with the given display name
   * and score.
   * @param displayName
   *   name of this category
   * @param points
   *   points awarded for a hand that satisfies this category
   *   
   * Initialized N from super to be 0
   */  
  public LargeStraight(String displayName, int points)
  {
    super(displayName, points, 0);
  }
}
