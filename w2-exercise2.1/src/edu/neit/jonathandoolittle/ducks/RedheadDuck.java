package edu.neit.jonathandoolittle.ducks;

import edu.neit.jonathandoolittle.behaviors.FlyWithWings;
import edu.neit.jonathandoolittle.behaviors.Quack;

/**
 * A redhead duck, common all across North America!
 *      __     
 *    <(0 )_________ 
 *     ( ._______> / 
 *      `---------'  
 *      
 * <pre>
 *  Duck duck = new RedheadDuck();
 *  duck.display();
 *  duck.squeak();
 *  duck.fly();
 * </pre>
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Jul 27, 2021
 *
 */
public class RedheadDuck extends Duck {
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new RubberDuck instance
	 */
	public RedheadDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	// ******************************
	// Public methods
	// ******************************
	
	@Override
	public void display() {
		System.out.println("Wow! A redhead duck!");
	}
}
