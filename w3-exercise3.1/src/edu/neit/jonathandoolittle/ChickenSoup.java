package edu.neit.jonathandoolittle;

/**
 * Represents Chicken Soup for Soup Builder
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 3, 2021
 *
 */
public class ChickenSoup extends Soup {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new ChickenSoup instance
	 */
	public ChickenSoup() {
		super();
		soupName = "Chicken Soup";
		soupIngredients.add("1 lb of diced chicken");
		soupIngredients.add("1/2 cup of rice");
		soupIngredients.add("1 cup of bullion");
		soupIngredients.add("1/16 cup of butter");
		soupIngredients.add("1/4 cup of diced carrots");
	}

}
