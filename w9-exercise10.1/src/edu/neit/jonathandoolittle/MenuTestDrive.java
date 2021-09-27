package edu.neit.jonathandoolittle;

/**
 * 
 * Driver for exercise 10.1
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 20, 2021
 *
 */
public class MenuTestDrive {

	public static void main(String[] args) {
		
		DinerMenu2 dinerMenu = new DinerMenu2();
		PancakeHouseMenu pancakeMenu = new PancakeHouseMenu();
		
		Waitress2 alice = new Waitress2(pancakeMenu, dinerMenu);
		alice.printMenu();
	}

}
