package ie.gmit.sw;

/**
 * Implements abstract method from super class needsImpl and 
 * overrides super class method beta from super class.
 * 
 * @author Conor Rabbitte
 * @version 1.0
 */
public class Beta extends Sigma {

	/**
	 * Returns a String containing the class name.
	 * @return a String
	 */
	@Override
	public String needsImpl() {
		return this.getClass().getSimpleName() + " Implemented me!";
	}

	/**
	 * Returns a String identifying the class as Beta.
	 * @param value
	 * @return A String
	 */
	@Override
	public String beta() {
		return "I'm the Beta-male inferior to the Gamma-Man";
	}
	
	
}
