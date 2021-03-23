package ie.gmit.sw;

/**
 * Acts as a dependency injection for the interface Omegable. The methods in this class
 * return calls to either the private OmegaFactory or Omegable. This ensures that any references 
 * made to this class elsewhere, will not need to know about OmegaFactory or Omegable just the methods.
 * 
 * @author Conor Rabbitte
 * @version 1.0
 */
public class Theta {

	private OmegaFactory of = OmegaFactory.getInstance();
	private Omegable omega;

	/**
	 * On construction of this class sets omega to its default.
	 */
	private Theta() {
		this.omega = of.getOmega("");
	}

	/**
	 * Calls the OmegaFactory class to create a new class based
	 * on the parameter type.
	 * @param type
	 */
	public void setTheta(String type) {
		this.omega = of.getOmega(type);
	}
	
	/**
	 * Calls a method from omega and passes it the parameter value.
	 * @param value
	 * @return an int
	 */
	public int getDelta(String value) {
		return omega.deltaHashcodeParse(value);
	}

	/**
	 * Calls a method from omega and passes it the parameter value.
	 * @param value
	 * @return an int
	 */
	public int getEpsilon(String value) {
		return omega.epsilonLengthParse(value);
	}

	/**
	 * Calls a method from omega and passes it the parameter value.
	 * @param value
	 * @return a String
	 */
	public String getZeta(String value) {
		return omega.zetaStringParse(value);
	}

	/**
	 * Calls a method from omega.
	 * @return a String
	 */
	public String getImplement() {
		return omega.needsImpl();
	}

	/**
	 * Returns a new instance of the class.
	 * @return Theta
	 */
	public static Theta getInstance() {
		return new Theta();
	}

}
