package edu.neit.jonathandoolittle.sorting.methods;

import edu.neit.jonathandoolittle.sorting.behaviors.SortingBehavior;

/**
 * 
 * Implements {@link SortingMethod}, and sorts the given array using bubble sort
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 3, 2021
 *
 */
public class BubbleSort implements SortingMethod {

	@Override
	public void sort(SortingBehavior behavior, int[] values) {
		int arrayLength = values.length;
		
		for(int i=0; i < arrayLength; i++) {
			for(int j=1; j < arrayLength - i; j++) {
				if(behavior.compare(values[j-1], values[j]) == -1) {
					SortingMethod.swap(values, j-1, j);
				}
			}
			
		}
		
	}

	
	
}
