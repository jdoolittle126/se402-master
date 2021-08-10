package edu.neit.jonathandoolittle.parts;
/**
 * 
 * Represents a part of an alien, like the legs or eyes
 * Contains statistics for health, attack, and speed,
 * which are aggregated to get the alien's overall
 * statistics. See {@link edu.neit.jonathandoolittle.Alien#getStats() getStats} 
 * for more information.
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 9, 2021
 *
 */
public abstract class AlienPart {

	// ******************************
	// Variables
	// ******************************

	private String assetUri;
	private int healthPoints;
	private int attackPoints;
	private int speedPoints;	
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new AlienPart instance
	 */
	protected AlienPart() {
		assetUri = "default";
		healthPoints = 0;
		attackPoints = 0;
		speedPoints = 0;
	}
	
	// ******************************
	// Public methods
	// ******************************

	/**
	 * @return This AlienPart's assetUri
	 */
	public String getAssetUri() {
		return assetUri;
	}

	/**
	 * @return This AlienPart's healthPoints
	 */
	public int getHealthPoints() {
		return healthPoints;
	}

	/**
	 * @return This AlienPart's attackPoints
	 */
	public int getAttackPoints() {
		return attackPoints;
	}

	/**
	 * @return This AlienPart's speedPoints
	 */
	public int getSpeedPoints() {
		return speedPoints;
	}

	// ******************************
	// Protected methods
	// ******************************
	
	/**
	 * Initializes this component
	 * @param assetUri The asset's name, without extension
	 * @param healthPoints The HP of this part
	 * @param attackPoints The attack power of this part
	 * @param speedPoints The speed points of this part
	 */
	protected void init(String assetUri, int healthPoints, int attackPoints, int speedPoints){
		this.assetUri = assetUri;
		this.healthPoints = healthPoints;
		this.attackPoints = attackPoints;
		this.speedPoints = speedPoints;
	}	

}
