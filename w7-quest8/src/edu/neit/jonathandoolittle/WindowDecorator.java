package edu.neit.jonathandoolittle;

/**
 * 
 * Decorator for adding components to a {@link Window}
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 6, 2021
 *
 */
public abstract class WindowDecorator extends Window {

	// ******************************
	// Variables
	// ******************************
	
	private Window window;

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new WindowDecorator instance
	 * @param width The window's width
	 * @param height The window's height
	 */
	protected WindowDecorator(Window window) {
		super(window.getWidth(), window.getHeight());
		this.window = window;
	}
	
	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public String getDescription() {
		return window.getDescription() + ", " + description;
	}

}
