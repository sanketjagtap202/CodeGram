package util.java;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Initialize array  
        int [] arr = new int [] {10, 20, 30, 40, 50};  
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
        System.out.println("Array in reverse order: ");  
        //Loop through the array in reverse order  
        for (int i = arr.length-1; i > 0; i--) {  
            System.out.print(arr[i] + " ");  
        }  
	}

}
