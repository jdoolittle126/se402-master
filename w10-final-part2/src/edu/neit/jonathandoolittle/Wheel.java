package edu.neit.jonathandoolittle;

/**
 * 
 * Adds a wheel to a {@link Robot}
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 21, 2021
 *
 */
public class Wheel extends RobotDecorator {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new Wheel instance
	 */
	public Wheel(Robot robot) {
		super(robot);
		this.price = 25.00;
		this.description = "wheel for moving around";
	}

}
