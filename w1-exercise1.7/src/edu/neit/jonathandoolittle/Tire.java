package edu.neit.jonathandoolittle;

/**
 * 
 * Models a tire for this exercise's composition demo
 * 
 * <pre> 
 *    Tire tire = new Tire();
 *    tire.setDiameter(17);
 * </pre>
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Jul 24, 2021
 *
 */

public class Tire {

	int diameter;

	/**
	 * Gets this Tire's diameter (inches)
	 * @return
	 */
	public int getDiameter() {
		return diameter;
	}

	/**
	 * Sets this Tire's diameter
	 * @param diameter The diameter, in inches
	 */
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	
	
	
}
