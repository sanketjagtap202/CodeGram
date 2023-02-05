import java.util.Scanner;

/**
 * @Discription: To find given year is leap year or not
 * @author Sanket
 * @Date: 12-jan-2023
 */
public class LeapYear {

	public static void main(String[] args) {
		
		
		// Using Scanner class: 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a year: ");
//		int year = sc.nextInt();
//		
//		
//		if(year%4==0) // if year is divisible by 4, then its leap year
//		{
//			System.out.println(year+ " is a leap year.");
//		} else if(year%100==0) // If year is not divisible by 100, then its leap year.
//							// OR, year is divisible by 100, then not a leap year	
//		{
//			System.out.println(year+ " is not a leap year");
//		} else if(year%400==0) // if year is divisible by 400, then its a leap year.
//		{
//			System.out.println(year+ " is a leap year");
//		} else {
//			System.out.println(year+ " is not a leap year.");
//		}
		
//  -----------------------xx------------------------------------
		// Without Scanner class:
		
		int year = 2000;
		if(year%4==0) {
			System.out.println(year + " is a leap year");
		} else if(year%100==0) {
			System.out.println(year+" is not a leap year.");
		} else if(year%400==0) {
			System.out.println(year+ " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}

	}

}
