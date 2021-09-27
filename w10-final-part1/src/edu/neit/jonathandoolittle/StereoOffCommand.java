package edu.neit.jonathandoolittle;

/**
 * Command for the commander pattern.
 * Turns the given stereo off
 * executed.
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 13, 2021
 *
 */
public class StereoOffCommand implements Command {

	// ******************************
	// Variables
	// ******************************

	Stereo stereo;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new StereoOffCommand instance
	 */
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public void execute() {
		stereo.off();
	}

	@Override
	public void undo() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}
}
