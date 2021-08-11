package edu.neit.jonathandoolittle;

import java.util.Scanner;

/**
 * An abstract factory to create a type of dog!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 10, 2021
 *
 */
public abstract class DogFactory {
	
	// ******************************
	// Variables
	// ******************************
	
	Scanner scanner;
	
	// ******************************
	// Constructors
	// ******************************
	
	/** Creates a new DogFactory instance
	 */
	protected DogFactory() {
		scanner = new Scanner(System.in);
	}
	
	// ******************************
	// Public methods
	// ******************************
	
	/**
	 * Adopt a new dog! You pick the breed!
	 * @param breed The breed of dog to adopt
	 * @return The dog you adopted
	 */
	public Dog adoptDog(String breed) {
		Dog dog = buildDog(breed);
		
		System.out.print("We hope you love your new " + dog.breed + "! What are you going to name them?\n> ");
		dog.name = scanner.nextLine();
		dog.bark();
		dog.walk();
		return dog;
	}

	// ******************************
	// Protected methods
	// ******************************
	
	/**
	 * Creates a dog based on the breed
	 * @param breed The breed of dog
	 * @return The new dog
	 */
	protected abstract Dog buildDog(String breed);

	
}
