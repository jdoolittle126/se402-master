package edu.neit.jonathandoolittle;

import java.util.LinkedList;
import java.util.List;

import edu.neit.jonathandoolittle.parts.AlienPart;
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
 * Represents an other-worldly creature. 
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 7, 2021
 *
 */
public class Alien {

	// ******************************
	// Variables
	// ******************************

	// For simplicity, I am going with public over getters/setters
	public AlienArms arms;
	public AlienBody body;
	public AlienEars ears;
	public AlienEyes eyes;
	public AlienHead head;
	public AlienMouth mouth;
	public AlienNose nose;
	public AlienFeet feet;

	// ******************************
	// Public methods
	// ******************************

	/**
	 * @return A List of this alien's parts, in the order they should be rendered
	 */
	public List<AlienPart> getParts() {
		List<AlienPart> parts = new LinkedList<>();
		// Add parts in order they should be drawn
		parts.add(body);
		parts.add(feet);
		parts.add(ears);
		parts.add(head);
		parts.add(eyes);
		parts.add(nose);
		parts.add(mouth);
		parts.add(arms);
		return parts;
	}
	
	/**
	 * Gets this Alien's statistics
	 * @return A string of the statistics
	 */
	public String getStats() {
		int healthPoints = 0;
		int attackPoints = 0;
		int speedPoints = 0;
		
		for(AlienPart p : getParts()) {
			healthPoints += p.getHealthPoints();
			attackPoints += p.getAttackPoints();
			speedPoints += p.getSpeedPoints();
		}
		
		return String.format("STATS: Health: %d  Attack: %d  Speed: %d", healthPoints, attackPoints, speedPoints);
	}
	
}
