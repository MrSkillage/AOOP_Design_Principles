package ie.gmit.sw;

/**
 * Introduces the Factory Pattern design principle to help in the creation of new class.
 * This helps reduced dependencies on other classes using the 'new' keyword. The factory is
 * also a Singleton, calling the getInstance instead of creating a 'new' factory.
 * 
 * @author Conor Rabbitte
 * @version 1.0
 */
public class SigmaFactory {
	private volatile static SigmaFactory uniqueSF;

	private SigmaFactory() {
	}

	/**
	 * Method insures the creation of a new SigmaFactory is only done
	 * if there is no existing SigmaFactory, else it gets that instance.
	 * @return SigmaFactory A static reference to itself.
	 */
	public static SigmaFactory getInstance() {
		// Check for an instance, if none enter a synchronized lock
		if (uniqueSF == null) {
			// Only need to synchronize he 1st one through the method
			synchronized (SigmaFactory.class) {
				// Once in the block, check for instance and if none create instance
				if (uniqueSF == null) {
					uniqueSF = new SigmaFactory();
				}
			}
		}
		return uniqueSF;
	}

	/**
	 * References the Sigmable class to create a new Sigma class.
	 * This is based on the parameter sigmaType 
	 * @param sigmaType
	 * @return new Sigmable Returns a new class of type Sigmable of either Beta or Gamma.
	 */
	public Sigmable getSigma(String sigmaType) {
		return switch (sigmaType) {
		case "Beta" -> new Beta();
		case "Gamma" -> new Gamma();

		default -> new Beta();
		};
	}

}
