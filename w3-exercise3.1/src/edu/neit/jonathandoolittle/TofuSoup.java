package edu.neit.jonathandoolittle;

/**
 * Represents Tofu Soup for Soup Builder
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 3, 2021
 *
 */
public class TofuSoup extends Soup {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new TofuSoup instance
	 */
	public TofuSoup() {
		super();
		soupName = "Tofu Soup";
		
		soupIngredients.add("1 lb of tofu");
		soupIngredients.add("1 cup of carrot juice");
		soupIngredients.add("1/4 cup of spirolena");
	}

}
