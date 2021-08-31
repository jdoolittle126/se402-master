package edu.neit.jonathandoolittle;

/**
 * Builds a Lexus ES 300 using builder pattern,
 * updated to act as a singleton
 *
 * @author Jonathan Doolittle
 * @version 0.2 - Aug 17, 2021
 *
 */
public class LexusES300Builder extends MidSizeCarBuilder {
	
	private static LexusES300Builder lexusES300BuilderSingleton;
	
	// ******************************
	// Public Methods
	// ******************************
	
	/**
	 * Returns the global LexusES300Builder, or creates one 
	 * if one does not exist.
	 * @return The global LexusES300Builder
	 */
	public static LexusES300Builder getInstance() {
		if(lexusES300BuilderSingleton == null) {
			lexusES300BuilderSingleton = new LexusES300Builder();
		}
		return lexusES300BuilderSingleton;
	}
	
	// ******************************
	// Constructor
	// ******************************
	
	/**
	 * Creates a new LexusES300Builder instance
	 */
	private LexusES300Builder() {
		
	}

	// ******************************
	// Overrides
	// ******************************

	@Override
	public void setCarName() {
		brandNewCar.carName = "Lexus ES-300";
	}

}
