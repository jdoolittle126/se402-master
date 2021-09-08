package edu.neit.jonathandoolittle;

import javafx.util.Pair;

/**
 * Decaf coffee
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 3, 2021
 *
 */
public class Decaf extends Beverage {
	
	// ******************************
	// Variables
	// ******************************
	
	private static final PricingModel PRICE_MODEL = new PricingModel(
			new Pair<>(BeverageSize.TALL, 1.05),
			new Pair<>(BeverageSize.GRANDE, 1.10),
			new Pair<>(BeverageSize.VENTI, 1.25));
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new Decaf instance
	 */
	public Decaf() {
		super(PRICE_MODEL);
		description = "Decaf Coffee";
	}
}
