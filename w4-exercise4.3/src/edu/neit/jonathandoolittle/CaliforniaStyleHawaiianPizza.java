package edu.neit.jonathandoolittle;

/**
 * A California Style Hawaiian Pizza!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 10, 2021
 * @see Pizza
 */
public class CaliforniaStyleHawaiianPizza extends Pizza {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new CaliforniaStyleHawaiianPizza instance
	 */
	public CaliforniaStyleHawaiianPizza() {
		name = "California Style Thin Crust Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "California Pizza Sauce";
		
		toppings.add("Shredded Four Cheese Blend");
		toppings.add("Diced Pineapples");
		toppings.add("Thin Ham Slices");
	}

}
