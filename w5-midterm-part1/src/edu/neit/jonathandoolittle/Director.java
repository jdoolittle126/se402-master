package edu.neit.jonathandoolittle;

/**
 * Driver for midterm part 2
 *
 * @author Jonathan Doolittle
 * @version 0.2 - Aug 17, 2021
 *
 */
public class Director {

	public static void main(String[] args) {
		
		System.out.println("Singleton Test:");
		System.out.println("Memory Address:" + LexusES300Builder.getInstance().toString());
		LexusES300Builder builder = LexusES300Builder.getInstance();
		System.out.println("Memory Address:" + builder.toString());
		
		
		BrandNewCar lexus = buildCar(builder);
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
