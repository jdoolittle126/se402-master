package edu.neit.jonathandoolittle;

/**
 * 
 * A diner that illustrates the need for 
 * an iterator.
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 20, 2021
 *
 */
public class DinerMenu1 {

	// ******************************
	// Variables
	// ******************************
	
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
  
	// ******************************
	// Constructors
	// ******************************
	
	/**
	 * Creates a new DinerMenu1 instance
	 */
	public DinerMenu1() {
		menuItems = new MenuItem[MAX_ITEMS];
 
		addItem("Vegetarian BLT",
				"(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
		
		addItem("BLT",
				"Bacon with lettuce & tomato on whole wheat", false, 2.99);
		
		addItem("Soup of the day",
				"Soup of the day, with a side of potato salad", false, 3.29);
		
		addItem("Hotdog", 
				"A hot dog, with sauerkraut, relish, onions, topped with cheese", false, 3.05);
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
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
 
	/**
	 * @return All of the menu items
	 */
	public MenuItem[] getMenuItems() {
		return menuItems;
	}
  
}
