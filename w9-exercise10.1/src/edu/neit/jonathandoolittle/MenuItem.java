package edu.neit.jonathandoolittle;

/**
 * A simple menu item for our restaurant
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 20, 2021
 *
 */
public class MenuItem {

	// ******************************
	// Variables
	// ******************************
	
	String name;
	String description;
	boolean vegetarian;
	double price;
 
	// ******************************
	// Constructors
	// ******************************
	
	/**
	 * Creates a new MenuItem instance
	 * @param name The item name
	 * @param description The item description
	 * @param vegetarian True, if this item is a vegetarian options
	 * @param price The price of this item
	 */
	public MenuItem(String name, String description, boolean vegetarian, double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
  
	// ******************************
	// Accessors
	// ******************************
	
	/**
	 * @return The name of this item
	 */
	public String getName() {
		return name;
	}
  
	/**
	 * @return The description of this item
	 */
	public String getDescription() {
		return description;
	}
  
	/**
	 * @return The price of this item
	 */
	public double getPrice() {
		return price;
	}
  
	/**
	 * @return True, if this item is vegetarian
	 */
	public boolean isVegetarian() {
		return vegetarian;
	}
	
	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public String toString() {
		return (name + ", $" + price + "\n   " + description);
	}
}
