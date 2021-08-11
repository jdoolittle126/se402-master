package edu.neit.jonathandoolittle;

/**
 * This factory creates small dogs!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 10, 2021
 *
 */
public class SmallDogFactory extends DogFactory {
	
	// ******************************
	// Overrides
	// ******************************
	
	@Override
	protected Dog buildDog(String breed) {
		
		switch(breed.toLowerCase()) {
			case "jack russell terrier":
				return new JackRussellTerrier();
			case "chihuahua":
				return new Chihuahua();
			case "beagle":
				return new Beagle();
			default:
				return null;
		}
		
	}

}
