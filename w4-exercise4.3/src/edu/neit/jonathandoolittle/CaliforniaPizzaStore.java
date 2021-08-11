package edu.neit.jonathandoolittle;

/**
 * Just your typical California pizza joint!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 10, 2021
 *
 */
public class CaliforniaPizzaStore extends PizzaStore {
	
	// ******************************
	// Overrides
	// ******************************
	
	@Override
	protected Pizza createPizza(String type) {
		
		switch(type.toLowerCase()) {
			case "cheese":
				return new CaliforniaStyleCheesePizza();
			case "hawaiian":
				return new CaliforniaStyleHawaiianPizza();
			case "pepperoni":
				return new CaliforniaStylePepperoniPizza();
			default:
				return null;
		}
		
	}

}
