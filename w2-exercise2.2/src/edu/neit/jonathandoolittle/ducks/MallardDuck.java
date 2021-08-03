package edu.neit.jonathandoolittle.ducks;

import edu.neit.jonathandoolittle.behaviors.FlyWithWings;
import edu.neit.jonathandoolittle.behaviors.Quack;

/**
 * A mallard duck, found all across the world!
 *      __     
 *    >(u )_______ 
 *     ( ._____> / 
 *      `-------'  
 *      
 * <pre>
 *  Duck duck = new MallardDuck();
 *  duck.display();
 *  duck.squeak();
 *  duck.fly();
 * </pre>
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Jul 27, 2021
 *
 */
public class MallardDuck extends Duck {
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new MallardDuck instance
	 */
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	// ******************************
	// Public methods
	// ******************************
	
	@Override
	public void display() {
		System.out.println("Wow! A mallard duck!");
	}
}