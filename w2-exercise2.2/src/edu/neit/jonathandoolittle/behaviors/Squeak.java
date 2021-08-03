package edu.neit.jonathandoolittle.behaviors;

/**
 * Squeak is a {@link QuackBehavior} that represents the creature
 * making a small *squeak* noise
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Jul 27, 2021
 *
 */
public class Squeak implements QuackBehavior {

	// ******************************
	// Public methods
	// ******************************
	
	@Override
	public void quack() {
		System.out.println("Squeaakkkk!");
	}

}
