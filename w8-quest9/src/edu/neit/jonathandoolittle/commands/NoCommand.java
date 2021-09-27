package edu.neit.jonathandoolittle.commands;

/**
 * 
 * A blank command
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 13, 2021
 *
 */
public class NoCommand implements Command {

	// ******************************
	// Overrides
	// ******************************

	@Override
	public void execute() {
		System.out.println("Nothing is plugged in!");
	}

}
