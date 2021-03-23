package ie.gmit.sw;

/**
 * Implements abstract method from super class needsImpl and 
 * overrides super class method epsilonLengthParse from super class
 * 
 * @author Conor Rabbitte
 * @version 1.0
 */
public class Epsilon extends Omega {

	/**
	 * Returns a String containing the class name.
	 * @return a String
	 */
	@Override
	public String needsImpl() {
		return this.getClass().getSimpleName() + " Implemented me!";
	}
	
	/**
	 * Returns the length of the String value as an integer.
	 * @param value
	 * @return An int
	 */
	@Override
	public int epsilonLengthParse(String value) {
		return value.length();
	}

}
