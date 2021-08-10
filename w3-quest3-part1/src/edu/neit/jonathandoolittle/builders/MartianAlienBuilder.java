package edu.neit.jonathandoolittle.builders;

import edu.neit.jonathandoolittle.parts.arms.MartianAlienArms;
import edu.neit.jonathandoolittle.parts.body.MartianAlienBody;
import edu.neit.jonathandoolittle.parts.ears.MartianAlienEars;
import edu.neit.jonathandoolittle.parts.eyes.MartianAlienEyes;
import edu.neit.jonathandoolittle.parts.feet.MartianAlienFeet;
import edu.neit.jonathandoolittle.parts.head.MartianAlienHead;
import edu.neit.jonathandoolittle.parts.mouth.MartianAlienMouth;
import edu.neit.jonathandoolittle.parts.nose.MartianAlienNose;

/**
 * Builds aliens specific to Mars
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 9, 2021
 *
 */
public class MartianAlienBuilder extends AlienBuilder {
	
	// ******************************
	// Overrides
	// ******************************

	@Override
	public void buildBody() {
		alien.body = new MartianAlienBody();
	}

	@Override
	public void buildEars() {
		alien.ears = new MartianAlienEars();
	}

	@Override
	public void buildEyes() {
		alien.eyes = new MartianAlienEyes();
	}

	@Override
	public void buildFeet() {
		alien.feet = new MartianAlienFeet();
	}

	@Override
	public void buildHead() {
		alien.head = new MartianAlienHead();
	}

	@Override
	public void buildMouth() {
		alien.mouth = new MartianAlienMouth();
	}

	@Override
	public void buildArms() {
		alien.arms = new MartianAlienArms();
	}

	@Override
	public void buildNose() {
		alien.nose = new MartianAlienNose();
	}
	
}
