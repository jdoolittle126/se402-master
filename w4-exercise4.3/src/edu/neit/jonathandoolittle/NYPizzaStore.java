package edu.neit.jonathandoolittle;

/**
 * Just your typical New York pizza joint!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 10, 2021
 *
 */
public class NYPizzaStore extends PizzaStore {
	
	// ******************************
	// Overrides
	// ******************************
	
	@Override
	protected Pizza createPizza(String type) {
		
		switch(type.toLowerCase()) {
			case "cheese":
				return new NYStyleCheesePizza();
			case "veggie":
				return new NYStyleVeggiePizza();
			case "clam":
				return new NYStyleClamPizza();
			case "pepperoni":
				return new NYStylePepperoniPizza();
			default:
				return null;
		}
		
	}

}
