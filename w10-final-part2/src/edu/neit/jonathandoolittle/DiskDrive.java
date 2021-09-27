package edu.neit.jonathandoolittle;

/**
 * 
 * Adds a disk drive to a {@link Robot}
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 21, 2021
 *
 */
public class DiskDrive extends RobotDecorator {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new DiskDrive instance
	 */
	public DiskDrive(Robot robot) {
		super(robot);
		this.price = 32.00;
		this.description = "disk drive for playing cds";
	}

}
