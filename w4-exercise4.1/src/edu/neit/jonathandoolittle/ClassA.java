package edu.neit.jonathandoolittle;

/**
 * A small demo for static and non-static methods
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 10, 2021
 *
 */
public class ClassA {

	// ******************************
	// Public methods
	// ******************************
	
	/**
	 * A sample static method
	 */
	public static void aStaticMethod() {
		System.out.println("This is static, it is a class method!");
	}
	
	/**
	 * A sample non-static method
	 */
	public void aNonStaticMethod() {
		System.out.println("This is not static, this is an instance method");
	}
}
