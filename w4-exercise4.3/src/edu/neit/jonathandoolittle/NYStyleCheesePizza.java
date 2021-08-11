package edu.neit.jonathandoolittle;

/**
 * A New York Style Cheese Pizza!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 10, 2021
 * @see Pizza
 */
public class NYStyleCheesePizza extends Pizza {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new NYStyleCheesePizza instance
	 */
	public NYStyleCheesePizza() {
		name = "New York Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Grated Reggiano Cheese");
	}
}
