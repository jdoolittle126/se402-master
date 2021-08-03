package edu.neit.jonathandoolittle;

import edu.neit.jonathandoolittle.sorting.behaviors.GreatestToLeast;
import edu.neit.jonathandoolittle.sorting.behaviors.LeastToGreatest;
import edu.neit.jonathandoolittle.sorting.methods.BubbleSort;
import edu.neit.jonathandoolittle.sorting.methods.InsertionSort;

/**
 * 
 * Driver for quest 2, where we demonstrate strategy pattern using various sorting algorithms
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 2, 2021
 *
 */
public class Main {

	public static void main(String[] args) {
		int[] test1 = {4, -6, 2, 2, 100, 3};
		int[] test2 = {50, 3, 500, 20, 34, 33, 222, 1, 56, 3, -0};		
		
		SortingConfiguration config1 = new SortingConfiguration(new InsertionSort(), new LeastToGreatest());
		SortingConfiguration config2 = new SortingConfiguration(new BubbleSort(), new GreatestToLeast());
		
		System.out.println("List #1 Pre-Sort");
		config2.printMyList(test1);
		
		System.out.println("List #1 Bubble Sort Greatest To Least");
		config2.sortMyList(test1);
		config2.printMyList(test1);
		
		System.out.println("List #2 Pre-Sort");
		config1.printMyList(test2);
		
		System.out.println("List #2 Insertion Sort Least To Greatest");
		config1.sortMyList(test2);
		config1.printMyList(test2);

		
	}
}
