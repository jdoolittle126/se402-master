package edu.neit.jonathandoolittle;

/**
 * Command for the commander pattern.
 * Turns the given stereo on and
 * sets the input to CD when executed
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 13, 2021
 *
 */
public class StereoOnWithCDCommand implements Command {

	// ******************************
	// Variables
	// ******************************

	Stereo stereo;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new StereoOnWithCDCommand instance
	 */
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}

	@Override
	public void undo() {
		stereo.off();
	}
}
