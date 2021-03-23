package ie.gmit.sw;

/**
 * Acts as a dependency injection for the interface Sigmable. The methods in this class
 * return calls to either the private SigmaFactory or Sigmable. This ensures that any references 
 * made to this class elsewhere, will not need to know about SigmaFactory or Sigmable just the methods.
 * 
 * @author Conor Rabbitte
 * @version 1.0
 */
public class Eta {

	private SigmaFactory sf = SigmaFactory.getInstance();
	private Sigmable sigma;

	/**
	 * On construction of this class sets sigma to its default.
	 */
	public Eta() {
		this.sigma = sf.getSigma("");
	}

	/**
	 * Calls a method from sigma.
	 * @return a String
	 */
	public String getImplement() {
		return sigma.needsImpl();
	}

	/**
	 * Calls a method from sigma.
	 * @return a String
	 */
	public String getBeta() {
		return sigma.beta();
	}

	/**
	 * Calls a method from sigma.
	 * @return a String
	 */
	public String getGamma() {
		return sigma.gamma();
	}

	/**
	 * Calls the SigmaFactory class to create a new class based
	 * on the parameter type.
	 * @param type
	 */
	public void setEta(String type) {
		this.sigma = sf.getSigma(type);
	}

	/**
	 * Returns a new instance of the class.
	 * @return Eta
	 */
	public static Eta getInstance() {
		return new Eta();
	}
}
