package ie.gmit.sw;

/**
 * Implements abstract method from super class needsImpl and 
 * overrides super class method gamma from super class.
 * 
 * @author Conor Rabbitte
 * @version
 */
public class Gamma extends Sigma {

	/**
	 * Returns a String containing the class name.
	 * @return a String
	 */
	@Override
	public String needsImpl() {
		return this.getClass().getSimpleName() + " Implemented me!";
	}
	
	/**
	 * Returns a String identifying the class as Gamma.
	 * @param value
	 * @return A String
	 */
	@Override
	public String gamma() {
		return "I'm the Gamma-Man with my Gamma-Rays!!!";
	}
	
	
}
