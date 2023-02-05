/**
 * @Description: Generate a password using First name, last name and birth year Using Scanner.
 * @Author: Sanket Jagtap
 * @Date: 13-Jan-23
 */

package util.java;

import java.util.Random;
import java.util.Scanner;

public class Tester{
	   public static void main(String[] args) {
	      System.out.println(generatePassword(6));
	   }

	   private static char[] generatePassword(int length) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter user First Name: ");
	      String firstName = sc.next();
	      System.out.println("Enter user Last Name: ");
	      String lastName = sc.next();
	      System.out.println("Enter birth year of user: ");
	      String year = sc.next();
	      String combinedChars = firstName + lastName + year;
	      Random random = new Random();
	      char[] password = new char[length];

	      password[0] = firstName.charAt(random.nextInt(firstName.length()));
	      password[1] = lastName.charAt(random.nextInt(lastName.length()));
	      password[2] = year.charAt(random.nextInt(year.length()));
	   
	      for(int i = 3; i< length ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	      System.out.println("Password generated is: ");
	      return password;
	   }
	}