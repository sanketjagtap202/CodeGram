package util.java;

import java.util.Iterator;

public class ArrayTypeDemo {

	public static void main(String[] args) {
		 int arr[][] = new int[2][3]; //o/p will be: [[ I @  515f550a 
		
		  arr[0][0]=10;
		  arr[0][1]=20;
		  arr[0][2]=30;
		  //And
		  arr[1][0]=40;
		  arr[1][1]=50;
		  arr[1][2]=60;
		System.out.println("Length of arr is : " + arr.length);
	 System.out.println("Lenth of arr[0] is: "+arr[0].length);
	 
	 for (int i = 0; i <= arr.length; i++) {
		
		 for (int j = 0; j <= arr.length; j++) {
			System.out.print(arr[i][j]+" ");
		}
		 System.out.println();
	}
		
	}

}
