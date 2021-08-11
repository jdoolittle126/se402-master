package edu.neit.jonathandoolittle;

/**
 * A California Style Pepperoni Pizza!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 10, 2021
 * @see Pizza
 */
public class CaliforniaStylePepperoniPizza extends Pizza {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new CaliforniaStylePepperoniPizza instance
	 */
	public CaliforniaStylePepperoniPizza() {
		name = "California Style Thin Crust Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "California Pizza Sauce";
		
		toppings.add("Shredded Four Cheese Blend");
		toppings.add("Pepperoni");
	}
		
}
