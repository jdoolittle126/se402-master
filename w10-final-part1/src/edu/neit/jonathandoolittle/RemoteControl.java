package edu.neit.jonathandoolittle;

/**
 * 
 * Programmable remote control to hold
 * various commands that change the state
 * of common appliances.
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 13, 2021
 *
 */
public class RemoteControl {

	// ******************************
	// Variables
	// ******************************
	
	Command[] onCommands;
	Command[] offCommands;
	Command lastCommand;

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new RemoteControl instance
	 */
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		Command noCommand = new NoCommand();
		lastCommand = noCommand;
		for(int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}

	// ******************************
	// Accessors
	// ******************************
	
	/**
	 * Programs a command to a given slot
	 * @param slot The slot to set, starting at 0
	 * @param onCommand The on command
	 * @param offCommand The off command
	 */
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	// ******************************
	// Public methods
	// ******************************
	
	/**
	 * Executes the command of a button press
	 */
	public void buttonWasPushed(Command command) {
		lastCommand = command;
		lastCommand.execute();
	}
	
	/**
	 * Hits the on button at the given slot
	 * @param slot The slot to press, starting at 0
	 */
	public void onButtonWasPushed(int slot) {
		buttonWasPushed(onCommands[slot]);
	}
	
	/**
	 * Hits the off button at the given slot
	 * @param slot The slot to press, starting at 0
	 */
	public void offButtonWasPushed(int slot) {
		buttonWasPushed(offCommands[slot]);
	}
	
	/**
	 * Undoes the last given command
	 */
	public void undoButtonWasPushed() {
		lastCommand.undo();
		lastCommand = new NoCommand();
	}

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public String toString() {
		StringBuilder sb =  new StringBuilder();
		sb.append("\n----- Remote Control -----\n");
		for(int i = 0; i < onCommands.length; i++) {
			sb.append("[slot ");
			sb.append(i);
			sb.append("] ");
			sb.append(onCommands[i].getClass().getName());
			sb.append("\t\t");
			sb.append(offCommands[i].getClass().getName());
			sb.append("\n");
		}	
		return sb.toString();
	}
}
