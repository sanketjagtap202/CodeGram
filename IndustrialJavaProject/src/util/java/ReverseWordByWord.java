/*
 * main Class: To reverse the string word by word
 * @Author: Sanket J
 * Assignment: Lab03
 */

package util.java;

public class ReverseWordByWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[] = "Hello to java program".split(" "); 
	      String ans = ""; 
	      for (int i = s.length - 1; i >= 0; i--) { 
	        ans += s[i] + " "; 
	      } 
	      System.out.println("Reversed String: " + ans);
	}

}
