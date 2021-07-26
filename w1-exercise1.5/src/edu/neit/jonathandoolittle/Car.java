package edu.neit.jonathandoolittle;

/**
 * 
 * Car class for interface demo
 * 
 * <pre> 
 *    Car car = new Car();
 *    car.drive();
 * </pre>
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Jul 24, 2021
 *
 */

public class Car implements Vehicle {

	@Override
	public void drive() {
		System.out.println("Drive on land!");
	}
	
}
