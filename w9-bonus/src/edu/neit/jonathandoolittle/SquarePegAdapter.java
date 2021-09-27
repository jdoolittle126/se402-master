package edu.neit.jonathandoolittle;

/**
 * 
 * Converts width to radius and radius to width,
 * so that a square peg can fit in a circular hole!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 20, 2021
 *
 */
public class SquarePegAdapter implements Radius {

	// ******************************
	// Variables
	// ******************************

	Width peg;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new SquarePegAdapter instance
	 */
	public SquarePegAdapter(Width peg) {
		this.peg = peg;
	}

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public double getRadius() {	
		/* Formula: a^2 + b^2 = c^2
		 * We know a = b = width / 2 (since radius is measured from center)
		 * Therefore a^2 + b^2 can be simplified to:
		 * 2 * ((width / 2) ^ 2)
		 * and since we are solving for c,
		 * we take the sqrt of this.
		 */
		return Math.sqrt(2 * Math.pow(peg.getWidth() / 2, 2));
	}

	@Override
	public void setRadius(double radius) {
		/* Formula: a^2 + b^2 = c^2
		 * We know a = b = width / 2, and c = radius
		 * Looking at the formula from above, we know
		 * radius^2 = 2 * ((width / 2) ^ 2)
		 * Therefore, we can solve for width as
		 * sqrt(radius^2 / 2) * 2
		 */
		peg.setWidth(Math.sqrt(Math.pow(radius, 2) / 2) * 2);
	}
}
