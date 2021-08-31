package edu.neit.jonathandoolittle.models.tax;

/**
 * Represents the sales tax of the state of Alaska (nil)
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 17, 2021
 *
 */
public class AlaskaTaxModel implements TaxModel {

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public float getSalesTax(float price) {
		return 0.0f;
	}

}
