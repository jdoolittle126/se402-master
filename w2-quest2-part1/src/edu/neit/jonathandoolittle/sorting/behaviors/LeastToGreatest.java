package edu.neit.jonathandoolittle.sorting.behaviors;

/**
 * 
 * A {@link SortingBehavior} that places the smallest items at the front of the list,
 * and the largest items at the back.
 * 
 * Example: [1, 2, 90]
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 3, 2021
 *
 */
public class LeastToGreatest implements SortingBehavior {

	@Override
	public int compare(int a, int b) {
		
		if(a == b) {
			return 0;
		}
		
		if(a > b) {
			return -1;
		}
		
		return 1;
	}

}
