package edu.neit.jonathandoolittle;

/**
 * Represents Fish Chowder for Soup Builder
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 3, 2021
 *
 */
public class FishChowder extends Soup {
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new FishChowder instance
	 */
	public FishChowder() {
		super();
		soupName = "Fish Chowder";
		soupIngredients.add("1 lb of fresh fish");
		soupIngredients.add("1 cup of fruit or vegetables");
		soupIngredients.add("1/2 cup of milk");
		soupIngredients.add("1/4 cup of butter");
		soupIngredients.add("1/4 cup of chips");
	}

}
