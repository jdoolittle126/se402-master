package edu.neit.jonathandoolittle;

/**
 * The Jack Russell Terrier is a small terrier 
 * that has its origins in fox hunting in England. 
 * It is principally white-bodied and smooth, rough or 
 * broken-coated and can be any colour. 
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 10, 2021
 * @see Dog
 */
public class JackRussellTerrier extends Dog {

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new JackRussellTerrier instance
	 */
	public JackRussellTerrier() {
		breed = "Jack Russell Terrier";
		bark = "wOOf woof woof woof woof";
		size = "small";
		color = "white and brown";
	}
	
}
