package ie.gmit.sw;

/**
 * Interface which has three methods to be implemented elsewhere. This serves to
 * decouple those class who would implement the interface from outside dependencies. 
 * 
 * @author Conor Rabbitte
 * @version 1.0
 */
public interface Sigmable {

	String needsImpl();

	String gamma();

	String beta();

}