package edu.neit.jonathandoolittle;

import edu.neit.jonathandoolittle.models.tax.TaxModel;

/**
 * Represents an area with a particular sales tax,
 * and predicted sales associated with it.
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 17, 2021
 *
 */
public class Region {

	// ******************************
	// Variables
	// ******************************
	
	private String regionName; 
	private TaxModel taxModel;
	private int predictedSales;
	private int timeFrame;

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new Region instance
	 * @param regionName The region's name
	 * @param taxModel The tax model that represents this region
	 * @param predictedSales The predicted sales of this region
	 * @param timeFrame The time frame, in days, for the predicted sales
	 */
	public Region(String regionName, TaxModel taxModel, int predictedSales, int timeFrame) {
		this.regionName = regionName;
		this.taxModel = taxModel;
		this.predictedSales = predictedSales;
		this.timeFrame = timeFrame;
	}

	/**
	 * @return This Region's name
	 */
	public String getRegionName() {
		return regionName;
	}

	/**
	 * @param regionName The new name for this Region
	 */
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	/**
	 * @return This Region's tax model
	 */
	public TaxModel getTaxModel() {
		return taxModel;
	}

	/**
	 * @param taxModel The new tax model for this Region
	 */
	public void setTaxModel(TaxModel taxModel) {
		this.taxModel = taxModel;
	}

	/**
	 * @return This Region's predicted sales
	 */
	public int getPredictedSales() {
		return predictedSales;
	}

	/**
	 * @param predictedSales The new predicted sales for this Region
	 */
	public void setPredictedSales(int predictedSales) {
		this.predictedSales = predictedSales;
	}

	/**
	 * @return This Region's time frame (in days)
	 */
	public int getTimeFrame() {
		return timeFrame;
	}

	/**
	 * @param timeFrame The new time frame, in days, for this Region
	 */
	public void setTimeFrame(int timeFrame) {
		this.timeFrame = timeFrame;
	}
	
}
