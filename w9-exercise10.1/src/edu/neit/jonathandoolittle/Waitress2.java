package edu.neit.jonathandoolittle;

/**
 * 
 * A waitress who takes full advantage of the
 * iterator pattern
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 20, 2021
 *
 */
public class Waitress2 {

	// ******************************
	// Variables
	// ******************************
	
	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu2 dinerMenu;
	
	// ******************************
	// Constructor
	// ******************************
	
	/**
	 * Creates a new Waitress2 instance
	 * @param pancakeHouseMenu The menu from Pancake House
	 * @param dinerMenu The menu from a Diner
	 */
	public Waitress2(PancakeHouseMenu pancakeHouseMenu, DinerMenu2 dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
				
	}
	
	// ******************************
	// Public methods
	// ******************************
	
	void printMenu() {
		System.out.println("MENU\n------------");
		Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
		Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
		
		System.out.println("Breakfast Menu:");
		printMenu(pancakeIterator);
		System.out.println("Lunch Menu:");
		printMenu(dinerIterator);
		
	}
	
	void printMenu(Iterator<MenuItem> it) {
		
		while(it.hasNext()) {
			MenuItem item = it.next();
			System.out.format("%s - $%.2f | %s%n", item.getName(), item.getPrice(), item.getDescription());
		}
		
	}
	
	void printBreakfastMenu() {}
	void printLunchMenu() {}
	void printVegetarianMenu() {}
	boolean isItemVegetarian(String name) {return false; }
}
