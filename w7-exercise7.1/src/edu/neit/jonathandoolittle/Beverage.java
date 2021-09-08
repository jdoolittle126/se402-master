package edu.neit.jonathandoolittle;

/**
 * A generic beverage
 *
 * @author Jonathan Doolittle
 * @version 0.2 - Sep 3, 2021
 *
 */
public abstract class Beverage {

	// ******************************
	// Variables
	// ******************************
	
	String description = "Unknown Beverage";
	BeverageSize size;
	PricingModel pricing;
	
	// ******************************
	// Constructor
	// ******************************

	/**
	 * Creates a new Beverage instance, defaulting at as a small (Tall)
	 * @param pricing The PricingModel that represents this beverage
	 */
	protected Beverage(PricingModel pricing) {
		this(pricing, BeverageSize.TALL);
	}
	
	/**
	 * Creates a new Beverage instance
	 * @param pricing The PricingModel that represents this beverage
	 * @param size The size of the beverage
	 */
	protected Beverage(PricingModel pricing, BeverageSize size) {
		this.size = size;
		this.pricing = pricing;
	}
	
	// ******************************
	// Public methods
	// ******************************
	
	/**
	 * @return This Beverage's description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * @return This Beverage's size
	 */
	public BeverageSize getSize() {
		return size;
	}

	/**
	 * @param size The new size for this Beverage
	 */
	public void setSize(BeverageSize size) {
		this.size = size;
	}

	/**
	 * @return The cost of this Beverage
	 */
	public double cost() {
		return pricing.getCost(size);
	}
 
}
