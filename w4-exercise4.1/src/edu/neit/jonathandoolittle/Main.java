package edu.neit.jonathandoolittle;

/**
 * 
 * Driver for exercise 4.1
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 10, 2021
 *
 */
public class Main {

	public static void main(String[] args) {
		
		// Static
		ClassA.aStaticMethod();
		
		// Non-static
		new ClassA().aNonStaticMethod();
		
		// Or both!
		new ClassA().aStaticMethod();
		
	}
	

	
}
