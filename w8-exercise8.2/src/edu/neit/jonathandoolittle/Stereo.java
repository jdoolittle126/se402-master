package edu.neit.jonathandoolittle;

/**
 * 
 * Represents a stereo,
 * for our commander pattern!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 13, 2021
 *
 */
public class Stereo {

	// ******************************
	// Variables
	// ******************************

	String room;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new Stereo instance
	 */
	public Stereo(String room) {
		this.room = room;
	}

	// ******************************
	// Public methods
	// ******************************
	
	/**
	 * Turns the stereo on
	 */
	public void on() {
		System.out.println(room + " stereo is on");
	}
	
	/**
	 * Turns the stereo off
	 */
	public void off() {
		System.out.println(room + " stereo is off");
	}
	
	/**
	 * Sets this stereo to play from a CD
	 */
	public void setCD() {
		System.out.println(room + " stereo is set for cd input");
	}
	
	/**
	 * Sets this stereo to play from a DVD
	 */
	public void setDVD() {
		System.out.println(room + " stereo is set for dvd input");
	}
	
	/**
	 * Sets this stereo to play from  radio
	 */
	public void setRadio() {
		System.out.println(room + " stereo is set for radio input");
	}
	
	/**
	 * Changes the stereo's volume
	 */
	public void setVolume(int volume) {
		System.out.println(room + " stereo volume is set to " + volume);
	}

}
