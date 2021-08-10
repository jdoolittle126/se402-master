package edu.neit.jonathandoolittle.builders;

import edu.neit.jonathandoolittle.parts.arms.NeptunianAlienArms;
import edu.neit.jonathandoolittle.parts.body.NeptunianAlienBody;
import edu.neit.jonathandoolittle.parts.ears.NeptunianAlienEars;
import edu.neit.jonathandoolittle.parts.eyes.NeptunianAlienEyes;
import edu.neit.jonathandoolittle.parts.feet.NeptunianAlienFeet;
import edu.neit.jonathandoolittle.parts.head.NeptunianAlienHead;
import edu.neit.jonathandoolittle.parts.mouth.NeptunianAlienMouth;
import edu.neit.jonathandoolittle.parts.nose.NeptunianAlienNose;

/**
 * Builds aliens specific to Neptune
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 9, 2021
 *
 */
public class NeptunianAlienBuilder extends AlienBuilder {
	
	// ******************************
	// Overrides
	// ******************************

	@Override
	public void buildBody() {
		alien.body = new NeptunianAlienBody();
	}

	@Override
	public void buildEars() {
		alien.ears = new NeptunianAlienEars();
	}

	@Override
	public void buildEyes() {
		alien.eyes = new NeptunianAlienEyes();
	}

	@Override
	public void buildFeet() {
		alien.feet = new NeptunianAlienFeet();
	}

	@Override
	public void buildHead() {
		alien.head = new NeptunianAlienHead();
	}

	@Override
	public void buildMouth() {
		alien.mouth = new NeptunianAlienMouth();
	}

	@Override
	public void buildArms() {
		alien.arms = new NeptunianAlienArms();
	}

	@Override
	public void buildNose() {
		alien.nose = new NeptunianAlienNose();
	}
	
}
