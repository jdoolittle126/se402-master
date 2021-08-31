package edu.neit.jonathandoolittle.models.sales;

import edu.neit.jonathandoolittle.models.tax.TaxModel;

/**
 * Allows for an object to model sales when
 * given a number of units and a tax model.
 *
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 17, 2021
 *
 */
public interface SalesModel {
	
	/**
	 * Returns the expected revenue when given a particular taxModel and number of units
	 * @param units The number of units to sold
	 * @param taxModel The tax model to be applied to these units
	 * @return The expected revenue
	 */
	public float reportRevenue(int units, TaxModel taxModel);

}
