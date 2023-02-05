package util.java;

public class BankServiceDemo {
	
	String accountHolderName="Vicky Sharma";
	int balance=20000;
	
	public void withdraw(int accNo, int amount) throws InvalidAccountNumberException, InsufficientBalanceException {
		// LOGIC GOES HERE:
		
		
		//1. If accNo is not 123, throw an InvalidAccountNumberException.
		if(accNo!=123) {
			throw new InvalidAccountNumberException("Sorry, Account number is invalid. Try again");
		}
		//2. If withdraw amount is > balance, throw an InsufficientBalanceException.
		if(amount>balance) {
			throw new InsufficientBalanceException("Sorry, Insufficient balance. Try again");
		}
		//3. IF both are correct, show details
		System.out.println("Account Holder Name: "+accountHolderName);
		System.out.println("Account number: "+accNo);
		System.out.println("Available balance Rs: "+balance);
		balance-=amount;
		System.out.println("Amount withdrawn: "+amount);
		System.out.println("Remaining balance Rs: "+balance);
	}

}
