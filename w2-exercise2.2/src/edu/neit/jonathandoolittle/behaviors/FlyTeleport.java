package edu.neit.jonathandoolittle.behaviors;

/**
 * FlyTeleport is a {@link FlyBehavior} that represents the 
 * ability to teleport between locations!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Jul 30, 2021
 *
 */
public class FlyTeleport implements FlyBehavior {

	// ******************************
	// Public methods
	// ******************************

	@Override
	public void fly() {
		System.out.println("wooosh!");
	}
}
