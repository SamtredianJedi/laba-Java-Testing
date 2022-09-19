package exceptions;
import org.apache.logging.log4j.*;

public class CantDivideANumberByZero extends Exception {
	private static Logger demologger = LogManager.getLogger();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CantDivideANumberByZero(String declartion) {
	super(declartion);

}
}
