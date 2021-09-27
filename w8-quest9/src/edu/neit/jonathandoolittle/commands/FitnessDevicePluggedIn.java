package edu.neit.jonathandoolittle.commands;

import edu.neit.jonathandoolittle.devices.FitnessDevice;

public class FitnessDevicePluggedIn implements Command {

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
	public FitnessDevicePluggedIn(FitnessDevice device) {
		this.device = device;
	}

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public void execute() {
		System.out.println("A fitness device is plugged in.");
		device.preWarm();
		device.ready();
	}
	
}
