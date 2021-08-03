package edu.neit.jonathandoolittle;

import edu.neit.jonathandoolittle.sorting.behaviors.SortingBehavior;
import edu.neit.jonathandoolittle.sorting.methods.SortingMethod;

/**
 * 
 * SortingConfiguration contains a {@link SortingMethod} and a {@link SortingBehavior}, pairing them to 
 * get the desired result. For example, if a list needed to be sorted from least to greatest, using bubble sort,
 * than 'least to greatest' would be defined as a behavior, and 'bubble sort' would be the method.
 *
 * <pre>
 *  SortingConfiguration sc = new SortingConfiguration(new BubbleSort(), new LeastToGreatest());
 *  sc.sortMyList(data);
 * </pre>
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 3, 2021
 *
 */
public class SortingConfiguration {
	
	// ******************************
	// Variables
	// ******************************
	
	SortingMethod sortingMethod;
	SortingBehavior sortingBehavior;

	// ******************************
	// Constructors
	// ******************************
	
	/**
	 * Creates a new SortingConfiguration instance
	 * @param sortingMethod The {@link SortingMethod} to be used. This defines how the data is sorted
	 * @param sortingBehavior The {@link SortingBehavior} to be used. This defines the way the data is sorted
	 */
	public SortingConfiguration(SortingMethod sortingMethod, SortingBehavior sortingBehavior) {
			this.sortingBehavior = sortingBehavior;
			this.sortingMethod = sortingMethod;
	}
	
	// ******************************
	// Public methods
	// ******************************
	
	/**
	 * Sorts this list using the given configuration
	 * @param values The array to sort
	 */
	public void sortMyList(int[] values) {
		sortingMethod.sort(sortingBehavior, values);
	}
	
	/**
	 * Prints this list
	 * @param values The array to print
	 */
	public void printMyList(int[] values) {
		for(int i=0; i < values.length; i++) {
			System.out.print(values[i]);
			if(i != values.length-1) {
				System.out.print(", ");
			} else {
				System.out.println();
			}			
		}
	}


}
