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
		
		ChocolateBoiler cb1 = ChocolateBoiler.getInstance();
		
		cb1.drain();
		cb1.fill();
		
		System.out.println("cb1 object memory address = " + cb1.toString());
		
		ChocolateBoiler cb2 = ChocolateBoiler.getInstance();
		System.out.println("cb2 object memory address = " + cb2.toString());
		
		ChocolateBoiler cb3 = ChocolateBoiler.getInstance();
		System.out.println("cb3 object memory address = " + cb3.toString());
		
		

		
	}
	

	
}
