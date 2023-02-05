package util.java;

public class InvalidAccountNumberException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// Default constructor without error message.
	
	public InvalidAccountNumberException() {
	super();
	}
	
	// Parameterized constructor with error message.
	
	InvalidAccountNumberException(String errMsg){
		super(errMsg);
	}

}
