package edu.neit.jonathandoolittle;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * A macro command encapsulates one or more commands that should
 * be executed together. Each command added to the macro will be
 * executed in the order it is added, starting with the first
 * added command. If components rely on each other, the order 
 * they are added must be taken into account or encapsulated in
 * other commands.
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 21, 2021
 *
 */
public class MacroCommand implements Command {

	// ******************************
	// Variables
	// ******************************

	private List<Command> commands;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new MacroCommand instance
	 * @param commands One of more commands to bind to this macro
	 */
	public MacroCommand(Command...commands) {
		this.commands = new LinkedList<>();
		addCommand(commands);
	}

	// ******************************
	// Accessors & Mutators
	// ******************************
	
	/**
	 * Adds one or more commands to this macro to be executed. 
	 * Commands are executed in the order they are added.
	 * @param commands The command(s) to add to this macro
	 */
	public void addCommand(Command...commands) {
		this.commands.addAll(Arrays.asList(commands));
	}
	
	/**
	 * Removes one or more commands from this macro. It is important to note 
	 * that matching type or contents of the command is not enough to have
	 * it removed. The command passed to this method must be the same object
	 * that was originally added. 
	 * @param commands The command(s) to remove
	 */
	public void removeCommand(Command...commands) {
		this.commands.removeAll(Arrays.asList(commands));
	}

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public void execute() {
		// Fire each command in order
		commands.forEach(Command::execute);
	}

	@Override
	public void undo() {
		// Fire each command in order
		commands.forEach(Command::undo);
	}
	
}
