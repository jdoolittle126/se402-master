package edu.neit.jonathandoolittle;

/**
 * 
 * Displays weather statistics, such as humidity percentage.
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 30, 2021
 *
 */
public class StatisticsDisplay implements DisplayElement, Observer {

	// ******************************
	// Variables
	// ******************************

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new ForecastDisplay instance
	 * @param weatherData The data stream to observe
	 */
	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F and " + humidity + "% humidity");
	}
}
