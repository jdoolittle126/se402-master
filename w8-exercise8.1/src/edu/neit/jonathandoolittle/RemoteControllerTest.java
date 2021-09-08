package edu.neit.jonathandoolittle;

/**
 * Driver for exercise 8.1
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 7, 2021
 *
 */
public class RemoteControllerTest {

	public static void main(String[] args) {
		
		SimpleRemoteControl remoteControl = new SimpleRemoteControl();
		Light light = new Light();
		GarageDoor door = new GarageDoor();
		
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(door);
		
		remoteControl.setCommand(lightOn);
		remoteControl.buttonWasPressed();
		
		remoteControl.setCommand(doorOpen);
		remoteControl.buttonWasPressed();
	}

}
