package edu.neit.jonathandoolittle;

/**
 * 
 * Window UI component for Jon's Text-Only 
 * UI toolkit!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 6, 2021
 *
 */
public abstract class Window {

	// ******************************
	// Variables
	// ******************************
	
	private int width;
	private int height;
	protected String description;

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new Window instance
	 * @param width The window's width
	 * @param height The window's height
	 */
	protected Window(int width, int height) {
		this.width = width;
		this.height = height;
		this.description = "";
	}

	// ******************************
	// Public methods
	// ******************************
	
	/**
	 * Renders this window
	 */
	public void draw() {
		System.out.println("Drawing " + toString());
	}
	
	/**
	 * @return This Window's width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width The new width for this Window
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return This Window's height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height The new height for this Window
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return This Window's description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description The new description for this Window
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public String toString() {
		return String.format("a %dx%d %s window", getWidth(), getHeight(), getDescription());
	}
	
}
