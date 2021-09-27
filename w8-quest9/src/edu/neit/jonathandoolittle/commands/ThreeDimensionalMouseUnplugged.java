package edu.neit.jonathandoolittle.commands;

import edu.neit.jonathandoolittle.devices.ThreeDimensionalMouse;

public class ThreeDimensionalMouseUnplugged implements Command {

	// ******************************
	// Variables
	// ******************************

	ThreeDimensionalMouse device;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new FitnessDevicePluggedIn instance
	 */
	public ThreeDimensionalMouseUnplugged(ThreeDimensionalMouse device) {
		this.device = device;
	}

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public void execute() {
		System.out.println("A 3D mouse is unplugged.");
		device.off();
	}
	
}
