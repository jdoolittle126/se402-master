package edu.neit.jonathandoolittle.ducks;

import edu.neit.jonathandoolittle.behaviors.FlyRocketPowered;
import edu.neit.jonathandoolittle.behaviors.MuteQuack;

/**
 * A model duck, 12x the scale of a normal duck!
 *      __     
 *    <(O )___________ 
 *     ( ._________> / 
 *      `-----------'  
 *      
 * <pre>
 *  Duck duck = new ModelDuck();
 *  duck.display();
 *  duck.squeak();
 *  duck.fly();
 * </pre>
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Jul 27, 2021
 *
 */
public class ModelDuck extends Duck {
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new ModelDuck instance
	 */
	public ModelDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyRocketPowered();
	}
	
	// ******************************
	// Public methods
	// ******************************
	
	@Override
	public void display() {
		System.out.println("That sure is one large model duck.");
	}
}
