package edu.neit.jonathandoolittle;

/**
 * 
 * Car class for abstract class demo
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

public class Car extends Vehicle {

	@Override
	public void drive() {
		System.out.println("drive on the road!");
	}

}
