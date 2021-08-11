package edu.neit.jonathandoolittle;

/**
 * A New York Style Pepperoni Pizza!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 10, 2021
 * @see Pizza
 */
public class NYStylePepperoniPizza extends Pizza {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new NYStylePepperoniPizza instance
	 */
	public NYStylePepperoniPizza() {
		name = "New York Style Sauce and Pepperoni Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Grated Reggiano Cheese");
	}
}
