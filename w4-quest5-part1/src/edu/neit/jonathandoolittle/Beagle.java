package edu.neit.jonathandoolittle;

/**
 * The beagle is a breed of small scent hound, 
 * similar in appearance to the much larger foxhound. 
 * The beagle was developed primarily for hunting hare.
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 10, 2021
 * @see Dog
 */
public class Beagle extends Dog {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new Beagle instance
	 */
	public Beagle() {
		breed = "Beagle";
		bark = "bork bork bork";
		size = "small";
		color = "white and brown";
	}
	
}
