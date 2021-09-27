package edu.neit.jonathandoolittle;

/**
 * 
 * An iterator for array based menus
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 20, 2021
 *
 */
public class DinerMenuIterator implements Iterator<MenuItem> {

	// ******************************
	// Variables
	// ******************************
	
	MenuItem[] items;
	int position = 0;

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new DinerMenuIterator instance
	 */
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public boolean hasNext() {
		return !(position >= items.length || items[position] == null);
	}

	@Override
	public MenuItem next() {
		return items[position++];
	}
	
}
