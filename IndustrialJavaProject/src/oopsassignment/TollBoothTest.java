package oopsassignment;

import java.util.Scanner;

public class TollBoothTest extends TollBooth {
	public static char getWhatTheyWant()
	{
		char a = 0;
		Scanner scanner = new Scanner(System.in);
	      System.out.println("Enter 'p' To Pay And Pass"); 
	      
	      System.out.println("Enter 'n' To Pass Without Paying");
	     
	 	 System.out.println("Press 's' To Show Result And Exit");
	 	 
	 	System.out.println("Make Your Choice: ");
	 	a=scanner.next().charAt(a);
		 scanner.close();
		return a;
	
	}
	
	public static void main(String[] args) {
		
		TollBooth booth = new TollBooth();
		char whatTheyWant;
		whatTheyWant = getWhatTheyWant();
		switch(whatTheyWant)
		{
		case 'p':
			booth.payingCar();
			System.out.println("paid");
			break;
			
		case 'n':
			booth.noPaycar();
			System.out.println("unpaid");
			break;
			
		case 's':
			System.out.println("Result");
			break;
			
			default:
				System.out.println("Invalid Input");
		}
		
		booth.display();
		whatTheyWant=getWhatTheyWant();

	}

}
