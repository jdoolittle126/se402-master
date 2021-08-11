package edu.neit.jonathandoolittle;

/**
 * 
 * Represents a chocolate boiler, with functions to fill,
 * drain, and boil the chocolate.
 *
 * <pre>
 *  ChocolateBoiler cb = ChocolateBoiler.getInstance();
 * </pre>
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 10, 2021
 *
 */
public class ChocolateBoiler {

	// ******************************
	// Variables
	// ******************************

	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler chocolateBoilerSingleton;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new ChocolateBoiler instance
	 */
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}

	// ******************************
	// Public methods
	// ******************************

	/**
	 * Return the instance of this singleton, or create one if 
	 * it does not exist
	 * @return The ChocolateBoiler singleton instance
	 */
	public static ChocolateBoiler getInstance() {
		if(chocolateBoilerSingleton == null) {
			chocolateBoilerSingleton = new ChocolateBoiler();
		}
		return chocolateBoilerSingleton;
	}

	/**
	 * @return True, if this ChocolateBoiler is empty
	 */
	public boolean isEmpty() {
		return empty;
	}

	/**
	 * @return True, if this ChocolateBoiler is boiled
	 */
	public boolean isBoiled() {
		return boiled;
	}
	
	/**
	 * Fills this pointer with contents,
	 * if it is empty
	 */
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
		}
	}
	
	/**
	 * Drains the contents of this boiler, if it
	 * is not empty and has been boiled
	 */
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			empty = true;
		}
	}
	
	/**
	 * Boils the contents of this ChocolateBoiler, if it
	 * is not empty or already boiled
	 */
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			boiled = true;
		}
	}
	
}
