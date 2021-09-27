package edu.neit.jonathandoolittle.devices;

public class FitnessDevice {

	// ******************************
	// Public methods
	// ******************************
	
	public void off() {
		System.out.println("Powering down the physical fitness device.");
	}
	
	public void preWarm() {
		System.out.println("The physical fitness device enters warm-up mode. It begans to smolder.");
	}
	
	public void ready() {
		System.out.println("A large bright green LED indicates physical fitness device is now ready for use.");
	}

}
