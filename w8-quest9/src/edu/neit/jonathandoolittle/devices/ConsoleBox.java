package edu.neit.jonathandoolittle.devices;

import edu.neit.jonathandoolittle.commands.BrainWaveDevicePluggedIn;
import edu.neit.jonathandoolittle.commands.BrainWaveDeviceUnplugged;
import edu.neit.jonathandoolittle.commands.Command;
import edu.neit.jonathandoolittle.commands.FitnessDevicePluggedIn;
import edu.neit.jonathandoolittle.commands.FitnessDeviceUnplugged;
import edu.neit.jonathandoolittle.commands.NoCommand;
import edu.neit.jonathandoolittle.commands.ThreeDimensionalMousePluggedIn;
import edu.neit.jonathandoolittle.commands.ThreeDimensionalMouseUnplugged;

public class ConsoleBox {

	// ******************************
	// Variables
	// ******************************

	Command usbPlugIn; 
	Command usbUnPlug;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new OuyaBox instance
	 */
	public ConsoleBox() {
		usbPlugIn = new NoCommand();
		usbUnPlug = new NoCommand();
	}
	
	// ******************************
	// Public methods
	// ******************************
	
	/**
	 * Adds a new device to the system.
	 * @param plugInCommand The command that should be executed when the device is plugged in
	 * @param unpluggedCommand The command that should be executed when the device is unplugged
	 */
	public void addDevice(Command plugInCommand, Command unpluggedCommand) {
		usbPlugIn = plugInCommand;
		usbUnPlug = unpluggedCommand;
	}
	
	/**
	 *  Turns the box off
	 */
	public void off() {
		usbUnPlug.execute();
	}
	
	/**
	 * Turns the box on, and loads the drivers for the device that is plugged in
	 */
	public void on() {
		usbPlugIn.execute();
	}

	// ******************************
	// Overrides
	// ******************************
	
	public static void main(String[] args) {
		System.out.println("> Wow a new console box! Let's turn it on!\n");
		
		ConsoleBox box = new ConsoleBox();
		box.on();
		
		System.out.println("\n> Whoops, luckily we bought all of the accessories. Let's try the fitness device first.\n");
		
		FitnessDevice dev1 = new FitnessDevice();
		FitnessDevicePluggedIn dev1OnCommand = new FitnessDevicePluggedIn(dev1);
		FitnessDeviceUnplugged dev1OffCommand = new FitnessDeviceUnplugged(dev1);
		
		box.addDevice(dev1OnCommand, dev1OffCommand);
		box.on();
		
		System.out.println("\n> Yaay! That was fun! Let's see what else we have.\n");
		
		box.off();
		
		System.out.println("\n> How about the brain wave device?\n");
		
		BrainWaveDevice dev2 = new BrainWaveDevice();
		BrainWaveDevicePluggedIn dev2OnCommand = new BrainWaveDevicePluggedIn(dev2);
		BrainWaveDeviceUnplugged dev2OffCommand = new BrainWaveDeviceUnplugged(dev2);
		
		box.addDevice(dev2OnCommand, dev2OffCommand);
		box.on();
		
		System.out.println("\n> How exciting! There is one more thing in the box. Let's try that too!\n");
		
		box.off();
		
		System.out.println("\n> Looks like a 3D mouse.\n");
		
		ThreeDimensionalMouse dev3 = new ThreeDimensionalMouse();
		ThreeDimensionalMousePluggedIn dev3OnCommand = new ThreeDimensionalMousePluggedIn(dev3);
		ThreeDimensionalMouseUnplugged dev3OffCommand = new ThreeDimensionalMouseUnplugged(dev3);
		
		box.addDevice(dev3OnCommand, dev3OffCommand);
		box.on();
		
	}
	
}
