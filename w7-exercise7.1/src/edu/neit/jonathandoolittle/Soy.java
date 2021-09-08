package edu.neit.jonathandoolittle;

import javafx.util.Pair;

/**
 * 
 * A Soy decorator for a {@link Beverage}
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 3, 2021
 *
 */
public class Soy extends CondimentDecorator{

	// ******************************
	// Variables
	// ******************************
	
	private static final PricingModel PRICE_MODEL = new PricingModel(
			new Pair<>(BeverageSize.TALL, 0.10),
			new Pair<>(BeverageSize.GRANDE, 0.15),
			new Pair<>(BeverageSize.VENTI, 0.20));
	
	// ******************************
	// Constructors
	// ******************************
	
	/**
	 * Creates a new Soy instance
	 * @param beverage The beverage to decorate
	 */
	public Soy(Beverage beverage) {
		super(beverage, PRICE_MODEL);
		description = ", Soy";
	}

}
