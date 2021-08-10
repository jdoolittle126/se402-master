package edu.neit.jonathandoolittle.parts.arms;

/**
 * Represents the arms of an {@link Alien} from Mars. Mars aliens do not have
 * arms, and therefore this represents a lack of arms.
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 9, 2021
 *
 */
public class MartianAlienArms extends AlienArms {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new MartianAlienArms instance
	 */
	public MartianAlienArms() {
		init("arms-1", 0, 0, 0);
	}

}
