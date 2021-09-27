package edu.neit.jonathandoolittle;

/**
 * Command for the commander pattern.
 * Closes the given garage door when
 * executed.
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 13, 2021
 *
 */
public class GarageDoorCloseCommand implements Command {

	// ******************************
	// Variables
	// ******************************

	GarageDoor door;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new GarageDoorCloseCommand instance
	 */
	public GarageDoorCloseCommand(GarageDoor door) {
		this.door = door;
	}

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public void execute() {
		door.down();
	}
	
	@Override
	public void undo() {
		door.up();
	}
}