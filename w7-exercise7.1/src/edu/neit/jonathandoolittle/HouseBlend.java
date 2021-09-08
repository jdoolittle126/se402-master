package edu.neit.jonathandoolittle;

import javafx.util.Pair;

/**
 * HouseBlend coffee
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 3, 2021
 *
 */
public class HouseBlend extends Beverage {

	// ******************************
	// Variables
	// ******************************
	
	private static final PricingModel PRICE_MODEL = new PricingModel(
			new Pair<>(BeverageSize.TALL, 0.89),
			new Pair<>(BeverageSize.GRANDE, 0.95),
			new Pair<>(BeverageSize.VENTI, 1.10));
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new HouseBlend instance
	 */
	public HouseBlend() {
		super(PRICE_MODEL);
		description = "House Blend Coffee";
	}

}
