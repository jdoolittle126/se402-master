package edu.neit.jonathandoolittle;

/**
 * A New York Style Veggie Pizza!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 10, 2021
 * @see Pizza
 */
public class NYStyleVeggiePizza extends Pizza {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new NYStyleVeggiePizza instance
	 */
	public NYStyleVeggiePizza() {
		name = "New York Style Sauce and Veggie Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Grated Reggiano Cheese");
	}
}
