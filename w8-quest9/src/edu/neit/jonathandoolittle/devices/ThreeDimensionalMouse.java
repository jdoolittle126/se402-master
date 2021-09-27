package edu.neit.jonathandoolittle.devices;

/**
 * 
 * TODO Generic Description of ThreeDimensionalMouse
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 14, 2021
 *
 */
public class ThreeDimensionalMouse {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new ThreeDimensionalMouse instance
	 */
	public ThreeDimensionalMouse() {

	}

	// ******************************
	// Public methods
	// ******************************
	
	public void off() {
		System.out.println("3D mouse powering down!");
	}
	
	public void spinDisc() {
		System.out.println("wrrrrrrrrr-, click! The 3D mouse's disc starts to rotate.");
	}
	
	public void attainConstantVelocity() {
		System.out.println("After many loud clunks, the 3D mouse disc appears to be spinning at a constant speed.");
	}
	
	public void stable() {
		System.out.println("The 3D mouse chirps, displaying a blue LED. It is ready for use.");
	}
}
