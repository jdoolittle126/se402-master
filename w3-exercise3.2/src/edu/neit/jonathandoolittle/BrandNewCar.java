package edu.neit.jonathandoolittle;

/**
 * Represents a new car. Created to test the {@link MidSizeCarBuilder}.
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 4, 2021
 *
 */
public class BrandNewCar {

	// ******************************
	// Variables
	// ******************************

	String carName;
	Chassis chassis;
	Body body;

	// ******************************
	// Public methods
	// ******************************

	/**
	 * @return This car's name
	 */
	public String getCarName() {
		return this.carName;
	}

	/**
	 * Provides a string of specifications for this car
	 * @return The specifications string
	 */
	public String getCarSpecs() {
		StringBuilder sb = new StringBuilder();
		sb.append("Today's car -> ");
		sb.append("Specification: ");
		sb.append(this.chassis.getPartId() + ", ");
		sb.append(this.body.getPartId() + ", ");
		return sb.toString();	
	}
	
}
