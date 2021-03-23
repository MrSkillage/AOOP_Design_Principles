package ie.gmit.sw;

/**
 * Implements abstract method from super class needsImpl and 
 * overrides super class method zetaStringParse from super class.
 * 
 * @author Conor Rabbitte
 * @version 1.0
 */
public class Zeta extends Omega {

	/**
	 * Returns a String containing the class name.
	 * @return a String
	 */
	@Override
	public String needsImpl() {
		return this.getClass().getSimpleName() + " Implemented me!";
	}

	/**
	 * Returns the parameter value with a concatenation of -7.
	 * @param value
	 * @return A String
	 */
	@Override
	public String zetaStringParse(String value) {
		return value + "-7";
	}
}