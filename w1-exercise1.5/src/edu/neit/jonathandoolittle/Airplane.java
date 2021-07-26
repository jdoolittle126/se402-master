package edu.neit.jonathandoolittle;

/**
 * 
 * Airplane class for interface demo
 * 
 * <pre> 
 *    Airplane airplane = new Airplane();
 *    airplane.drive();
 * </pre>
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Jul 24, 2021
 *
 */

public class Airplane implements Vehicle {

	@Override
	public void drive() {
		System.out.println("Drive in air!");
	}
	
}