package edu.neit.jonathandoolittle;

/**
 * Just your typical Chicago pizza joint!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 10, 2021
 *
 */
public class ChicagoPizzaStore extends PizzaStore {
	
	// ******************************
	// Overrides
	// ******************************
	
	@Override
	protected Pizza createPizza(String type) {
		
		switch(type.toLowerCase()) {
			case "cheese":
				return new ChicagoStyleCheesePizza();
			case "veggie":
				return new ChicagoStyleVeggiePizza();
			case "clam":
				return new ChicagoStyleClamPizza();
			case "pepperoni":
				return new ChicagoStylePepperoniPizza();
			default:
				return null;
		}
		
	}

}
