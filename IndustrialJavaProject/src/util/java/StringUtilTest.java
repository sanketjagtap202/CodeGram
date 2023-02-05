/**
 * @Description: Generate a password using First name, last name and birth year.
 * @Author: Sanket 
 * @Date: 13-Jan-23
 */

package util.java;

import java.util.Random;


public class StringUtilTest {

	public static void main(String[] args) {
	System.out.println(generatePassword(6));
			
	}
	
	  private static char[] generatePassword(int length) {
	      String firstName = "Sanket";
	      String lastName = "Jagtap";
	
	      String year = "1995";
	      String combinedChars = firstName + lastName + year;
	      Random random = new Random();
	      char[] password = new char[length];

	      password[0] = firstName.charAt(random.nextInt(firstName.length()));
	      password[1] = lastName.charAt(random.nextInt(lastName.length()));
	      password[2] = year.charAt(random.nextInt(year.length()));
	   
	      for(int i = 3; i< length ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	      return password;
	   }

	

}
