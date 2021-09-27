package edu.neit.jonathandoolittle.commands;

import edu.neit.jonathandoolittle.devices.BrainWaveDevice;

public class BrainWaveDeviceUnplugged implements Command {

	// ******************************
	// Variables
	// ******************************

	BrainWaveDevice device;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new BrainWaveDeviceUnplugged instance
	 */
	public BrainWaveDeviceUnplugged(BrainWaveDevice device) {
		this.device = device;
	}

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public void execute() {
		System.out.println("A brain wave device was unplugged.");
		device.off();
	}
	
}
