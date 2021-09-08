package edu.neit.jonathandoolittle;

import javafx.util.Pair;

/**
 * Dark Roast coffee
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 3, 2021
 *
 */
public class DarkRoast extends Beverage {
	
	// ******************************
	// Variables
	// ******************************
	
	private static final PricingModel PRICE_MODEL = new PricingModel(
			new Pair<>(BeverageSize.TALL, 0.99),
			new Pair<>(BeverageSize.GRANDE, 1.10),
			new Pair<>(BeverageSize.VENTI, 1.35));

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new DarkRoast instance
	 */
	public DarkRoast() {
		super(PRICE_MODEL);
		description = "Dark Roast Coffee";
	}

}
