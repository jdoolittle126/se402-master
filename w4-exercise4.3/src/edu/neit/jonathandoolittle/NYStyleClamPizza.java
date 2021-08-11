package edu.neit.jonathandoolittle;

/**
 * A New York Style Clam Pizza!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 10, 2021
 * @see Pizza
 */
public class NYStyleClamPizza extends Pizza {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new NYStyleClamPizza instance
	 */
	public NYStyleClamPizza() {
		name = "New York Style Sauce and Clam Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Grated Reggiano Cheese");
	}
}
