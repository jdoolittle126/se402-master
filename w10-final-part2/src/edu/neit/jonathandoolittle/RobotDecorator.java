package edu.neit.jonathandoolittle;

/**
 * 
 * Used to append features for customers
 * who would like to build their own 
 * robots!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 21, 2021
 *
 */
public abstract class RobotDecorator extends Robot {

	// ******************************
	// Variables
	// ******************************
	
	Robot robot;

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new RobotDecorator instance
	 * @param robot The robot to append this feature to
	 */
	protected RobotDecorator(Robot robot) {
		super(robot.getOwnerName(), robot.getRobotName());
		this.robot = robot;
	}

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public double getPrice() {
		return robot.getPrice() + this.price;
	}
	
	@Override
	public String getDescription() {
		return robot.getDescription() + " and a " + this.description;
	}
	
}
