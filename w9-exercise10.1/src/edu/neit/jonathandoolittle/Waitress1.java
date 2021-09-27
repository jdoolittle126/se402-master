package edu.neit.jonathandoolittle;

import java.util.ArrayList;

/**
 * 
 * A poor waitress who much use copy and
 * pasted for loops to display all of the 
 * menus
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 20, 2021
 *
 */
public class Waitress1 {

	// ******************************
	// Variables
	// ******************************
	
	PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
	ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
	
	DinerMenu1 dinerMenu = new DinerMenu1();
	MenuItem[] lunchItems = dinerMenu.getMenuItems();
	
	// ******************************
	// Public methods
	// ******************************
	
	void printMenu() {
		for(int i = 0; i < breakfastItems.size(); i++) {
			MenuItem item = breakfastItems.get(i);
			System.out.format("%s - $%.2f | %s%n", item.getName(), item.getPrice(), item.getDescription());
		}
		
		for(int i = 0; i < lunchItems.length; i++) {
			MenuItem item = lunchItems[i];
			System.out.format("%s - $%.2f | %s%n", item.getName(), item.getPrice(), item.getDescription());
		}
		
	}
	
	void printBreakfastMenu() {}
	void printLunchMenu() {}
	void printVegetarianMenu() {}
	boolean isItemVegetarian(String name) {return false; }

}
