package edu.neit.jonathandoolittle;

/**
 * Builds a Lexus ES 300 using builder pattern
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 4, 2021
 *
 */
public class LexusES300Builder extends MidSizeCarBuilder {

	// ******************************
	// Overrides
	// ******************************

	@Override
	public void setCarName() {
		brandNewCar.carName = "Lexus ES-300";
	}


}
