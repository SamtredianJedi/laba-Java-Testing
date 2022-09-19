package exceptions;
import org.apache.logging.log4j.*;

public class NumberFormatException extends Exception{
	private static Logger demologger = LogManager.getLogger();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NumberFormatException(String declartion) {
		super(declartion);
	}

}
