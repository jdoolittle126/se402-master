package edu.neit.jonathandoolittle;

/**
 * 
 * Driver for exercise 8.2
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 13, 2021
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
		
		// Program the remote
		rc.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		rc.setCommand(1, kitchenLightOn, kitchenLightOff);
		rc.setCommand(2, ceilingFanOn, ceilingFanOff);
		rc.setCommand(3, stereoOn, stereoOff);
		rc.setCommand(4, doorOpen, doorClose);
		
		// Show the remote
		System.out.println(rc.toString());
		
		// Push some buttons
		rc.onButtonWasPushed(0);
		rc.offButtonWasPushed(0);
		rc.onButtonWasPushed(1);
		rc.offButtonWasPushed(1);
		rc.onButtonWasPushed(2);
		rc.offButtonWasPushed(2);
		rc.onButtonWasPushed(3);
		rc.offButtonWasPushed(3);
		rc.onButtonWasPushed(4);
		rc.offButtonWasPushed(4);
		
		// Undo that last action
		rc.undoButtonWasPushed();
		
	}
}
