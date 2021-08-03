package edu.neit.jonathandoolittle.behaviors;

/**
 * SignLanguage is a {@link QuackBehavior} that represents the creature
 * somehow having hands and signing 
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Jul 30, 2021
 *
 */
public class SignLanguage implements QuackBehavior {

	// ******************************
	// Public methods
	// ******************************

	@Override
	public void quack() {
		System.out.println("🤟");
	}

}
