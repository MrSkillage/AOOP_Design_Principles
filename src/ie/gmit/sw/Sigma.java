package ie.gmit.sw;

/**
 * Represents a Sigmable implementation which allows extensions of itself
 * and holds an abstract method.
 * 
 * @author Conor Rabbitte
 * @version 1.0
 */
public abstract class Sigma implements Sigmable {
	
	public abstract String needsImpl();
	
	/**
	 * Returns a String 'Gamma'
	 * @return a String
	 */
	public String gamma() {
		return "Gamma";
	}
	
	/**
	 * Returns a String 'Beta'
	 * @return a String
	 */
	public String beta() {
		return "Beta";
	}

}