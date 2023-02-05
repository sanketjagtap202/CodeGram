package util.java;

public class ArrayDemo {

	public static void main(String[] args) {
		int arr[];// array declairation
		arr= new int[5]; // Instantiation: when obj. is created for the array.
		arr[0]= 10; 
		arr[1]=20;
		
		for (int i : arr) //for each loop: it will show one element from arr collection at a time
			
		{
			System.out.println(i);
			
		}
		

	}

}
