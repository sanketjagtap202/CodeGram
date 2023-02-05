package util.java;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strInput = "My new array String";
		strInput.toLowerCase();
		int strLength = strInput.length();
		//System.out.println(strLength);
		for(strLength=strInput.length(); strLength>0;--strLength) {
			
			System.out.print(strInput.charAt(strLength-1));
		}
	}

}
