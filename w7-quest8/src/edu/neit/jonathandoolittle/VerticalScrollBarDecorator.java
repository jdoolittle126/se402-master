package edu.neit.jonathandoolittle;

/**
 * 
 * Adds a vertical scroll bar to the window,
 * allowing a user to scroll down long pages
 * of information.
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 6, 2021
 *
 */
public class VerticalScrollBarDecorator extends WindowDecorator {

	// ******************************
	// Constructors
	// ******************************
	
	/**
	 * Decorates this window with a vertical scroll bar
	 * @param window The window to decorate
	 */
	public VerticalScrollBarDecorator(Window window) {
		super(window);
		setDescription("vertical-scrolling");
	}

}
