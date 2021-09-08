package edu.neit.jonathandoolittle;

/**
 * 
 * Represents a simple light,
 * for our commander pattern!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 7, 2021
 *
 */
public class Light {

	// ******************************
	// Public methods
	// ******************************
	
	/**
	 * Turns this light on
	 */
	public void on() {
		System.out.println("Light is on!");
	}
	
	/**
	 * Turns this light off
	 */
	public void off() {
		System.out.println("Light is off!");
	}
	
}
