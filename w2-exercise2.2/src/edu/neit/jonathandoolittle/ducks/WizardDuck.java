package edu.neit.jonathandoolittle.ducks;

import edu.neit.jonathandoolittle.behaviors.FlyTeleport;
import edu.neit.jonathandoolittle.behaviors.SignLanguage;

/**
 * A wizard duck, who can teleport!!
 * *poof*
 *   *   __     
 *   * <(. )_____ 
 *      ( .___> / 
 *       `-----'  
 *      
 * <pre>
 *  Duck duck = new WizardDuck();
 *  duck.display();
 *  duck.squeak();
 *  duck.fly();
 * </pre>
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Jul 30, 2021
 *
 */
public class WizardDuck extends Duck {
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new WizardDuck instance
	 */
	public WizardDuck() {
		quackBehavior = new SignLanguage();
		flyBehavior = new FlyTeleport();
	}
	
	// ******************************
	// Public methods
	// ******************************
	
	@Override
	public void display() {
		System.out.println("poof! a wizard duck!");
	}
}
