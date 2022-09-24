package exceptions;
import org.apache.logging.log4j.*;

import enums.CoffeeSize;

public class CantDivideANumberByZero extends Exception {
	private static final Logger LOGGER = LogManager.getLogger(CantDivideANumberByZero.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CantDivideANumberByZero(String declartion) {
	super(declartion); 

}
}
