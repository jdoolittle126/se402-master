package edu.neit.jonathandoolittle;

import java.util.EnumMap;
import javafx.util.Pair;

/**
 * 
 * Maps pricing information to sizes
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 3, 2021
 *
 */
public class PricingModel {

	// ******************************
	// Variables
	// ******************************

	private EnumMap<BeverageSize, Double> priceMap;
	
	// ******************************
	// Constructors
	// ******************************

	@SafeVarargs
	public PricingModel(Pair<BeverageSize, Double> ... pairs) {
		priceMap = new EnumMap<>(BeverageSize.class);
		for(Pair<BeverageSize, Double> pair : pairs) {
			priceMap.put(pair.getKey(), pair.getValue());
		}
	}

	// ******************************
	// Public methods
	// ******************************

	/**
	 * Gets the item's cost, with a given size
	 * @param size The size
	 * @return The cost
	 * @throws UnsupportedOperationException if the given size was not added to the beverage's PriceModel
	 */
	public double getCost(BeverageSize size) {
		if(!priceMap.containsKey(size)) {
			throw new UnsupportedOperationException("The item is not avaliable in the given size!");
		}
		
		return priceMap.get(size);
	}
	
}
