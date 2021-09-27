package edu.neit.jonathandoolittle;

/**
 * 
 * Represents a simple light,
 * for our commander pattern!
 *
 * @author Jonathan Doolittle
 * @version 0.2 - Sep 13, 2021
 *
 */
public class Light {

	// ******************************
	// Variables
	// ******************************

	String room;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new Light instance
	 */
	public Light(String room) {
		this.room = room;
	}
	
	// ******************************
	// Public methods
	// ******************************
	
	/**
	 * Turns this light on
	 */
	public void on() {
		System.out.println(room + " light is on!");
	}
	
	/**
	 * Turns this light off
	 */
	public void off() {
		System.out.println(room + " light is off!");
	}
	
}
