package edu.neit.jonathandoolittle.parts.arms;

/**
 * Represents the arms of an {@link Alien} from Mars. Neptunian aliens have robotic
 * like arms with high attack power.
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 9, 2021
 *
 */
public class NeptunianAlienArms extends AlienArms {

	// ******************************
	// Constructors
	// ******************************

	public NeptunianAlienArms() {
		init("arms-2", 5, 20, 1);
	}
}
