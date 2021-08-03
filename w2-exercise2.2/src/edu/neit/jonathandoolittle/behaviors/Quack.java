package edu.neit.jonathandoolittle.behaviors;

/**
 * Quack is a {@link QuackBehavior} that represents the creature
 * making a very average quaking sound
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Jul 27, 2021
 *
 */
public class Quack implements QuackBehavior {

	// ******************************
	// Public methods
	// ******************************

	@Override
	public void quack() {
		System.out.println("Quack!!");
	}

}
