package edu.neit.jonathandoolittle;

/**
 * 
 * The framework for all robots created 
 * here at RoboGames Inc! Contains important
 * data such as the robot's name, the owner's
 * name, the price, and product description!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 21, 2021
 *
 */
public abstract class Robot {

	// ******************************
	// Variables
	// ******************************

	private String robotName;
	private String ownerName;
	protected String description;
	protected double price;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new Robot instance with the default price of $0.00
	 * @param customer The name of the customer buying this robot
	 * @param robotName The name of this robot
	 */
	protected Robot(String customer, String robotName) {
		this.robotName = robotName;
		this.ownerName = customer;
		this.price = 0.00;
		this.description = "In the box is a robot";
	}

	// ******************************
	// Accessors
	// ******************************
	
	/**
	 * @return This Robot's robotName
	 */
	public String getRobotName() {
		return robotName;
	}

	/**
	 * @return This Robot's ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}

	/**
	 * @return This Robot's price
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * @return This Robot's description
	 */
	public String getDescription() {
		return description;
	}
	
	// ******************************
	// Overrides
	// ******************************
	
	@Override 
	public String toString() {
		return String.format("Meet %s! - %s%nThis robot was made for %s, and cost $%.2f%n", getRobotName(), getDescription(), getOwnerName(), getPrice());
	}
	
}
