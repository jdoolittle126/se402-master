package edu.neit.jonathandoolittle;

/**
 * 
 * Driver class for exercise 7.1
 * 
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 3, 2021
 *
 */
public class StarbuzzCoffee {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		printCoffee(beverage);
 
		Beverage beverage2 = new DarkRoast();
		beverage2.setSize(BeverageSize.VENTI);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		printCoffee(beverage2);
 
		Beverage beverage3 = new HouseBlend();
		beverage3.setSize(BeverageSize.GRANDE);
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		printCoffee(beverage3);

	}
	
	public static void printCoffee(Beverage b) {
		System.out.println(String.format("%s (%s) $%.2f", b.getDescription(), b.getSize().toString(), b.cost()));
	}

}
