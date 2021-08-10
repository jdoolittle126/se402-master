package edu.neit.jonathandoolittle.parts.nose;

import edu.neit.jonathandoolittle.parts.AlienPart;

/**
 * Represents a generic {@link Alien} nose. This large sniffer gives the 
 * creature exceptional aerodynamics
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 7, 2021
 *
 */
public class AlienNose extends AlienPart {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new AlienNose instance
	 */
	public AlienNose() {
		init("nose-1", 2, 0, 5);
	}
}
