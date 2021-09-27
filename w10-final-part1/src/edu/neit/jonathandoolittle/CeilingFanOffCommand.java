package edu.neit.jonathandoolittle;

/**
 * 
 * Command for the commander pattern.
 * Turns the given fan off when executed.
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 13, 2021
 *
 */
public class CeilingFanOffCommand implements Command {

	// ******************************
	// Variables
	// ******************************

	CeilingFan ceilingFan;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new CeilingFanOffCommand instance
	 */
	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public void execute() {
		ceilingFan.off();
	}

	@Override
	public void undo() {
		ceilingFan.high();
	}

}
