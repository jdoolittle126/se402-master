package edu.neit.jonathandoolittle;

/**
 * Holds a variety of different {@link Soup}s
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 3, 2021
 *
 */
public class SoupBuffet {

	// ******************************
	// Variables
	// ******************************

	String soupBuffetName;
	
	ChickenSoup chickenSoup;
	ClamChowder clamChowder;
	FishChowder fishChowder;
	Minnestrone minnestrone;
	Pastafazul pastafazul;
	TofuSoup tofuSoup;
	VegetableSoup vegetableSoup;
	
	// ******************************
	// Public methods
	// ******************************

	/**
	 * @return The name of this soup buffet
	 */
	public String getSoupBuffetName() {
		return this.soupBuffetName;
	}
	
	/**
	 * Gives a description of today's soups
	 * @return A string holding today's soups
	 */
	public String getTodaysSoups() {
		StringBuilder sb = new StringBuilder();
		sb.append("Today's Soups!\n");
		
		sb.append(" - Chicken Soup:\n\t");
		sb.append(this.chickenSoup.getSoupName());
		
		sb.append("\n - Clam Chowder:\n\t");
		sb.append(this.clamChowder.getSoupName());
		
		sb.append("\n - Fish Chowder:\n\t");
		sb.append(this.fishChowder.getSoupName());
		
		sb.append("\n - Minnestrone:\n\t");
		sb.append(this.minnestrone.getSoupName());
		
		sb.append("\n - Pasta Fazul:\n\t");
		sb.append(this.pastafazul.getSoupName());
		
		sb.append("\n - Tofu Soup:\n\t");
		sb.append(this.tofuSoup.getSoupName());
		
		sb.append("\n - Vegetable Soup:\n\t");
		sb.append(this.vegetableSoup.getSoupName());
		
		return sb.toString();
	}
}
