package edu.neit.jonathandoolittle;

/**
 * 
 * A decorator for the {@link Beverage} class
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 3, 2021
 *
 */
public abstract class CondimentDecorator extends Beverage {

	// ******************************
	// Variables
	// ******************************

	Beverage beverage;
	
	protected CondimentDecorator(Beverage beverage, PricingModel pricing) {
		super(pricing);
		this.beverage = beverage;
		this.size = beverage.size;
	}
	
	// ******************************
	// Overrides
	// ******************************

	@Override
	public String getDescription() {
		return beverage.getDescription() + description;
	}
	
	@Override
	public double cost() {
		return beverage.cost() + pricing.getCost(size);
	}
}
