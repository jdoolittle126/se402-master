package edu.neit.jonathandoolittle;

/**
 * 
 * A simple, rounded peg
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 20, 2021
 *
 */
public class RoundPeg implements Radius {

	// ******************************
	// Variables
	// ******************************

	double radius;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new RoundPeg instance
	 */
	public RoundPeg(double radius) {
		this.radius = radius;
	}

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public double getRadius() {
		return radius;
	}

	@Override
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
