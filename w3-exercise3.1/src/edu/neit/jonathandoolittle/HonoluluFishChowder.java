package edu.neit.jonathandoolittle;

/**
 * Represents Opakapaka Fish Chowder for Soup Builder
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 3, 2021
 *
 */
public class HonoluluFishChowder extends FishChowder {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new HonoluluFishChowder instance
	 */
	public HonoluluFishChowder() {
		soupName = "Opakapaka Fish Chowder";
		soupIngredients.clear();
		
		soupIngredients.add("1 lb of fresh opakapaka fish");
		soupIngredients.add("1 cup of pineapple chunks");
		soupIngredients.add("1/2 cup of coconut milk");
		soupIngredients.add("1/4 cup of SPAM");
		soupIngredients.add("1/4 cup of taro chips");
	}

}
