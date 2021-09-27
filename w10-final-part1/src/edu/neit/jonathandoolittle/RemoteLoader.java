package edu.neit.jonathandoolittle;

/**
 * 
 * Driver for exercise 8.2
 *
 * @author Jonathan Doolittle
 * @version 0.2 - Sep 21, 2021
 *
 */
public class RemoteLoader {

	public static void main(String[] args) {
		
		// The controller
		RemoteControl rc = new RemoteControl();
		
		// The appliances 
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor();
		Stereo stereo = new Stereo("Living Room");
		
		// Light Commands
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		// Fan Commands
		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		// Door Commands
		GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(garageDoor);
		GarageDoorCloseCommand doorClose =  new GarageDoorCloseCommand(garageDoor);
		
		// Stereo Commands
		StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		
		// Creating a Macro Command
		MacroCommand macroOn = new MacroCommand(livingRoomLightOn, kitchenLightOn, ceilingFanOn, stereoOn);
		MacroCommand macroOff = new MacroCommand(livingRoomLightOff, kitchenLightOff, ceilingFanOff, stereoOff);
		
		// Program the remote
		rc.setCommand(0, macroOn, macroOff);
		rc.setCommand(1, kitchenLightOn, kitchenLightOff);
		rc.setCommand(2, ceilingFanOn, ceilingFanOff);
		rc.setCommand(3, stereoOn, stereoOff);
		rc.setCommand(4, doorOpen, doorClose);
		
		// Show the remote
		System.out.println(rc.toString());
		
		// Push some buttons
		System.out.println("Using our new macro to get ready for a family game night!\n");
		
		rc.onButtonWasPushed(0);
		
		System.out.println("\nThat was a fun night! Using the macro to turn everything off!\n");
		
		rc.offButtonWasPushed(0);

		System.out.println("\nWait, I can't see! Let's undo that last action!\n");
		
		// Undo that last action
		rc.undoButtonWasPushed();
		
	}
}
