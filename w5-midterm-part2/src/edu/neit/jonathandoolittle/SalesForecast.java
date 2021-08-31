package edu.neit.jonathandoolittle;

import java.util.LinkedList;

import edu.neit.jonathandoolittle.models.sales.SalesModel;
import edu.neit.jonathandoolittle.models.tax.TaxModel;

/**
 * Represents a collection of {@link Region}s, with varying
 * sales tax and predicted number of units sold. Regions can be added,
 * and also created on the fly using the class's utilities. When a report is
 * requested, the simulation is run, and the results are compiled into a readable
 * format.
 *
 * <pre>
 *  SalesForecast salesForecast = new SalesForecast(new HarryPotterSalesModel());
 *  salesForecast.addRegion("Alabama", new AlabamaTaxModel(), 10000);
 * </pre>
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 17, 2021
 *
 */
public class SalesForecast {

	// ******************************
	// Variables
	// ******************************

	/**
	 * The default time frame for a sales calculation, in days
	 */
	public static final int DEFAULT_TIME_FRAME = 30;
	
	private SalesModel salesModel;
	private LinkedList<Region> salesRegions;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new SalesForecast instance
	 * @param salesModel The sales model to forecast
	 */
	public SalesForecast(SalesModel salesModel) {
		this.salesModel = salesModel;
		salesRegions = new LinkedList<>();
	}

	// ******************************
	// Public methods
	// ******************************
	
	/**
	 * Adds this region to the prediction
	 * @param region The region to add
	 */
	public void addRegion(Region region) {
		salesRegions.add(region);
	}
	
	/**
	 * Adds a new tax model to this prediction, in a particular region. 
	 * The predicted sales are spread over 1 month (30 days) by default.
	 * @param regionName The name of this region, to be used in reports
	 * @param taxModel The tax model to apply to this region
	 * @param predictedSales The predicted number of sales in this region
	 */
	public void addRegion(String regionName, TaxModel taxModel, int predictedSales) {
		addRegion(regionName, taxModel, predictedSales, DEFAULT_TIME_FRAME);
	}
	
	/**
	 * Adds a new tax model to this prediction, in a particular region.
	 * @param regionName The name of this region, to be used in reports
	 * @param taxModel The tax model to apply to this region
	 * @param predictedSales The predicted number of sales in this region
	 * @param timeFrame The time frame, in days, for the predicted sales
	 */
	public void addRegion(String regionName, TaxModel taxModel, int predictedSales, int timeFrame) {
		addRegion(new Region(regionName, taxModel, predictedSales, timeFrame));
	}
	
	/**
	 * Generates a revenue report based on the provided regions and estimates
	 * @return A string containing the revenue report
	 */
	public String getRevenueReport() {
		
		// Global Stats
		int count = 0;
		int totalUnitsSold = 0;
		float totalPredictedRevenue = 0.0f;
		float totalUnitsSoldPerDay = 0.0f;
		
		StringBuilder sb = new StringBuilder();
		
		// Regional Reports
		sb.append("REVENUE REPORT\n===============\n - REGIONAL REPORT\n");
		
		for(Region region : salesRegions) {
			float predictedRevenue = salesModel.reportRevenue(region.getPredictedSales(), region.getTaxModel());
			float unitsPerDay = region.getPredictedSales() / (float) region.getTimeFrame();
			
			sb.append("    ");
			sb.append(region.getRegionName().toUpperCase());
			sb.append("\n     # Predicted Revenue: ");
			sb.append(String.format("$%,.2f", predictedRevenue));
			sb.append("\n     # Units Sold: ");
			sb.append(String.format("%,d", region.getPredictedSales()));
			sb.append("\n     # Units Sold Per Day: ");
			sb.append(String.format("%,.3f", unitsPerDay));
			sb.append("\n");
			
			totalUnitsSold += region.getPredictedSales();
			totalPredictedRevenue += predictedRevenue;
			totalUnitsSoldPerDay += unitsPerDay;
			count++;
		}
		
		sb.append(" - END OF REGIONAL REPORT\n");
		
		// Overall reports
		
		sb.append(" - TOTAL REPORT\n");
		sb.append("   # Overall Predicted Revenue: ");
		sb.append(String.format("$%,.2f", totalPredictedRevenue));
		sb.append(" in " + count + " region(s)!");
		sb.append("\n   # Total Units Sold: ");
		sb.append(String.format("%,d", totalUnitsSold));
		sb.append("\n   # Units Sold Per Day: ");
		sb.append(String.format("%,.3f", totalUnitsSoldPerDay));
		sb.append("\n   # Average Units Sold Per Day Per Region: ");
		
		if(count != 0) {
			sb.append(String.format("%,.3f", totalUnitsSoldPerDay / count));
		} else {
			sb.append("0");
		}
		
		sb.append("\n===============");
		
		return sb.toString();
	}

}
