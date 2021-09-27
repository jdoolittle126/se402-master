package edu.neit.jonathandoolittle;

/**
 * 
 * Adds a monitor to a {@link Robot}
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 21, 2021
 *
 */
public class Monitor extends RobotDecorator {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new Monitor instance
	 */
	public Monitor(Robot robot) {
		super(robot);
		this.price = 100.00;
		this.description = "monitor that can show you your robot's mood";
	}

}
