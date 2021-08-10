package edu.neit.jonathandoolittle.builders;

import edu.neit.jonathandoolittle.Alien;
import edu.neit.jonathandoolittle.parts.arms.AlienArms;
import edu.neit.jonathandoolittle.parts.body.AlienBody;
import edu.neit.jonathandoolittle.parts.ears.AlienEars;
import edu.neit.jonathandoolittle.parts.eyes.AlienEyes;
import edu.neit.jonathandoolittle.parts.feet.AlienFeet;
import edu.neit.jonathandoolittle.parts.head.AlienHead;
import edu.neit.jonathandoolittle.parts.mouth.AlienMouth;
import edu.neit.jonathandoolittle.parts.nose.AlienNose;

/**
 * 
 * Builds an alien using all default parts.
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 9, 2021
 *
 */
public abstract class AlienBuilder {

	// ******************************
	// Variables
	// ******************************

	Alien alien;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new AlienBuilder instance
	 */
	protected AlienBuilder() {
		buildAlien();
	}

	// ******************************
	// Public methods
	// ******************************

	/**
	 * Creates a new Alien
	 */
	public void buildAlien() {
		alien = new Alien();
	}
	
	/**
	 * Adds a body to the alien
	 */
	public void buildBody() {
		alien.body = new AlienBody();
	}
	
	/**
	 * Adds ears to the alien
	 */
	public void buildEars() {
		alien.ears = new AlienEars();
	}
	
	/**
	 * Adds eyes to the alien
	 */
	public void buildEyes() {
		alien.eyes = new AlienEyes();
	}
	
	/**
	 * Adds feet to the alien
	 */
	public void buildFeet() {
		alien.feet = new AlienFeet();
	}
	
	/**
	 * Adds a head to the alien
	 */
	public void buildHead() {
		alien.head = new AlienHead();
	}
	
	/**
	 * Adds a mouth to the alien
	 */
	public void buildMouth() {
		alien.mouth = new AlienMouth();
	}
	
	/**
	 * Adds arms to the alien
	 */
	public void buildArms() {
		alien.arms = new AlienArms();
	}
	
	/**
	 * Adds a nose to the alien
	 */
	public void buildNose() {
		alien.nose = new AlienNose();
	}
	
	/**
	 * @return The alien
	 */
	public Alien getAlien() {
		return alien;
	}
	
}
