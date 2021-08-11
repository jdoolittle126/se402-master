package edu.neit.jonathandoolittle;

/**
 * This factory creates large dogs!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 10, 2021
 *
 */
public class LargeDogFactory extends DogFactory {
	
	// ******************************
	// Overrides
	// ******************************
	
	@Override
	protected Dog buildDog(String breed) {
		
		switch(breed.toLowerCase()) {
			case "bernese mountain dog":
				return new BerneseMountainDog();
			case "bloodhound":
				return new Bloodhound();
			case "saint bernard":
				return new SaintBernard();
			default:
				return null;
		}
		
	}

}
