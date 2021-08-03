package edu.neit.jonathandoolittle.behaviors;

/**
 * FlyWithWings is a {@link FlyBehavior} that represents generic flying
 * using the creature's wings
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Jul 27, 2021
 *
 */
public class FlyWithWings implements FlyBehavior {

	// ******************************
	// Public methods
	// ******************************
	
	@Override
	public void fly() {
		System.out.println("Weeee im flying!");
	}
	
}
