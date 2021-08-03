package edu.neit.jonathandoolittle.sorting.methods;

import edu.neit.jonathandoolittle.sorting.behaviors.SortingBehavior;

/**
 * 
 * A sorting method provides an interface to that gives sorting behavior.
 *
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 2, 2021
 *
 */
public interface SortingMethod {
	
	/**
	 * Swaps values at index a and index b in the given array
	 * @param values The array 
	 * @param indexA The index of the first item to swap
	 * @param indexB The index of the second item to swap
	 */
	public static void swap(int[] values, int indexA, int indexB) {
		int temp = values[indexA];
		values[indexA] = values[indexB];
		values[indexB] = temp;
	}

	/**
	 * Sorts the given array based on the provided behavior
	 * @param behavior The behvior to sort by
	 * @param values The array to sort
	 */
	public void sort(SortingBehavior behavior, int[] values);


}
