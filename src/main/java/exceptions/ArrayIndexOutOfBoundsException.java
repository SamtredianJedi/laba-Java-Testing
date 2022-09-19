package exceptions;
import org.apache.logging.log4j.*;
public class ArrayIndexOutOfBoundsException extends Exception {
	private static Logger demologger = LogManager.getLogger();

	/**
	 * 
	 */
	private static final long serialVersionUID = -7268294633927120108L;
	public ArrayIndexOutOfBoundsException(String declartion) {
		super(declartion);
		
		
	}
	

}
