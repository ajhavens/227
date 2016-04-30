package hw3;

/**
 * Scoring category for a "small straight".  A hand
 * with N dice satisfies this category only if it includes
 * N - 1 distinct consecutive values.  For a hand that satisfies
 * this category, the score is a fixed value specified in the constructor;
 * otherwise, the score is zero.
 */
public class SmallStraight extends Straights
{
  /**
   * Constructs a SmallStraight category with the given display name
   * and score.
   * @param displayName
   *   name of this category
   * @param points
   *   points awarded for a dice group that satisfies this category
   *   
   * initialized N from super to 1
   */  
  public SmallStraight(String displayName, int points)
  {
    super(displayName, points, 1);
    
  }
}
