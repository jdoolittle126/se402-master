package edu.neit.jonathandoolittle.models.tax;

/**
 * Represents the sales tax of the state of Arkansas (6%)
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 17, 2021
 *
 */
public class ArkansasTaxModel implements TaxModel {

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public float getSalesTax(float price) {
		return price * 0.06f;
	}

}
