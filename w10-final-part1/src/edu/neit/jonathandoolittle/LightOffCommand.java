package edu.neit.jonathandoolittle;

/**
 * 
 * Command for the commander pattern.
 * Turns the given light off when executed.
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 13, 2021
 *
 */
public class LightOffCommand implements Command {

	// ******************************
	// Variables
	// ******************************

	Light light;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new LightOffCommand instance
	 * @param light The light for this command to control
	 */
	public LightOffCommand(Light light) {
		this.light = light;
	}

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public void execute() {
		light.off();
		
	}
	
	@Override
	public void undo() {
		light.on();	
	}

}