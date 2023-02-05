/*
 * Main class: To find the frequency of number in an arrayy
 * @Author: Sanket J.
 */


package Lab03_Assignment01;
import java.util.Arrays;
import java.util.Scanner;
public class AssignmentQuestion1 {

	static int freq(int arr[],int n, int x)
	{
		int count = 0;
		for (int i=0; i < n; i++)
			if (arr[i] == x)
				count++;
		return count;
	}
	
	
	public static void main(String[] args) {
	
		 int arr[] = {11,11,24,42,35,42,34,35,45,42};
	        int x=24;
	        int n = arr.length;
	        System.out.println("Length of a[]="+arr.length);
	        System.out.println("The frequency of a searched number = "+freq(arr,n,x));
		
		
		
       
	

}
}