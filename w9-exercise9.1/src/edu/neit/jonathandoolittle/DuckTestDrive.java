package edu.neit.jonathandoolittle;

/**
 * 
 * Driver for exercise 9.1
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 20, 2021
 *
 */
public class DuckTestDrive {

	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The turkey says...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println();
		
		System.out.println("The duck says...");
		testDuck(duck);
		
		System.out.println();
		
		System.out.println("The turkey says...");
		testDuck(turkeyAdapter);
		
		
	}
	
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
	
}
