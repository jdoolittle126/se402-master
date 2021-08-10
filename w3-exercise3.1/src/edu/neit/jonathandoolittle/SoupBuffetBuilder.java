package edu.neit.jonathandoolittle;

/**
 * Builds a soup buffet, consisting of different types of {@link Soup}s
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 3, 2021
 *
 */
public abstract class SoupBuffetBuilder {

	// ******************************
	// Variables
	// ******************************

	SoupBuffet soupBuffet;
	

	// ******************************
	// Public methods
	// ******************************

	/**
	 * @return This SoupBuffetBuilder's soupBuffet
	 */
	public SoupBuffet getSoupBuffet() {
		return soupBuffet;
	}
	
	/**
	 * Sets this buffet's name
	 */
	public abstract void setSoupBuffetName();
	
	/**
	 * Creates a new Soup Buffet
	 */
	public void buildSoupBuffet() {
		soupBuffet = new SoupBuffet();
	}
	
	/**
	 * Adds Chicken Soup to this buffet
	 */
	public void buildChickenSoup() {
		soupBuffet.chickenSoup = new ChickenSoup();
	}
	
	/**
	 * Adds Clam Chowder to this buffet
	 */
	public void buildClamChowder() {
		soupBuffet.clamChowder = new ClamChowder();
	}
	
	/**
	 * Adds Fish Chowder to this buffet
	 */
	public void buildFishChowder() {
		soupBuffet.fishChowder = new FishChowder();
	}
	
	/**
	 * Adds Minnestrone to this buffet
	 */
	public void buildMinnestrone() {
		soupBuffet.minnestrone = new Minnestrone();
	}
	
	/**
	 * Adds Pastafazul to this buffet
	 */
	public void buildPastafazul() {
		soupBuffet.pastafazul = new Pastafazul();
	}
	
	/**
	 * Adds Tofu Soup to this buffet
	 */
	public void buildTofuSoup() {
		soupBuffet.tofuSoup = new TofuSoup();
	}
	
	/**
	 * Adds Vegetable Soup to this buffet
	 */
	public void buildVegetableSoup() {
		soupBuffet.vegetableSoup = new VegetableSoup();
	}
	
}
