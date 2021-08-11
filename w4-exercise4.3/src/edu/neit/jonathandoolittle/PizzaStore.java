package edu.neit.jonathandoolittle;

/**
 * Represents a store that sells all types of pizzas!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 10, 2021
 *
 */
public abstract class PizzaStore {

	// ******************************
	// Public methods
	// ******************************
	
	/**
	 * Cooks you up a pizza of the given type!
	 * @param type The type of pizza you would like to order
	 * @return The pizza!
	 */
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	// ******************************
	// Protected methods
	// ******************************
	
	/**
	 * Creates a pizza based on the given type
	 * @param type The type of pizza
	 * @return The pizza
	 */
	protected abstract Pizza createPizza(String type);

	
}
