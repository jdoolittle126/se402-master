package edu.neit.jonathandoolittle;

import java.util.ArrayList;

/**
 * 
 * An iterator for arraylist based menus
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 20, 2021
 *
 */
public class PancakeHouseMenuIterator implements Iterator<MenuItem> {

	// ******************************
	// Variables
	// ******************************
	
	ArrayList<MenuItem> items;
	int position = 0;

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new PancakeHouseMenuIterator instance
	 */
	public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public boolean hasNext() {
		return position < items.size();
	}

	@Override
	public MenuItem next() {
		return items.get(position++);
	}
	
}
