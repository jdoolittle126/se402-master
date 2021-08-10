package edu.neit.jonathandoolittle;

/**
 * A builder for soup buffets, specific to the Honolulu area!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 3, 2021
 *
 */
public class HonoluluSoupBuffetBuilder extends SoupBuffetBuilder {

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public void setSoupBuffetName() {
		soupBuffet.soupBuffetName = "Honolulu Soup Buffet";
	}

	@Override
	public void buildClamChowder() {
		soupBuffet.clamChowder = new HonoluluClamChowder();
	}

	@Override
	public void buildFishChowder() {
		soupBuffet.fishChowder = new HonoluluFishChowder();
	}
}
