package edu.neit.jonathandoolittle;

/**
 * 
 * Iterates over a collection of T items
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 20, 2021
 *
 */
public interface Iterator<T> {
	
	boolean hasNext();
	T next();
	
}
