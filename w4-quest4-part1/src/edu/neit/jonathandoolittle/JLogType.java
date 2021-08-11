package edu.neit.jonathandoolittle;

/**
 * 
 * Categorizes log items
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 10, 2021
 *
 */
public enum JLogType {
	/**
	 * This item is just informativeINF
	 */
	INFO,
	/**
	 * This is a warning, but the program can continue to run
	 */
	WARNING,
	/**
	 * This is an error, and the program cannot continue correctly
	 */
	ERROR
}
