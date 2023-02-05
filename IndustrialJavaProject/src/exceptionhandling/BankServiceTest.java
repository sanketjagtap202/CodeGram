package exceptionhandling;

import java.util.Scanner;

public class BankServiceTest {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a account number: ");
		int accNo=sc.nextInt();
		System.out.println("Enter amount to withdraw: ");
		int amount= sc.nextInt();
		
		BankService bankService = new BankService(accNo, amount);
		
		try {
			bankService.withdraw(accNo, amount);
		} catch (InvalidAccountNumberException e) {
			System.out.println(e.getMessage());
			
		} catch (InsufficientAmountException e) {
			System.out.println(e.getMessage());
		}

	}

}
