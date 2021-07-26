package edu.neit.jonathandoolittle;

/**
 * 
 * Boat class for interface demo
 * 
 * <pre> 
 *    Boat boat = new Boat();
 *    boat.drive();
 * </pre>
 *sa
 * @author Jonathan Doolittle
 * @version 0.1 - Jul 24, 2021
 *
 */

public class Boat implements Vehicle {

	@Override
	public void drive() {
		System.out.println("Drive on water!");
	}
	
}