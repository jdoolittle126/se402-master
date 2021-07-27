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
			System.out.println("Enter your duck's legs (This can be up to three characters, such as | |): ");
			String leg = gatherInputString(scanner);
			
			System.out.println(leg);

			Duck customDuck = new Duck(length, color, eye, leg);
					
			//testDuck(shortDuck);
			//testDuck(medDuck);
			//testDuck(longDuck);
			//testDuck(tallDuck);
			testDuck(customDuck);
			
			
		} catch (Exception e) {

			System.out.println("Whoops... An error occured: " + e.getMessage());

		}
		


	}
	
	private static int gatherInputInt(Scanner scanner) {
		int value;
		try {
			value = scanner.nextInt(); //Try capture only an int
		} catch (InputMismatchException e) {
			System.out.println("Hmm, that doesn't look quite right. Lets try again: ");
			scanner.next(); //Flush the last input out of the scanner
			value = gatherInputInt(scanner); // Recursively ask until the condition is met
		}
		return value;
	}
	
	private static String gatherInputString(Scanner scanner) {
		return scanner.nextLine();
	}
	
	
	/**
	 * Runs all of the output methods for a duck
	 * @param duck The duck to test
	 */
	private static void testDuck(Duck duck) {
		System.out.println("DISPLAY TEST");
		duck.display();
		System.out.println("FLY TEST");
		duck.fly();
		System.out.println("QUACK TEST");
		duck.quack();
	}

	
}
