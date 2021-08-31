package edu.neit.jonathandoolittle;

import java.util.ArrayList;

/**
 * An observable stream of weather data
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 30, 2021
 *
 */
public class WeatherData implements Subject {

	// ******************************
	// Variables
	// ******************************
	
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new WeatherData instance
	 */
	public WeatherData() {
		observers = new ArrayList<>();
	}

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
	 * Notifies the observers measurements have changed
	 */
	public void measurementsChanged() {
		notifyObservers();
	}

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);	
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}
	
}
