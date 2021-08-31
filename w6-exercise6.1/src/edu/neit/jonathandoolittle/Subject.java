package edu.neit.jonathandoolittle;

/**
 * Represents a subject in the subject-observer
 * model of the observer pattern
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 30, 2021
 *
 */
public interface Subject {
	
	/**
	 * Register this item as an observer
	 * @param o
	 */
	public void registerObserver(Observer o);
	
	/**
	 * Remove this observer if it exists
	 * @param o
	 */
	public void removeObserver(Observer o);
	
	/**
	 * Notify observers of a data change
	 */
	public void notifyObservers();

	
}
