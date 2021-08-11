package edu.neit.jonathandoolittle;

/**
 * A Chicago Style Cheese Pizza!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 10, 2021
 * @see Pizza
 */
public class ChicagoStyleCheesePizza extends Pizza {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new ChicagoStyleCheesePizza instance
	 */
	public ChicagoStyleCheesePizza() {
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
	}

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
	
	
}
