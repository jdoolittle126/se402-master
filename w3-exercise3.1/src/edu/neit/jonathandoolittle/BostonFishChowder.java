package edu.neit.jonathandoolittle;

/**
 * Represents Scrod Fish Chowder for Soup Builder
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 3, 2021
 *
 */
public class BostonFishChowder extends FishChowder {

	// ******************************
	// Constructors
	// ******************************
	
	/**
	 * Creates a new BostonFishChowder instance
	 */
	public BostonFishChowder() {
		soupName = "Scrod Fish Chowder";
		soupIngredients.clear();
		
		soupIngredients.add("1 lb of fresh scrod fish");
		soupIngredients.add("1 cup of corn");
		soupIngredients.add("1/2 cup of heavy cream");
		soupIngredients.add("1/4 cup of butter");
		soupIngredients.add("1/4 cup of potato chips");
	}

}
