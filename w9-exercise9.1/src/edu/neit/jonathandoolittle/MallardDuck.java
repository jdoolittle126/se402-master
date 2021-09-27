package edu.neit.jonathandoolittle;

/**
 *  A mallard duck, with nice colors!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 20, 2021
 *
 */
public class MallardDuck implements Duck {

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public void quack() {
		System.out.println("Quack!");
		
	}

	@Override
	public void fly() {
		System.out.println("I'm flying!");
	}

}
