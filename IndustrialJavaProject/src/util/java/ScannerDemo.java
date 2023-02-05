package util.java;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		
		 String name;
		 int age;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter user name: ");
		 name = sc.next();
		 System.out.println("Enter user age: ");
		age = sc.nextInt();
		
		System.out.println("User name is: "+name);
		System.out.println("User age is: "+age);
		 

	}

}
