/*
 * Description: Searches for "Marc" in a string. 
 */

package Lab04_Assignment03;

import java.util.Scanner;

public class StringExercisesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
// Case 1: to find "marc" in String:		
int result=StringExercise.findmarc("This is my first marc String");
System.out.println("index of the first occurance of the “Marc” in the string is: "+result);

// Case 2: to find "marc" in subString:
int result1 = StringExercise.findSubstring("This is substring", "To find marc");
System.out.println("index of the first occurance of the “Marc” in the substring is: "+result1);

// Case 3: Returns true if and only if the string contains the substring.

boolean result2 = StringExercise.contains("I am boy","girl");
System.out.println("Result:"+result2);
				

//Case 4: Splits a string into words, using whitespace to delimit the words.

		String[] result3=StringExercise.SplitIntoWrods("Hello Akshay");
//		System.out.println("Array is: "+result3);
		
		 for(String word: result3) {

		        System.out.println(word);

		        }
		 
//Case 5: Returns the substring representing the first four characters of the string.
		 
		String result4= StringExercise.firstFour("Hello Sanket");
		 System.out.println("First four letter of string is: "+result4);
		
//Case 6: Returns the substring representing the first n characters of the string.
		 
//		 Scanner sc = new Scanner(System.in);
//		 System.out.println("Enter a String");
//		  String str1 = sc.nextLine();
//		  System.out.println("Enter a n Value:");
//		   int nValue = sc.nextInt();
//		 
//		 
//		String result5= StringExercise.firstN(str1, nValue);
//		 System.out.println("First "+ nValue + " character of string is: "+result5);
		 
//Case 7: Returns the substring representing the last four characters of the string.		 
		 
		 String result6= StringExercise.lastFour("Hello Sanket");
		 System.out.println("Last four letter of string is: "+result6);
		 
// Case 8 : Returns the substring representing the last n characters of the string.	
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a String");
		  String str1 = sc.nextLine();
		  System.out.println("Enter a n Value:");
		   int nValue = sc.nextInt();
		 
		 
		String result7= StringExercise.lastN(str1, nValue);
		 System.out.println("Last "+ nValue + " character of string is: "+result7);
	}

}
