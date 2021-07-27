package edu.neit.jonathandoolittle;

/**
 * 
 * A representation of a duck for Quest 1
 * 
 * <pre> 
 *   Duck duck = new Duck(5, "blue", "o", "");
 *   duck.display();
 *   
 *   Result:
 *      __     
 *    <(o )_______ 
 *     ( ._____> / 
 *      `-------'  
 *             
 *      Enjoy your blue duck!
 * </pre>
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Jul 26, 2021
 *
 */
public class Duck {

	// ******************************
	// Variables
	// ******************************

	private String color;
	private int wingSpan;
	private String leg;
	private String eye;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new Duck object
	 * @param wingSpan The wing span as an integer, where the unit is one character. A wing span of 0 is the shortest possible duck
	 * @param color The color of the duck
	 * @param eye The character(s) that represent the eyes of the duck. Anything larger than two characters will be truncated
	 * @param leg The character(s) that represent the legs of the duck. Anything larger than the wingspan plus two characters will be truncated
	 */
	public Duck(int wingSpan, String color, String eye, String leg) {
		setWingSpan(wingSpan);
		this.color = color;
		this.eye = eye;
		this.leg = leg;
	}

	// ******************************
	// Public methods
	// ******************************
	
	/**
	 * @return The color of this duck
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color The new color of this duck
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return The wing span of this duck
	 */
	public int getWingSpan() {
		return wingSpan;
	}

	/**
	 * @param wingSpan The new non-negative wing span
	 */
	public void setWingSpan(int wingSpan) {
		if(wingSpan < 0) {
			throw new IllegalArgumentException("Wingspan must be 0 or larger");
		}
		this.wingSpan = wingSpan;
	}

	/**
	 * @return The characters that represent this duck's leg
	 */
	public String getLeg() {
		return leg;
	}
	
	/**
	 *  @param leg The character(s) that represent the legs of the duck. Anything larger than the wing span plus two characters will be truncated
	 */
	public void setLeg(String leg) {
		this.leg = leg;
	}

	/**
	 * @return The characters that represent this duck's eye
	 */
	public String getEye() {
		return eye;
	}

	/**
	 * @param eye eye The character(s) that represent the eyes of the duck. Anything larger than two characters will be truncated
	 */
	public void setEye(String eye) {
		this.eye = eye;
	}
	
	/**
	 * Displays this duck flying in the console
	 */
	public void fly() {
		System.out.println("Now boarding: American Airlines, flight 402!\n\n |");
		display();
	}
	
	/**
	 * Displays this duck in the console
	 */
	public void display() {
	
		String duck = 
			"   __     \r\n" + 
			" <(" + clipTo(eye, 2) + ")_" + repeat("_", wingSpan) + "_ \r\n" + 
			"  ( ." + repeat("_", wingSpan) + "> / \r\n" + 
			"   `-" + repeat("-", wingSpan) + "-'  \r\n" +
			"    " + clipTo(leg, 2 + wingSpan) + "   \r\n" +
			"Enjoy your " + color.toLowerCase() + " duck!\r\n";
		
		System.out.println(duck);
		
	}
	
	/**
	 * Displays this duck quacking in the console
	 */
	public void quack() {
		System.out.println("QUACK QUACK!\n\n |");
		display();
	}
	
	
	// ******************************
	// Private methods
	// ******************************

	/**
	 * Repeats a string n times
	 * @param input The string to repeat
	 * @param iterations The number of iterations, where 1 returns the base string
	 * @return The new string
	 */
	private String repeat(String input, int iterations) {
		String result = "";
		
		for(int i = 0; i < iterations; i++) {
			result += input;
		}
		
		return result;
	}
	
	/**
	 * Clamps this string at a fixed size, padding if necessary
	 * @param input The input string
	 * @param size The size to clamp
	 * @return The new string of length size
	 */
	private String clipTo(String input, int size) {
		
		if(input.length() > size) {
			input = input.substring(0, size);
		} else if(input.length() < size) {
			for(int i = input.length(); i < size; i++) {
				input += " ";
			}
		}
		
		return input;
	}
	
}
