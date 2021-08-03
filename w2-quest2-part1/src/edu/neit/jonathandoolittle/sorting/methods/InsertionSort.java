package edu.neit.jonathandoolittle.sorting.methods;

import edu.neit.jonathandoolittle.sorting.behaviors.SortingBehavior;

/**
 * 
 * Implements {@link SortingMethod}, and sorts the given array using insertion sort
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 3, 2021
 *
 */
public class InsertionSort implements SortingMethod {

	@Override
	public void sort(SortingBehavior behavior, int[] values) {
		
		int arrayLength = values.length;
		for (int i=1; i < arrayLength; i++) {
			int c = i-1;
			int v = values[i];
			while(c >= 0 && behavior.compare(v, values[c]) == 1) {
				values[c+1] = values[c--];
	       }
	       values[c+1] = v;
	    }
		
	}

}
