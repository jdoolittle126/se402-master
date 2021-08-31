package edu.neit.jonathandoolittle;

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

	private float temperature;
	private float minTemperature;
	private float maxTemperature;
	private float avgTemperature;
	private Subject weatherData;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new CurrentConditionsDisplay instance
	 * @param weatherData The data stream to observe
	 */
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public void display() {
		System.out.println("Avg/Min/Max Temperature = " + avgTemperature + "/"+ minTemperature + "/" + maxTemperature);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
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
