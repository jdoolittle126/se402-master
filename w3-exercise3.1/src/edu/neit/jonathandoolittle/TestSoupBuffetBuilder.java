package edu.neit.jonathandoolittle;

/**
 * Driver for Exercise 3.1
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 3, 2021
 *
 */
public class TestSoupBuffetBuilder {
	
	public static void main(String[] args) {
		SoupBuffet bostonSoupBuffet = createSoupBuffet(new BostonSoupBuffetBuilder());
		SoupBuffet honoluluSoupBuffet = createSoupBuffet(new HonoluluSoupBuffetBuilder());
		
		displaySoupBuffet(bostonSoupBuffet);
		displaySoupBuffet(honoluluSoupBuffet);
		
	}
	
	/**
	 * Creates a buffet based on the given builder
	 * @param builder The builder to use
	 * @return The soup buffet
	 */
	public static SoupBuffet createSoupBuffet(SoupBuffetBuilder builder) {
		builder.buildSoupBuffet();
		builder.setSoupBuffetName();
		
		builder.buildChickenSoup();
		builder.buildClamChowder();
		builder.buildFishChowder();
		builder.buildMinnestrone();
		builder.buildPastafazul();
		builder.buildTofuSoup();
		builder.buildVegetableSoup();
		
		return builder.getSoupBuffet();
	}
	
	/**
	 * Displays a soup buffet
	 * @param soupBuffet The buffet to display
	 */
	public static void displaySoupBuffet(SoupBuffet soupBuffet) {
		System.out.println("At the " + 
				soupBuffet.getSoupBuffetName() + "\n" + 
				soupBuffet.getTodaysSoups());
	}

}
