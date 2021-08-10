package edu.neit.jonathandoolittle;

/**
 * Represents Quahog Clam Chowder for Soup Builder
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 9, 2021
 *
 */
public class BostonClamChowder extends ClamChowder {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new BostonClamChowder instance
	 */
	public BostonClamChowder() {
		soupName = "Quahog Clam Chowder";
		soupIngredients.clear();
		
		soupIngredients.add("1 lb of fresh pacific quahogs");
		soupIngredients.add("1 cup of corn");
		soupIngredients.add("1/2 cup of heavy cream");
		soupIngredients.add("1/4 cup of butter");
		soupIngredients.add("1/4 cup of potato chips");
	}

}
