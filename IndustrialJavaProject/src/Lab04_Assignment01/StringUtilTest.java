package Lab04_Assignment01;

/*
 * Assignment to generate password from first name, last name and Year of birth
*/

public class StringUtilTest {

	public static void main(String[] args) {
	
		StringUtil stringUtil = new StringUtil();
		String createPassword	=stringUtil.generatePassword("AKsHAY", "GHaTage", "1990");
		System.out.println("Your passowrd is: "+createPassword);
	}

}
