package edu.neit.jonathandoolittle;

/**
 * Represents man's best friend! Each dog has a breed, color,
 * a name, size, and a bark!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 10, 2021
 *
 */
public abstract class Dog {

	// ******************************
	// Variables
	// ******************************

	String name;
	String color;
	String size;
	String bark;
	String breed;

	// ******************************
	// Public methods
	// ******************************
	
	/**
	 * Take this dog for a walk!
	 */
	public void walk() {
		System.out.println(String.format("Taking %s, the %s %s %s, out for a walk!", name, size, color, breed));
	}
	

	/**
	 * Make this dog bark!
	 */
	public void bark() {
		System.out.println(String.format("%s says: %s", name, bark));
	}
	
	/**
	 * @return This Dog's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return This Dog's color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @return This Dog's size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @return This Dog's bark
	 */
	public String getBark() {
		return bark;
	}

	/**
	 * @return This Dog's breed
	 */
	public String getBreed() {
		return breed;
	}
	
}
