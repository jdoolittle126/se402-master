package edu.neit.jonathandoolittle;

/**
 * A Chicago Style Clam Pizza!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 10, 2021
 * @see Pizza
 */
public class ChicagoStyleClamPizza extends Pizza {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new ChicagoStyleClamPizza instance
	 */
	public ChicagoStyleClamPizza() {
		name = "Chicago Style Deep Dish Clam Pizza";
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
