package edu.neit.jonathandoolittle;

/**
 * 
 * Car class for composition demo
 * 
 * <pre> 
 *    Car car = new Car();
 * </pre>
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Jul 24, 2021
 *
 */

public class Car {
	
	String color;
	Tire firestone = new Tire();
	
	/**
	 * Gets this Car's color
	 * @return The color of the Car
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * Sets this Car's color
	 * @param color The new color of the Car
	 */
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return String.format("This car is %s, with %d\" tires!", getColor(), firestone.getDiameter());
	}
	
	
	
}
