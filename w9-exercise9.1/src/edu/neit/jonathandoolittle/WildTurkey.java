package edu.neit.jonathandoolittle;

/**
 * 
 * A wild turkey, who makes lots
 * of noise!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 20, 2021
 *
 */
public class WildTurkey implements Turkey {
	
	// ******************************
	// Overrides
	// ******************************

	@Override
	public void gobble() {
		System.out.println("Gobble Gobble!");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying a short distance!");	
	}

}
