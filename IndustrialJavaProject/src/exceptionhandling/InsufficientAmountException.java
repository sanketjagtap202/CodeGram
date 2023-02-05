package exceptionhandling;

public class InsufficientAmountException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 *  Constructor without a error message. i.e default constructor
	 */
	public InsufficientAmountException() {
	super();
	}
	/**
	 * Constructor with a error message. i.e parameterized constructor
	 */
	
	InsufficientAmountException(String errorMsg){
		super(errorMsg);
	}

}
