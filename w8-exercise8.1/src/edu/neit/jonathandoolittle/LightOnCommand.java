package edu.neit.jonathandoolittle;

/**
 * 
 * Command for the commander pattern.
 * Turns the given light on when executed.
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 7, 2021
 *
 */
public class LightOnCommand implements Command {

	// ******************************
	// Variables
	// ******************************

	Light light;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new LightOnCommand instance
	 * @param light The light for this command to control
	 */
	public LightOnCommand(Light light) {
		this.light = light;
	}

	// ******************************
	// Overrides
	// ******************************
	
	/**
	 * Turns the associated light on
	 */
	@Override
	public void execute() {
		light.on();
		
	}

}
