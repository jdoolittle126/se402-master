package edu.neit.jonathandoolittle.behaviors;

/**
 * MuteQuack is a {@link QuackBehavior} that represents the creature
 * unfortunately having no vocal abilities
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Jul 27, 2021
 *
 */
public class MuteQuack implements QuackBehavior {

	// ******************************
	// Public methods
	// ******************************
	
	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}

}
