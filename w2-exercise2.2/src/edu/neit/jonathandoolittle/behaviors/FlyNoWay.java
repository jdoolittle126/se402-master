package edu.neit.jonathandoolittle.behaviors;

/**
 * FlyNoWay is a {@link FlyBehavior} that represents the 
 * inability to fly
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Jul 27, 2021
 *
 */
public class FlyNoWay implements FlyBehavior {

	// ******************************
	// Public methods
	// ******************************

	@Override
	public void fly() {
		System.out.println("I can't fly :(");
	}
}
