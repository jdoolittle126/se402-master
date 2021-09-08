package edu.neit.jonathandoolittle;

/**
 * 
 * Adds a horizontal scroll bar to the window,
 * allowing a user to scroll across long segments
 * of information.
 * 
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 6, 2021
 *
 */
public class HorizontalScrollBarDecorator extends WindowDecorator {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Decorates this window with a horizontal scroll bar
	 * @param window The window to decorate
	 */
	public HorizontalScrollBarDecorator(Window window) {
		super(window);
		setDescription("horizontal-scrolling");
	}

}
