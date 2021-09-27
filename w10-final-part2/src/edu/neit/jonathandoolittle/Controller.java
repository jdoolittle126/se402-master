package edu.neit.jonathandoolittle;

/**
 * 
 * Adds a controller to a {@link Robot}
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 21, 2021
 *
 */
public class Controller extends RobotDecorator {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new Controller instance
	 */
	public Controller(Robot robot) {
		super(robot);
		this.price = 22.99;
		this.description = "controller for playing call of duty on your robot";
	}

}
