package edu.neit.jonathandoolittle;

/**
 * 
 * Provides a way to use turkey objects as 
 * ducks!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 20, 2021
 *
 */
public class TurkeyAdapter implements Duck {

	// ******************************
	// Variables
	// ******************************

	Turkey turkey;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new TurkeyAdapter instance
	 * @param turkey
	 */
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		for(int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}
}
