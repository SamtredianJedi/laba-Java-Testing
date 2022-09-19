package exceptions;
import org.apache.logging.log4j.*;

public class ArithmeticException extends Exception {
	private static Logger demologger = LogManager.getLogger();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ArithmeticException(String declartion) {
		super(declartion);
	}

}
