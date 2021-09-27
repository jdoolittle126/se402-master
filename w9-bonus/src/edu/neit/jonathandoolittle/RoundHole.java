package edu.neit.jonathandoolittle;

/**
 * 
 * A small hole for placing pegs through
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 20, 2021
 *
 */
public class RoundHole {

	// ******************************
	// Variables
	// ******************************

	double radius;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new RoundHole instance
	 * @param radius The radius of this hole
	 */
	public RoundHole(double radius) {
		this.radius = radius;
	}

	// ******************************
	// Public methods
	// ******************************
	
	public boolean pegFits(Radius peg) {
		return peg.getRadius() < radius;
	}
	
}