package edu.neit.jonathandoolittle;

/**
 * 
 * Represents a simple ceiling fan for 
 * the commander pattern.
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 13, 2021
 *
 */
public class CeilingFan {

	// ******************************
	// Variables
	// ******************************

	String room;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new CeilingFan instance
	 */
	public CeilingFan(String room) {
		this.room = room;
	}

	// ******************************
	// Public methods
	// ******************************
	
	/**
	 * Turns this ceiling fan to high speed
	 */
	public void high() {
		System.out.println(room + " ceiling fan is on high");
	}
	
	/**
	 * Turns this ceiling fan off
	 */
	public void off() {
		System.out.println(room + " ceiling fan is off");
	}
}
