package exceptions;
import org.apache.logging.log4j.*;

import enums.CoffeeSize;

public class NumberFormatException extends Exception{
	private static final Logger LOGGER = LogManager.getLogger(NumberFormatException.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NumberFormatException(String declartion) {
		super(declartion); 
	}

}
