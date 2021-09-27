package edu.neit.jonathandoolittle;

/**
 * 
 * RoboGames Inc. #1 selling product, the humanoid robot!
 * Can be equip with a number of attachments.
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 21, 2021
 *
 */
public class HumanoidRobot extends Robot {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new Robot instance with the price of $150.00
	 * @param customer The name of the customer buying this robot
	 * @param robotName The name of this robot
	 */
	public HumanoidRobot(String customer, String robotName) {
		super(customer, robotName);
		this.price = 150.00;
		this.description = "In the box is a humanoid robot";
	}

}
