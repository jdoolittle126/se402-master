package edu.neit.jonathandoolittle;

/**
 * 
 * Vehicle class for abstract class demo
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Jul 24, 2021
 *
 */

public abstract class Vehicle {
	
	/**
	 * Turns this Vehicle's lights on
	 */
	public void lightsOn() {
		System.out.println("lights on!");
	}
	
	/**
	 * Drives the Vehicle
	 */
	abstract void drive();
	

}
