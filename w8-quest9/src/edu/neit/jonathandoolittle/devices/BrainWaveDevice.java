package edu.neit.jonathandoolittle.devices;

public class BrainWaveDevice {

	// ******************************
	// Public methods
	// ******************************

	public void off() {
		System.out.println("The brain wave device is shutting down.");
	}
	
	public void engageMagnitron() {
		System.out.println("The brain wave device causes you to jolt. You notice a small warning label "
				+ "indicating that you should not be wearing the device as the magnitron starts up, and "
				+ "slowly lift it off of your head.");
	}
	
	public void warm() {
		System.out.println("The brain wave device beeps to indicate it is fully warmed up. Ready for use!");
	}
	
}
