package edu.neit.jonathandoolittle;

import java.util.LinkedList;
import java.util.List;

/**
 * Represents a pizza object, with a name, dough,
 * and a sauce. Used to demonstrate factory pattern.
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 10, 2021
 *
 */
public abstract class Pizza {

	// ******************************
	// Variables
	// ******************************

	String name;
	String dough;
	String sauce;
	List<String> toppings;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new Pizza instance
	 */
	protected Pizza() {
		toppings = new LinkedList<>();
	}

	// ******************************
	// Public methods
	// ******************************
	
	/**
	 * @return This Pizza's name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Prepares this pizza
	 */
	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dought...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for(String topping : toppings) {
			System.out.println("\t" + topping);
		}
	}

	/**
	 * Bakes this pizza
	 */
	public void bake() {
		System.out.println("Bake for 25 minutes at 350 degrees");
	}
	
	/**
	 * Cuts this pizza
	 */
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	/**
	 * Boxes this pizza
	 */
	public void box() {
		System.out.println("Placing the pizza in an offical PizzaStore box");
	}
	
}
