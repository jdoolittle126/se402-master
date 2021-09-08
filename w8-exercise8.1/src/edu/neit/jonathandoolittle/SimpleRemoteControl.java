package edu.neit.jonathandoolittle;

/**
 * A simple remote control, with one
 * button, for usage demonstrating the
 * commander pattern.
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 7, 2021
 *
 */
public class SimpleRemoteControl {

	// ******************************
	// Variables
	// ******************************

	Command slot;
	
	// ******************************
	// Accessors
	// ******************************
	
	/**
	 * Sets the command for this remote's only button
	 * @param command The command that will be executed
	 */
	public void setCommand(Command command) {
		this.slot = command;
	}

	// ******************************
	// Public methods
	// ******************************
	
	/**
	 * Simulates this remote's button being pressed
	 */
	public void buttonWasPressed() {
		slot.execute();
	}

}
