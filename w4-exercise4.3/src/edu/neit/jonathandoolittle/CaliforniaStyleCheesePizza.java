package edu.neit.jonathandoolittle;

/**
 * A California Style Cheese Pizza!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 10, 2021
 * @see Pizza
 */
public class CaliforniaStyleCheesePizza extends Pizza {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new CaliforniaStyleCheesePizza instance
	 */
	public CaliforniaStyleCheesePizza() {
		name = "California Style Thin Crust Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "California Pizza Sauce";
		
		toppings.add("Shredded Four Cheese Blend");
	}
	
	
}
