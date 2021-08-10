package edu.neit.jonathandoolittle;

/**
 * Represents Vegetable Soup for Soup Builder
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 3, 2021
 *
 */
public class VegetableSoup extends Soup {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new VegetableSoup instance
	 */
	public VegetableSoup() {
		super();
		soupName = "Vegetable Soup";
		
		soupIngredients.add("1 cup of bullion");
		soupIngredients.add("1/4 cup of carrots");
		soupIngredients.add("1/4 cup of potatos");
	}

}
