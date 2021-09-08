package edu.neit.jonathandoolittle;

import javafx.util.Pair;

/**
 * Espresso coffee
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 3, 2021
 *
 */
public class Espresso extends Beverage {

	// ******************************
	// Variables
	// ******************************
	
	private static final PricingModel PRICE_MODEL = new PricingModel(
			new Pair<>(BeverageSize.TALL, 1.99),
			new Pair<>(BeverageSize.GRANDE, 2.25),
			new Pair<>(BeverageSize.VENTI, 2.95));
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new Espresso instance
	 */
	public Espresso() {
		super(PRICE_MODEL);
		description = "Espresso";
	}

}
