package edu.neit.jonathandoolittle;

/**
 * Command for the commander pattern.
 * Opens the given garage door when
 * executed.
 *
 * @author Jonathan Doolittle
 * @version 0.2 - Sep 13, 2021
 *
 */
public class GarageDoorOpenCommand implements Command {

	// ******************************
	// Variables
	// ******************************

	GarageDoor door;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new GarageDoorOpenCommand instance
	 */
	public GarageDoorOpenCommand(GarageDoor door) {
		this.door = door;
	}

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public void execute() {
		door.up();
	}
	
	@Override
	public void undo() {
		door.down();
	}
}
