package edu.neit.jonathandoolittle;

/**
 * Represents a basic car part. Uniquely identifies parts using a partId
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 4, 2021
 *
 */
abstract class Part {

	// ******************************
	// Variables
	// ******************************

	String partId;
	

	// ******************************
	// Public methods
	// ******************************

	/**
	 * @return This part's ID
	 */
	public String getPartId() {
		return this.partId;
	}
	
}
