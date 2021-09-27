package edu.neit.jonathandoolittle.commands;

import edu.neit.jonathandoolittle.devices.FitnessDevice;

public class FitnessDeviceUnplugged implements Command {

	// ******************************
	// Variables
	// ******************************

	FitnessDevice device;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new FitnessDevicePluggedIn instance
	 */
	public FitnessDeviceUnplugged(FitnessDevice device) {
		this.device = device;
	}

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public void execute() {
		System.out.println("A fitness device was unplugged.");
		device.off();
	}
	
}
