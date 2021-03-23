package ie.gmit.sw;

/**
 * Introduces the Factory Pattern design principle to help in the creation of new class.
 * This helps reduced dependencies on other classes using the 'new' keyword. The factory is
 * also a Singleton, calling the getInstance instead of creating a 'new' factory.
 * 
 * @author Conor Rabbitte
 * @version 1.0
 */
public class OmegaFactory {
	private volatile static OmegaFactory uniqueOF;

	private OmegaFactory() {
	}

	/**
	 * Method insures the creation of a new OmegaFactory is only done
	 * if there is no existing OmegaFactory, else it gets that instance.
	 * @return OmegaFactory A static reference to itself.
	 */
	public static OmegaFactory getInstance() {
		// Check for an instance, if none enter a synchronized lock
		if (uniqueOF == null) {
			// Only need to synchronize he 1st one through the method
			synchronized (OmegaFactory.class) {
				// Once in the block, check for instance and if none create instance
				if (uniqueOF == null) {
					uniqueOF = new OmegaFactory();
				}
			}
		}
		return uniqueOF;
	}

	/**
	 * References the Omegable class to create a new Omega class.
	 * This is based on the parameter type 
	 * @param type
	 * @return new Omegable Returns a new class of type Omegable of either Delta, Eplison, or Zeta.
	 */
	public Omegable getOmega(String type) {
		return switch (type) {
		case "Delta" -> new Delta();
		case "Epsilon" -> new Epsilon();
		case "Zeta" -> new Zeta();

		default -> new Delta();
		};
	}

}
