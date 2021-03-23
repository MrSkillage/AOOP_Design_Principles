package ie.gmit.sw;

/**
 * Represents a Omegable implementation which allows extensions of itself
 * and holds an abstract method.
 * 
 * @author Conor Rabbitte
 * @version 1.0
 */
public abstract class Omega implements Omegable {

	private String name = this.getClass().getSimpleName();
	
	public abstract String needsImpl();
	
	/**
	 * Returns a String 'Zeta'.
	 * @param value
	 * @return a String
	 */
	public String zetaStringParse(String value) {
		return "Zeta";
	}
	
	/**
	 * Returns a Integer of value 1.
	 * @param value
	 * @return an int
	 */
	public int epsilonLengthParse(String value) {
		return 1;
	}
	
	/**
	 * Returns a Integer of value 1.
	 * @param value
	 * @return an int
	 */
	public int deltaHashcodeParse(String value) {
		return 1;
	}
	
	/**
	 * Returns the private name of this class.
	 * @return a String
	 */
	public String getName() {
		return name;
	}
	
}
