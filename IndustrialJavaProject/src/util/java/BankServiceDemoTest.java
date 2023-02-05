package util.java;

import java.util.Scanner;

public class BankServiceDemoTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a account number: ");
		int accNo= sc.nextInt();
		System.out.println("Enter amount to withdraw: ");
		int amount= sc.nextInt();
		
		BankServiceDemo bankserv = new BankServiceDemo();
		
		try {
			bankserv.withdraw(accNo, amount);
		} catch (InvalidAccountNumberException e) {
			System.out.println(e.getMessage());
			
		} catch (InsufficientBalanceException e) {
			
			System.out.println(e.getMessage());
		}

	}

}
