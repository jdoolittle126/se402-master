package edu.neit.jonathandoolittle.sorting.behaviors;

/**
 * 
 * A {@link SortingBehavior} that places the largest items at the front of the list,
 * and the smallest items at the back.
 * 
 * Example: [20, 5, 2]
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 3, 2021
 *
 */
public class GreatestToLeast implements SortingBehavior {

	@Override
	public int compare(int a, int b) {
		
		if(a == b) {
			return 0;
		}
		
		if(a < b) {
			return -1;
		}
		
		return 1;
	}
}
