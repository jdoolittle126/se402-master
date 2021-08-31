package edu.neit.jonathandoolittle.models.tax;

/**
 * Defines an object as having a getSalesTax method,
 * allowing it to represent the sales tax of various areas.
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 17, 2021
 *
 */
public interface TaxModel {

	/**
	 * Returns the sales tax of this particular entity
	 * @param price The unit price of the item
	 * @return The raw sales tax (NOT the combined value)
	 */
	public float getSalesTax(float price);
	
}
