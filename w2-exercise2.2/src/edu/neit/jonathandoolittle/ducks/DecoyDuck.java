package edu.neit.jonathandoolittle.ducks;

import edu.neit.jonathandoolittle.behaviors.FlyNoWay;
import edu.neit.jonathandoolittle.behaviors.MuteQuack;

/**
 * A decoy duck! Looks so real, you would never know!
 *      __     
 *    <(- )___ 
 *     ( ._> / 
 *      `---'  
 *      
 * <pre>
 *  Duck duck = new DecoyDuck();
 *  duck.display();
 *  duck.squeak();
 *  duck.fly();
 * </pre>
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Jul 27, 2021
 *
 */
public class DecoyDuck extends Duck {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new DecoyDuck instance
	 */
	public DecoyDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}
	
	// ******************************
	// Public methods
	// ******************************
	
	@Override
	public void display() {
		System.out.println("Is that duck real? Or just a decoy?");
	}
}
