package edu.neit.jonathandoolittle;

import java.util.Observable;
import java.util.Observer;

/**
 * Displays the current conditions,
 * such as temperature as well as
 * the average temperature.
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 30, 2021
 *
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

	// ******************************
	// Variables
	// ******************************
	
	private Observable observable;
	private float temperature;
	private float minTemperature;
	private float maxTemperature;
	private float avgTemperature;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new CurrentConditionsDisplay instance
	 * @param weatherData The data stream to observe
	 */
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public void display() {
		System.out.println("Avg/Min/Max Temperature = " + avgTemperature + "/"+ minTemperature + "/" + maxTemperature);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		if(arg0 instanceof WeatherData) {
			
			WeatherData data = (WeatherData) arg0;
			
			temperature = data.getTemperature();
			if(temperature < minTemperature) {
				minTemperature = temperature;
			}
			if(temperature > maxTemperature) {
				maxTemperature = temperature;
			}
			avgTemperature = (avgTemperature + temperature) / 2;
			display();
		}
	}
}
