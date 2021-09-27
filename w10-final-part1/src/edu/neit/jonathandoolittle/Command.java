package edu.neit.jonathandoolittle;

/**
 * 
 * The root interface for a command as 
 * implemented by the commander pattern
 *
 * @author Jonathan Doolittle
 * @version 0.2 - Sep 13, 2021
 *
 */
public interface Command {

	/**
	 * Invokes this command
	 */
	public void execute();
	
	/**
	 * Reverses the effect of the previous command
	 *
	 */
	public void undo();
	
}
