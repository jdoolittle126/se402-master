package edu.neit.jonathandoolittle;

/**
 * Represents Clam Chowder for Soup Builder
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 3, 2021
 *
 */
public class ClamChowder extends Soup {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new ClamChowder instance
	 */
	public ClamChowder() {
		super();
		soupName = "Clam Chowder";
		soupIngredients.add("1 lb of fresh clams");
		soupIngredients.add("1 cup of fruit or vegetables");
		soupIngredients.add("1/2 cup of milk");
		soupIngredients.add("1/4 cup of butter");
		soupIngredients.add("1/4 cup of chips");
	}

}
