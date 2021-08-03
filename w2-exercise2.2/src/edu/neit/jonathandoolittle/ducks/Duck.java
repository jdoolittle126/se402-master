package edu.neit.jonathandoolittle.ducks;

import edu.neit.jonathandoolittle.behaviors.FlyBehavior;
import edu.neit.jonathandoolittle.behaviors.QuackBehavior;

/**
 * 
 * An abstract template for a duck, which has the abilities to 
 * fly, quack, and swim, as well as be displayed to the user
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Jul 27, 2021
 *
 */

public abstract class Duck {

	// ******************************
	// Variables
	// ******************************

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new Duck instance
	 */
	public Duck() {

	}

	// ******************************
	// Public methods
	// ******************************

	/**
	 * Displays this duck
	 */
	public abstract void display();
	
	/**
	 * Triggers this duck to quack
	 */
	public void performQuack() {
		quackBehavior.quack();
	}
	
	/**
	 * Triggers this duck to fly
	 */
	public void performFly() {
		flyBehavior.fly();
	}
	
	/**
	 * Triggers this duck to swim
	 */
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}

	/**
	 * @param flyBehavior The new fly behavior for this Duck
	 */
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	/**
	 * @param quackBehavior The new quack behavior for this Duck
	 */
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
}
