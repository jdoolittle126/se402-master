package edu.neit.jonathandoolittle;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * Driver for quest 5
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 10, 2021
 *
 */
public class Main {

	public static void main(String[] args) {

		List<Dog> adoptedLargeDogs = new LinkedList<>();
		List<Dog> adoptedSmallDogs = new LinkedList<>();
		
		
		DogFactory largeDogFactory = new LargeDogFactory();
		DogFactory smallDogFactory = new SmallDogFactory();
		
		adoptedLargeDogs.add(largeDogFactory.adoptDog("saint bernard"));
		adoptedLargeDogs.add(largeDogFactory.adoptDog("bernese mountain dog"));
		adoptedLargeDogs.add(largeDogFactory.adoptDog("bloodhound"));
		adoptedSmallDogs.add(smallDogFactory.adoptDog("jack russell terrier"));
		adoptedSmallDogs.add(smallDogFactory.adoptDog("chihuahua"));
		adoptedSmallDogs.add(smallDogFactory.adoptDog("beagle"));
		
		
	}
	
}
