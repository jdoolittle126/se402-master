package edu.neit.jonathandoolittle.ducks;

import edu.neit.jonathandoolittle.behaviors.FlyNoWay;
import edu.neit.jonathandoolittle.behaviors.Squeak;

/**
 * A rubber duck, just like the ones you would find in your bathtub!
 *      __     
 *    <(o )_____ 
 *     ( .___> / 
 *      `-----'  
 *      
 * <pre>
 *  Duck duck = new RubberDuck();
 *  duck.display();
 *  duck.squeak();
 *  duck.fly();
 * </pre>
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Jul 27, 2021
 *
 */
public class RubberDuck extends Duck {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new RubberDuck instance
	 */
	public RubberDuck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}
	
	// ******************************
	// Public methods
	// ******************************
	
	@Override
	public void display() {
		System.out.println("A rubber duck just floated by!");
	}

}
