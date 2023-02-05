package exceptionhandling;

public class InvalidAccountNumberException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 *  Constructor without a error message. i.e default constructor
	 */

	public InvalidAccountNumberException() {
		super();
	}
	
	/**
	 * Constructor with a error message. i.e parameterized constructor
	 */
	
	InvalidAccountNumberException(String errorMsg){
		super(errorMsg);
	}
}
