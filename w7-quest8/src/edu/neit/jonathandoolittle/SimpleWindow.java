package edu.neit.jonathandoolittle;

/**
 * 
 * A simple, plain ol' Window!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 6, 2021
 *
 */
public class SimpleWindow extends Window {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new SimpleWindow instance
	 * @param width The window's width
	 * @param height The window's height
	 */
	public SimpleWindow(int width, int height) {
		super(width, height);
		setDescription("simple");
	}
}
