package ie.gmit.sw;

/**
 * Interface which has four methods to be implemented elsewhere. This serves to
 * decouple those class who would implement the interface from outside dependencies. 
 * 
 * @author Conor Rabbitte
 * @version 1.0
 */
public interface Omegable {

	String needsImpl();

	String zetaStringParse(String value);

	int epsilonLengthParse(String value);

	int deltaHashcodeParse(String value);

}