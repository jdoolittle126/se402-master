package edu.neit.jonathandoolittle;

import java.util.Observable;

/**
 * An observable stream of weather data
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 30, 2021
 *
 */
public class WeatherData extends Observable {

	// ******************************
	// Variables
	// ******************************
	
	private float temperature;
	private float humidity;
	private float pressure;

	// ******************************
	// Public methods
	// ******************************

	/**
	 * Sets the measurements and notifies observers
	 * @param temperature The new temperature (F)(
	 * @param humidity The new humidity percentage
	 * @param pressure The new pressure
	 */
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	/**
	 * @return This WeatherData's temperature
	 */
	public float getTemperature() {
		return temperature;
	}

	/**
	 * @return This WeatherData's humidity
	 */
	public float getHumidity() {
		return humidity;
	}

	/**
	 * @return This WeatherData's pressure
	 */
	public float getPressure() {
		return pressure;
	}

	/**
	 * Notifies the observers measurements have changed
	 */
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

}
