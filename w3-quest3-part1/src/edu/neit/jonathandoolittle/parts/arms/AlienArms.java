package edu.neit.jonathandoolittle.parts.arms;

import edu.neit.jonathandoolittle.parts.AlienPart;

/**
 * Represents generic {@link Alien} arms. Contains 4 little hands,
 * great for multitasking
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 7, 2021
 *
 */
public class AlienArms extends AlienPart {

	// ******************************
	// Constructors
	// ******************************

	public AlienArms() {
		init("arms-3", 10, 13, 2);
	}
}
