package edu.neit.jonathandoolittle;

/**
 * 
 * Driver for exercise 4.3
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 10, 2021
 *
 */
public class Main {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		PizzaStore caliStore = new CaliforniaPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("First customer order a " + pizza.getName() + "\n");
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Second customer order a " + pizza.getName() + "\n");
		
		pizza = caliStore.orderPizza("hawaiian");
		System.out.println("Third customer order a " + pizza.getName() + "\n");
		
	}
	
}
