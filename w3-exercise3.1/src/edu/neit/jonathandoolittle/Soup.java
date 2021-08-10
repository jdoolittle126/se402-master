package edu.neit.jonathandoolittle;

import java.util.ArrayList;

/**
 * Provides a base class for all soups
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 3, 2021
 *
 */
public abstract class Soup {

	// ******************************
	// Variables
	// ******************************

	ArrayList<String> soupIngredients;
	String soupName;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new Soup instance
	 */
	public Soup() {
		soupIngredients = new ArrayList<>();
		soupName = "";
	}

	// ******************************
	// Public methods
	// ******************************

	/**
	 * @return The soup's name
	 */
	public String getSoupName() {
		return this.soupName;
	}
	

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public String toString() {
		StringBuilder listOfIngredients = new StringBuilder();
		listOfIngredients.append("Ingredients: ");
		soupIngredients.forEach(listOfIngredients::append);
		return listOfIngredients.toString();
	}
	
}
