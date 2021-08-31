package edu.neit.jonathandoolittle;

/**
 * Represents an observer in the subject-observer
 * model of the observer pattern
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 30, 2021
 *
 */
public interface Observer {
	
	/**
	 * Updates the observer with new information
	 * @param temp The new temperature (F)
	 * @param humidity The new humidity percentage
	 * @param pressure The new pressure
	 */
	public void update(float temp, float humidity, float pressure);

}
