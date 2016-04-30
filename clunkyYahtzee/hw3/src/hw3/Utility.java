package hw3;
import hw3.api.Category;
/**
 * Abstract class used to that partially implements category 
 * and is also extended by all other classes involving the implementation of category
 * fulfills simple get and set methods shared by all other implementations
 */
public abstract class Utility implements Category{
	/**
	 * name for category
	 */
	private String displayName;
	/**
	 * boolean for fill method
	 */
	private boolean filled;
	/**
	 * score for filled category
	 */
	private int score;
	/**
	 * given hand
	 */
	private Hand hand;
	/**
	 * Constructs Utility to extend to all other classes involving categories
	 * @param displayName
	 * initialized filled to false and score to 0
	 */
	public Utility(String displayName){
		this.displayName = displayName;
		filled = false;
		score = 0;
	}
	/**
	 * Returns the hand that was used to fill this category or null if not filled
	 * @return
	 * 	hand filling this category or null if not filled
	 */
	public Hand getHand(){
		if(isFilled())
			return hand;
		else 
			return null;
	}
	/**
	 * Returns the score for this category or zero if
	 * the category is not filled
	 * @return 
	 * score for this cateogry if filled. 0 otherwise
	 */
	public int getScore(){
		
		if(isFilled())
			return score;
		else 
			return 0;
	}
	/**
	 * Determines whether this category is filled
	 * @return
	 * 	true if this category has a fixed hand and score. false if otherwise
	 */
	public boolean isFilled(){
		return filled;
	}
	/**
	 * Permanently sets the hand being used to fill this category. The score is set to the value of getPotentialScore for the given hand. Throws IllegalStateException if the category has already been filled or if the given hand is not complete
	 *@param dice
	 *	given hand
	 *@throws
	 *	java.lang.IllegalStateException - if the given hand is not complete (according to the isComplete() method of Hand) or if this category is already filled
	 */
	public void fill(Hand dice){
		if(filled || !dice.isComplete())
			throw new IllegalStateException();
		else{
			filled = true;
			score = getPotentialScore(dice);
			hand = dice;
		}
	}
	/**
	 * Returns the name for this category
	 * @return displayName
	 * 	Returns the name for this category
	 */
	public String getDisplayName(){
		return displayName;
	}
}
