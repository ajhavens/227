package hw3;

/**
 * Scoring category for (N-1) of a kind.  A hand
 * with N dice satisfies this category only if at least N - 1 of
 * the values are the same.  For a hand that satisfies
 * this category, the score the sum of all die values;
 * otherwise the score is zero.
 */
public class AllButOneOfAKind extends Kinds
{
  /**
   * Constructs an AllButOneOfAKind category with the given display name
   * 
   * @param displayName
   *   name of this category
   * Calls super to initialize N as 1;
   */
  public AllButOneOfAKind(String displayName)
  {
    super(displayName,1);
  }
  
}
