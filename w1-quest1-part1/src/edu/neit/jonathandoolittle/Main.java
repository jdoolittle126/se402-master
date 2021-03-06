package edu.neit.jonathandoolittle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Pre-made ducks
		Duck blankDuck = new Duck(0, "____", "", "");
		Duck shortDuck = new Duck(0, "red", "o", "");
		Duck medDuck = new Duck(5, "orange", "-", "");
		Duck longDuck = new Duck(10, "teal", "0", "");
		Duck tallDuck = new Duck(3, "green", "u", "| |");
		
		try (Scanner scanner = new Scanner(System.in)) {
			// Make your own duck
			System.out.println("Today you will be making your own duck, who will look like this:");
			blankDuck.display();
			
			System.out.println("Enter your duck's length (Must be integer above 0): ");
			int length = gatherInputInt(scanner);
			System.out.println("Enter your duck's color (This will replace the ____): ");
			String color = gatherInputString(scanner);
			System.out.println("Enter your duck's eye (This can be up to two characters, such as oo): ");
			String eye = gatherInputString(scanner);
			System.out.println("Enter your duck's legs (This can be up to two characters larger than the wingspan, such as | |): ");
			String leg = gatherInputString(scanner);

			Duck customDuck = new Duck(length, color, eye, leg);
		
			customDuck.display();
			
			System.out.println("Press any key to show all features...");
			
			scanner.nextLine();
			
			// Show some tests
			testDuck(shortDuck);
			testDuck(medDuck);
			testDuck(longDuck);
			testDuck(tallDuck);
			testDuck(customDuck);
			
		} catch (Exception e) {

			System.out.println("Whoops... An error occured: " + e.getMessage());

		} 
		
	}
	
	/**
	 * Asks the user for an int until one is provided 
	 * @param scanner The scanner to use
	 * @return The interger typed
	 */
	private static int gatherInputInt(Scanner scanner) {
		int value;
		try {
			value = scanner.nextInt(); //Try capture only an int
			if(scanner.hasNextLine()) { //Flush the last input out of the scanner
				scanner.nextLine();
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Hmm, that doesn't look quite right. Lets try again: ");
			scanner.next(); //Flush the last input out of the scanner
			value = gatherInputInt(scanner); // Recursively ask until the condition is met
		}
		// Flush for next read
		return value;
	}
	
	/**
	 * Asks the user for a string
	 * @param scanner The scanner to use
	 * @return The string
	 */
	private static String gatherInputString(Scanner scanner) {
		return scanner.nextLine();
	}
	
	/**
	 * Runs all of the output methods for a duck
	 * @param duck The duck to test
	 */
	private static void testDuck(Duck duck) {
		System.out.println("## DISPLAY TEST\n");
		duck.display();
		System.out.println("## FLY TEST\n");
		duck.fly();
		System.out.println("## QUACK TEST\n");
		duck.quack();
	}

	
}
