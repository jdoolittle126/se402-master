package edu.neit.jonathandoolittle.behaviors;

/**
 * FlyRocketPowered is a {@link FlyBehavior} that represents flying
 * via rocket propulsion
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Jul 27, 2021
 *
 */
public class FlyRocketPowered implements FlyBehavior {

	// ******************************
	// Public methods
	// ******************************

	@Override
	public void fly() {
		System.out.println("5, 4, 3, 2, 1... LIFTOFF! I'm flying on BlueOrigin!");
	}

}
