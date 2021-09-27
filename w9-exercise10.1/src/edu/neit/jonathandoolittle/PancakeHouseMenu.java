package edu.neit.jonathandoolittle;

import java.util.ArrayList;

/**
 * 
 * A menu for the pancake house
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 20, 2021
 *
 */
public class PancakeHouseMenu {

	// ******************************
	// Variables
	// ******************************
	
	ArrayList<MenuItem> menuItems;
	 
	// ******************************
	// Constructors
	// ******************************
	
	/**
	 * Creates a new PancakeHouseMenu instance
	 */
	public PancakeHouseMenu() {
		menuItems = new ArrayList<>();
    
		addItem("K&B's Pancake Breakfast", 
			"Pancakes with scrambled eggs and toast", 
			true,
			2.99);
 
		addItem("Regular Pancake Breakfast", 
			"Pancakes with fried eggs, sausage", 
			false,
			2.99);
 
		addItem("Blueberry Pancakes",
			"Pancakes made with fresh blueberries",
			true,
			3.49);
 
		addItem("Waffles",
			"Waffles with your choice of blueberries or strawberries",
			true,
			3.59);
	}

	// ******************************
	// Public methods
	// ******************************
	
	/**
	 * Adds an item to the menu
	 * @param name The item name
	 * @param description The item description
	 * @param vegetarian True, if this item is a vegetarian options
	 * @param price The price of this item
	 */
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
 
	/**
	 * @return An iterator the items of this location's menu
	 */
	public Iterator<MenuItem> createIterator() {
		return new PancakeHouseMenuIterator(menuItems);
	}
	
	/**
	 * @return All of the menu items
	 */
	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}
  
}
