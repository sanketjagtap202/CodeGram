package Lab04_Assignment03;

public class StringExercise {
//	Case 1: to find "marc" in string

	public static int findmarc(String string) {
		
		if(string==null) {
			throw new RuntimeException("String shpuld not be blank");
		}
		return string.indexOf("marc");
	}

	// Case 2 : To find "marc" in substring:
	public static int findSubstring(String string, String string2) {
		
		
		
		return string2.indexOf("marc");
	}
	
	//Case 3: Returns true if and only if the string contains the substring.
	
	public static boolean contains(String string, String substring) 
	{
		if(string.contains(substring)) {
		return true;
		}else {
			return false;
		}
		
	}
	
	//Case 4: Splits a string into words, using whitespace to delimit the words.	

	public static String[] SplitIntoWrods(String string) {
		// TODO Auto-generated method stub
		
		String[] words = string.split("\\s+"); //\\s; used regex()
		return words;
	}

	//Case 5: Returns the substring representing the first four characters of the string.
	
	public static String firstFour(String string) {

		String subString= string.substring(0, 4);
//		int len=string.length();
//		System.out.println("lenth of first four: "+len);
		return subString;
	}
	
	//Case 6: Returns the substring representing the first n characters of the string.
	public static String firstN(String string, int i) {
		String subString= string.substring(0, i);
		return subString;
	}
	//Case7: Returns the substring representing the last four characters of the string.
	
	
	public static String lastFour(String string) {
	
	     String lastFour =string.substring(string.length()-4);
		return lastFour;
	}

	
	//Case 8: Returns the substring representing the last n characters of the string.
	
	public static String lastN(String str1, int nValue) {
		String subString= str1.substring(str1.length()-nValue);
		return subString;
	}
	
	
	
	
	
	
	
	
	
	
}


