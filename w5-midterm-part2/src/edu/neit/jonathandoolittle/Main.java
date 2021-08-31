package edu.neit.jonathandoolittle;

import edu.neit.jonathandoolittle.models.sales.HarryPotterSalesModel;
import edu.neit.jonathandoolittle.models.tax.AlabamaTaxModel;
import edu.neit.jonathandoolittle.models.tax.AlaskaTaxModel;
import edu.neit.jonathandoolittle.models.tax.ArizonaTaxModel;
import edu.neit.jonathandoolittle.models.tax.ArkansasTaxModel;
import edu.neit.jonathandoolittle.models.tax.CaliforniaTaxModel;
import edu.neit.jonathandoolittle.models.tax.ColoradoTaxModel;
import edu.neit.jonathandoolittle.models.tax.ConnecticutTaxModel;

/**
 * Driver for the second part of the midterm
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 17, 2021
 *
 */
public class Main {

	public static void main(String[] args) {

		SalesForecast salesForecast = new SalesForecast(new HarryPotterSalesModel());
		
		salesForecast.addRegion("Alabama", new AlabamaTaxModel(), 10000);
		salesForecast.addRegion("Alaska", new AlaskaTaxModel(), 10000);
		salesForecast.addRegion("Arizona", new ArizonaTaxModel(), 10000);
		salesForecast.addRegion("Arkansas", new ArkansasTaxModel(), 10000);
		salesForecast.addRegion("California", new CaliforniaTaxModel(), 10000);
		salesForecast.addRegion("Colorado", new ColoradoTaxModel(), 10000);
		salesForecast.addRegion("Connecticut", new ConnecticutTaxModel(), 10000);
		
		System.out.println(salesForecast.getRevenueReport());
		
	}
}
