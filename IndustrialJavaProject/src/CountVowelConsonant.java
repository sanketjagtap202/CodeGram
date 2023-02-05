/**
 * @Description: To find vowels and consonant from sentence
 * @Author: Sanket 
 * @Date: 11-jan-2023
*/

public class CountVowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vCount =0; //For vowels count(a,e,i,o,u)
		int cCount = 0; //for consonant count
		
		String str="This is my first program in Java";
		
		str = str.toLowerCase();
		
		for(int i=0; i<str.length(); i++) 
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'||str.charAt(i)=='o'|| str.charAt(i)=='u')
			{
				vCount++;
			}
		
		else if(str.charAt(i)>='a'&& str.charAt(i)<='z') 
		   {
			
			cCount++;
		   }
		}
		System.out.println("Number of Vowels: "+vCount);
		System.out.println("Number of consonant: "+cCount);
	}

}
