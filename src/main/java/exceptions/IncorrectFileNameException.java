package exceptions;

public class IncorrectFileNameException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public IncorrectFileNameException(String declartion) {
		super(declartion);
	}

}
