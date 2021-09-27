package edu.neit.jonathandoolittle;

/**
 * 
 * Command for the commander pattern.
 * Turns the given fan on when executed.
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 13, 2021
 *
 */
public class CeilingFanOnCommand implements Command {

	// ******************************
	// Variables
	// ******************************

	CeilingFan ceilingFan;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new CeilingFanOnCommand instance
	 */
	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public void execute() {
		ceilingFan.high();
	}

	@Override
	public void undo() {
		ceilingFan.off();
	}

}
