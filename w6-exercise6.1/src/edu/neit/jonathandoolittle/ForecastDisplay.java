package edu.neit.jonathandoolittle;

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

	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new ForecastDisplay instance
	 * @param weatherData The data stream to observe
	 */
	public ForecastDisplay(Subject weatherData) {
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
		this.pressure = pressure;
		display();
	}

	@Override
	public void display() {
		System.out.println("Forecast: More of the same");
	}
}
