package edu.neit.jonathandoolittle.sorting.behaviors;

/**
 * 
 * A sorting behavior implements a compare method, which allows for sorting methods to
 * change the way lists are sorted at runtime
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 3, 2021
 *
 */
public interface SortingBehavior {
	
	/**
	 * Compares two integers and returns a value that dictates the way they should be sorted
	 * @param a The first item to compare
	 * @param b The second item to compare
	 * @return -1, if the value of a should be moved toward the back of the list,
	 * and the value of b towards the front. 0 if them items should stay in place. 
	 * 1 if the value of a should be moved to front of the list, and b towards the back.
	 */
	public int compare(int a, int b);

}
