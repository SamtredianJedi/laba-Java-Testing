package exceptions;
import org.apache.logging.log4j.*;

import enums.CoffeeSize;

public class IncorrectFileNameException extends Exception {
	private static final Logger LOGGER = LogManager.getLogger(IncorrectFileNameException.class);

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public IncorrectFileNameException(String declartion) {
		super(declartion);
	}

}
