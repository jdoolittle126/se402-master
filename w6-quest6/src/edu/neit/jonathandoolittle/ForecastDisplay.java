package edu.neit.jonathandoolittle;

import java.util.Observable;
import java.util.Observer;

/**
 *  Displays the forecast in a human
 *  readable way.
 *
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 30, 2021
 *
 */
public class ForecastDisplay implements DisplayElement, Observer {

	// ******************************
	// Variables
	// ******************************
	private Observable observable;
	private float temperature;
	private float humidity;
	private float pressure;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new ForecastDisplay instance
	 * @param weatherData The data stream to observe
	 */
	public ForecastDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public void update(Observable arg0, Object arg1) {
		if(arg0 instanceof WeatherData) {
			WeatherData data = (WeatherData) arg0;
			
			temperature = data.getTemperature();
			humidity = data.getHumidity();
			pressure = data.getPressure();
			display();
		}
	}

	@Override
	public void display() {
		System.out.println("Forecast: More of the same");
	}


}
