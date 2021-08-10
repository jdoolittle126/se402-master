package edu.neit.jonathandoolittle;

/**
 * Driver for exercise 3.2
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 4, 2021
 *
 */
public class Director {

	public static void main(String[] args) {
		
		BrandNewCar lexus = buildCar(new LexusES300Builder());
		System.out.println(String.format("Newly Built Car: %s.%n%s", 
							lexus.getCarName(), 
							lexus.getCarSpecs()));
	}
	
	/**
	 * Builds a new car object based off of the given {@link MidSizeCarBuilder}
	 * @param midSizeCarBuilder The builder to use for this car
	 * @return The new car
	 */
	public static BrandNewCar buildCar(MidSizeCarBuilder midSizeCarBuilder) {
		midSizeCarBuilder.buildBrandNewCar();
		midSizeCarBuilder.setCarName();
		midSizeCarBuilder.buildChassis();
		midSizeCarBuilder.buildBody();
		return midSizeCarBuilder.getBrandNewCar();
	}
}
