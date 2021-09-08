package edu.neit.jonathandoolittle;

import javafx.util.Pair;

/**
 * 
 * A SteamedMilk decorator for a {@link Beverage}
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 3, 2021
 *
 */
public class SteamedMilk extends CondimentDecorator {
	
	// ******************************
	// Variables
	// ******************************
	
	private static final PricingModel PRICE_MODEL = new PricingModel(
			new Pair<>(BeverageSize.TALL, 0.05),
			new Pair<>(BeverageSize.GRANDE, 0.10),
			new Pair<>(BeverageSize.VENTI, 0.15));
	
	// ******************************
	// Constructors
	// ******************************
	
	/**
	 * Creates a new SteamedMilk instance
	 * @param beverage The beverage to decorate
	 */
	public SteamedMilk(Beverage beverage) {
		super(beverage, PRICE_MODEL);
		description = ", Steamed Milk";
	}
}
