package exceptionhandling;

public class BankService {
		
		int balance = 10000;
	
	
	


	public void withdraw(int accNo, int amount) throws InvalidAccountNumberException, InsufficientAmountException {
		
		//1. If accNo is not 101, throw InvalidAccountNumberException.
		
		 if(accNo!=101) {
			 throw new InvalidAccountNumberException("Sorry, We can not proceed due to invalid account Number. Try Again");
		 }
		//2. If withdraw amount exceeds the Balance, throw InsufficientBalanceException.
		 if(amount>balance) {
			 throw new InsufficientAmountException("Sorry, we can not proceed due to Insufficient balance.");
		 }
		//3. If everything is fine, then show the details.
		 
		 System.out.println("Current Balance is: "+balance);
		 balance-=amount;
		 System.out.println("Amount withdrawn from account Number: "+accNo);
		 System.out.println("Amount withdrawn Rs.: "+amount);
		 System.out.println("Remaining balance Rs.: "+balance);
	}
	
	public BankService(int accNo, int amount) {
	
		// created a constructor to take values from user.
	}

}
