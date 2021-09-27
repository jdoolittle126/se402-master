package edu.neit.jonathandoolittle;

/**
 * 
 * Adds a keyboard to a {@link Robot}
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 21, 2021
 *
 */
public class Keyboard extends RobotDecorator {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new Keyboard instance
	 */
	public Keyboard(Robot robot) {
		super(robot);
		this.price = 10.00;
		this.description = "keyboard for sending emails on your robot";
	}

}
