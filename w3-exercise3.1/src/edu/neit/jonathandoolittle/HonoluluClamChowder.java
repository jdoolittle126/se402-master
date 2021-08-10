package edu.neit.jonathandoolittle;

/**
 * Represents Pacific Clam Chowder for Soup Builder
 * 
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 3, 2021
 *
 */
public class HonoluluClamChowder extends ClamChowder {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new HonoluluClamChowder instance
	 */
	public HonoluluClamChowder() {
		soupName = "Pacific Clam Chowder";
		soupIngredients.clear();
		
		soupIngredients.add("1 lb of fresh pacific clams");
		soupIngredients.add("1 cup of pineapple chunks");
		soupIngredients.add("1/2 cup of coconut milk");
		soupIngredients.add("1/4 cup of SPAM");
		soupIngredients.add("1/4 cup of taro chips");
	}
}
