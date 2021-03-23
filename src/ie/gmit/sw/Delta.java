package ie.gmit.sw;

/**
 * Implements abstract method from super class needsImpl and 
 * overrides super class method deltaHashcodeParse from super class.
 * 
 * @author Conor Rabbitte
 * @version 1.0
 */
public class Delta extends Omega {
	
	/**
	 * Returns a String containing the class name.
	 * @return a String
	 */
	@Override
	public String needsImpl() {
		return this.getClass().getSimpleName() + " Implemented me!";
	}
	
	/**
	 * Returns the hashcode of the parameter value.
	 * @param value
	 * @return an int
	 */
	@Override
	public int deltaHashcodeParse(String value) {
		return value.hashCode();
	}
	
	
}
