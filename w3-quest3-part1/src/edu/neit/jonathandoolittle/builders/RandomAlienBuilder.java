package edu.neit.jonathandoolittle.builders;

import java.util.Random;

import edu.neit.jonathandoolittle.parts.*;
import edu.neit.jonathandoolittle.parts.arms.AlienArms;
import edu.neit.jonathandoolittle.parts.arms.MartianAlienArms;
import edu.neit.jonathandoolittle.parts.arms.NeptunianAlienArms;
import edu.neit.jonathandoolittle.parts.body.AlienBody;
import edu.neit.jonathandoolittle.parts.body.MartianAlienBody;
import edu.neit.jonathandoolittle.parts.body.NeptunianAlienBody;
import edu.neit.jonathandoolittle.parts.ears.AlienEars;
import edu.neit.jonathandoolittle.parts.ears.MartianAlienEars;
import edu.neit.jonathandoolittle.parts.ears.NeptunianAlienEars;
import edu.neit.jonathandoolittle.parts.eyes.AlienEyes;
import edu.neit.jonathandoolittle.parts.eyes.MartianAlienEyes;
import edu.neit.jonathandoolittle.parts.eyes.NeptunianAlienEyes;
import edu.neit.jonathandoolittle.parts.feet.AlienFeet;
import edu.neit.jonathandoolittle.parts.feet.MartianAlienFeet;
import edu.neit.jonathandoolittle.parts.feet.NeptunianAlienFeet;
import edu.neit.jonathandoolittle.parts.head.AlienHead;
import edu.neit.jonathandoolittle.parts.head.MartianAlienHead;
import edu.neit.jonathandoolittle.parts.head.NeptunianAlienHead;
import edu.neit.jonathandoolittle.parts.mouth.AlienMouth;
import edu.neit.jonathandoolittle.parts.mouth.MartianAlienMouth;
import edu.neit.jonathandoolittle.parts.mouth.NeptunianAlienMouth;
import edu.neit.jonathandoolittle.parts.nose.AlienNose;
import edu.neit.jonathandoolittle.parts.nose.MartianAlienNose;
import edu.neit.jonathandoolittle.parts.nose.NeptunianAlienNose;

/**
 * Builds random aliens
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 9, 2021
 *
 */
public class RandomAlienBuilder extends AlienBuilder {
	
	// ******************************
	// Variables
	// ******************************
	
	private Random random;
	
	// ******************************
	// Constructors
	// ******************************
	
	/** 
	 * Creates a new RandomAlienBuilder instance
	 */
	public RandomAlienBuilder() {
		random = new Random();
	}
	
	// ******************************
	// Overrides
	// ******************************

	@Override
	public void buildBody() {
		alien.body = randomPartPicker(new AlienBody(), new MartianAlienBody(), new NeptunianAlienBody());
	}

	@Override
	public void buildEars() {
		alien.ears = randomPartPicker(new AlienEars(), new MartianAlienEars(), new NeptunianAlienEars());
	}

	@Override
	public void buildEyes() {
		alien.eyes = randomPartPicker(new AlienEyes(), new MartianAlienEyes(), new NeptunianAlienEyes());
	}

	@Override
	public void buildFeet() {
		alien.feet = randomPartPicker(new AlienFeet(), new MartianAlienFeet(), new NeptunianAlienFeet());
	}

	@Override
	public void buildHead() {
		alien.head = randomPartPicker(new AlienHead(), new MartianAlienHead(), new NeptunianAlienHead());
	}

	@Override
	public void buildMouth() {
		alien.mouth = randomPartPicker(new AlienMouth(), new MartianAlienMouth(), new NeptunianAlienMouth());
	}

	@Override
	public void buildArms() {
		alien.arms = randomPartPicker(new AlienArms(), new MartianAlienArms(), new NeptunianAlienArms());
	}

	@Override
	public void buildNose() {
		alien.nose = randomPartPicker(new AlienNose(), new MartianAlienNose(), new NeptunianAlienNose());
	}
	
	// ******************************
	// Private methods
	// ******************************
	
	/**
	 * Picks a random part from the given options
	 * @param <T> The type of part
	 * @param a Option #1
	 * @param b Option #2
	 * @param c Option #3
	 * @return A random option
	 */
	private <T extends AlienPart> T randomPartPicker(T a, T b, T c) {
		switch(random.nextInt(3)) {
			case 1: return a;
			case 2: return b;
			default: return c;
		}
	}
}
