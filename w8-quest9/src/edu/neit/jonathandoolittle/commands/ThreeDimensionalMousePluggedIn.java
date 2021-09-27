package edu.neit.jonathandoolittle.commands;

import edu.neit.jonathandoolittle.devices.ThreeDimensionalMouse;

public class ThreeDimensionalMousePluggedIn implements Command {

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
	public ThreeDimensionalMousePluggedIn(ThreeDimensionalMouse device) {
		this.device = device;
	}

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public void execute() {
		System.out.println("A 3D mouse is plugged in.");
		device.spinDisc();
		device.attainConstantVelocity();
		device.stable();
	}
	
}
