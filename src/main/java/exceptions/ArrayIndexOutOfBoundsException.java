package exceptions;
import org.apache.logging.log4j.*;

import enums.CoffeeSize;
public class ArrayIndexOutOfBoundsException extends Exception {
	private static final Logger LOGGER = LogManager.getLogger(ArrayIndexOutOfBoundsException.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = -7268294633927120108L;
	public ArrayIndexOutOfBoundsException(String declartion) {
		super(declartion);
		
		
	}
	

}
