package edu.neit.jonathandoolittle;

/**
 * 
 * The root interface for a command as 
 * implemented by the commander pattern
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 7, 2021
 *
 */
public interface Command {

	/**
	 * Invokes this command
	 */
	public void execute();
	
}
