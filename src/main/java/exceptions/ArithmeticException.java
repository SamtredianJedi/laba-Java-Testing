package exceptions;
import org.apache.logging.log4j.*;

import enums.CoffeeSize;

public class ArithmeticException extends Exception {
	private static final Logger LOGGER = LogManager.getLogger(ArithmeticException.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ArithmeticException(String declartion) {
		super(declartion);
	}

}
