package in.defaultpkg;

public class SecondStringDemo {

	public static void main(String[] args) {
//		String str1 = "Hello";
//		String str2 = "Hello";
//		System.out.println(str1);
//		System.out.println(str2);
//		
//		if(str1==str2)// with == signs, it is comparing the ref. of Strings not objects 
		{
//			System.out.println("Both string values are same");
//		}
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		System.out.println(str1);
		System.out.println(str2);
		
		if(str1==str2) {
			System.out.println("Both String Values are same");
		}

	}

}
