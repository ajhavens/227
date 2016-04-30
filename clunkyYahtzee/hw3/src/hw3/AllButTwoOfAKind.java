package hw3;

/**
 * Scoring category for (N-2) of a kind.  A hand
 * with N dice satisfies this category only if at least N - 2 of
 * the values are the same.  For a hand that satisfies
 * this category, the score the sum of all die values;
 * otherwise the score is zero.
 */
public class AllButTwoOfAKind extends Kinds
{
  /**
   * Constructs an AllButTwoOfAKind with the given display name
   * 
   * @param displayName
   *   name of this category
   * Calls super to initialize N as 2;
   */  
  public AllButTwoOfAKind(String displayName)
  {
    super(displayName,2);

  }
  
}
