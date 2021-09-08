package edu.neit.jonathandoolittle;

import javafx.util.Pair;

/**
 * 
 * A Mocha decorator for a {@link Beverage}
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 3, 2021
 *
 */
public class Mocha extends CondimentDecorator{

	// ******************************
	// Variables
	// ******************************
	
	private static final PricingModel PRICE_MODEL = new PricingModel(
			new Pair<>(BeverageSize.TALL, 0.15),
			new Pair<>(BeverageSize.GRANDE, 0.20),
			new Pair<>(BeverageSize.VENTI, 0.25));
	
	// ******************************
	// Constructors
	// ******************************
	
	/**
	 * Creates a new Mocha instance
	 * @param beverage The beverage to decorate
	 */
	public Mocha(Beverage beverage) {
		super(beverage, PRICE_MODEL);
		description = ", Mocha";
	}

}
