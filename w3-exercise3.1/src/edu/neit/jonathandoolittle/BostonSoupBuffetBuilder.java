package edu.neit.jonathandoolittle;

/**
 * A builder for soup buffets, specific to the Boston area!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 3, 2021
 *
 */
public class BostonSoupBuffetBuilder extends SoupBuffetBuilder {

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public void setSoupBuffetName() {
		soupBuffet.soupBuffetName = "Boston Soup Buffet";
	}

	@Override
	public void buildClamChowder() {
		soupBuffet.clamChowder = new BostonClamChowder();
	}

	@Override
	public void buildFishChowder() {
		soupBuffet.fishChowder = new BostonFishChowder();
	}
	
}
