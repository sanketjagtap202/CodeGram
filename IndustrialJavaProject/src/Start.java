/**
 * @Description: Code for reverse the given number
 * @Author: Sanket 
 * @Date: 11-jan-2023
 */



public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("Hello CODEGRAM!!");
//		System.out.println("Hello Java ");
		
		//Using While loop :
		int number = 53421;
		int reverse = 0;
		while(number!=0)
		{
			int remainder = number % 10;
			reverse = reverse*10 + remainder;
			number = number/10;
		}
		System.out.println("Reverse Number is: "+reverse);
//
		// Using for loop :
		
//		int number =123654;
//		int reverse = 0;
//		for(;number!=0;)
//		{
//			int remainder = number%10;
//			reverse = reverse*10 + remainder;
//			number=number/10;
//		}
//		System.out.println("Reverse number is : "+reverse);
	}

}
