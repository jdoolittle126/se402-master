package edu.neit.jonathandoolittle;

/**
 * 
 * A simple, square peg
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 20, 2021
 *
 */
public class SquarePeg implements Width {

	// ******************************
	// Variables
	// ******************************
	
	double width;

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new SquarePeg instance
	 * @param width The width of each side of this peg
	 */
	public SquarePeg(double width) {
		this.width = width;
	}

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public double getWidth() {
		return width;
	}

	@Override
	public void setWidth(double width) {
		this.width = width;
	}
}
