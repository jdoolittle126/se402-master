package edu.neit.jonathandoolittle;

/**
 * Builds a BrandNewCar using builder pattern
 *
 * <pre>
 * 		MidSizeCarBuilder midSizeCarBuilder = new MidSizeCarBuilder();
 *  	midSizeCarBuilder.buildBrandNewCar();
 *		midSizeCarBuilder.setCarName();
 *		midSizeCarBuilder.buildChassis();
 *		midSizeCarBuilder.buildBody();
 * </pre>
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 4, 2021
 *
 */
abstract class MidSizeCarBuilder {

	// ******************************
	// Variables
	// ******************************

	BrandNewCar brandNewCar;
	

	// ******************************
	// Public methods
	// ******************************

	/**
	 * Returns the newly-created car
	 */
	public BrandNewCar getBrandNewCar() {
		return brandNewCar;
	}
	
	/**
	 * Initializes a new car to be built
	 */
	public void buildBrandNewCar() {
		brandNewCar = new BrandNewCar();
	}
	
	/**
	 * Sets this car's name
	 */
	public abstract void setCarName();
	
	/**
	 * Adds a chassis to the new car
	 */
	public void buildChassis() {
		brandNewCar.chassis = new Chassis();
	}
	
	/**
	 * Adds a body to the new car
	 */
	public void buildBody() {
		brandNewCar.body= new Body(); 
		
	}
}
