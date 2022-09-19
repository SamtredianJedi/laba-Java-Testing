package exceptions;
import org.apache.logging.log4j.*;

public class IncorrectFileNameException extends Exception {
	private static Logger demologger = LogManager.getLogger();

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public IncorrectFileNameException(String declartion) {
		super(declartion);
	}

}
