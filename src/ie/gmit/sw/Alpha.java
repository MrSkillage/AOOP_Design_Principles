package ie.gmit.sw;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Contains a public method of type Object called alpha. This takes in a parameter of
 * Status and the determines based on a conditional if-statement which functions to execute.
 * From here the method will created a chain of calls to create an object and return an appropriate
 * message. There is also a switch statement which will create complex object based on the Day of
 * the Week. This class also, for simplicity, contains the main method for running the program.
 * 
 * @author Conor Rabbitte
 * @version 1.0
 */
public class Alpha {
	private Eta eta = Eta.getInstance();
	private Theta theta = Theta.getInstance();
	
	/**
	 * Returns an Object based entirely on the parameter s passed into the method.
	 * 
	 * @param s
	 * @return Object 
	 */
	public Object alpha(Status s) {
		//Beta and Gamma only deal with Status values of Slight, Low and Medium 
		if (s == Status.Slight || s == Status.Low) {			
			eta.setEta("Beta");
			return eta.getBeta();
		}else if (s == Status.Medium) {
			eta.setEta("Gamma");
			return eta.getGamma();	
		}else { 
			//Delta, Epsilon and Zeta handle more complex situations
			DayOfWeek day = LocalDate.now().getDayOfWeek();
			return switch (day) {
				case MONDAY, TUESDAY -> theta.getDelta(day.name());
				case WEDNESDAY, THURSDAY -> theta.getEpsilon(day.name());
				case FRIDAY -> theta.getZeta(day.name());
				case SATURDAY -> Integer.valueOf((theta.getDelta(day.name()) + theta.getEpsilon(day.name()))); 
				case SUNDAY -> Integer.valueOf((theta.getEpsilon(day.name()) + theta.getZeta(day.name())));
			};	
		}
	}
	
	/**
	 * This is the main method used to run the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Alpha alp = new Alpha();
		System.out.println(alp.alpha(Status.Slight));
		
	}
	
}