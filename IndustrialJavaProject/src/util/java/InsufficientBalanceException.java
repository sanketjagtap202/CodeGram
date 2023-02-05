package util.java;

public class InsufficientBalanceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	// Default constructor without error message
	
	public InsufficientBalanceException() {
	super();
	}
	
	// Parameterized construtor with error message.
	
	InsufficientBalanceException(String errMsg){
		super(errMsg);
	}
}
