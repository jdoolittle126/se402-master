package edu.neit.jonathandoolittle;

/**
 * A Chicago Style Veggie Pizza!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 10, 2021
 * @see Pizza
 */
public class ChicagoStyleVeggiePizza extends Pizza {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new ChicagoStyleVeggiePizza instance
	 */
	public ChicagoStyleVeggiePizza() {
		name = "Chicago Style Deep Dish Veggie Pizza";
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
