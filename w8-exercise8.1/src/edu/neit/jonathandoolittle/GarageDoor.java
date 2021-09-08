package edu.neit.jonathandoolittle;

/**
 * Represents a garage door,
 * for continued work on our
 * commander pattern.
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 7, 2021
 *
 */
public class GarageDoor {

	// ******************************
	// Public methods
	// ******************************
	
	/**
	 * Raises the garage door
	 */
	public void up() {
		System.out.println("Garage door going up!");
	}
	
	/**
	 * Lowers the garage door
	 */
	public void down() {
		System.out.println("Garage door going down!");
	}
	
	/**
	 * Stops the garage door from moving
	 */
	public void stop() {
		System.out.println("Stopping the garage door.");
	}
	
	/**
	 * Turns the garage light on
	 */
	public void lightOn() {
		System.out.println("Garage light is on!");
	}
	
	/**
	 * Turns the garage light off
	 */
	public void lightOff() {
		System.out.println("Garage light is off!");
	}

}
