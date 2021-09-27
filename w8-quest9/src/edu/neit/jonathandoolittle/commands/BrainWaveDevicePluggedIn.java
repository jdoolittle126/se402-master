package edu.neit.jonathandoolittle.commands;

import edu.neit.jonathandoolittle.devices.BrainWaveDevice;

public class BrainWaveDevicePluggedIn implements Command {

	// ******************************
	// Variables
	// ******************************

	BrainWaveDevice device;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new BrainWaveDevicePluggedIn instance
	 */
	public BrainWaveDevicePluggedIn(BrainWaveDevice device) {
		this.device = device;
	}

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public void execute() {
		System.out.println("A brain wave device is plugged in.");
		device.engageMagnitron();
		device.warm();
	}
	
}
