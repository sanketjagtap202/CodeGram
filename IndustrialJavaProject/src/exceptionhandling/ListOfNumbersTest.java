package exceptionhandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ListOfNumbersTest {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		File file = new File("test.txt");
/**
 * 		Description: this is for fileWrite
 */

//        FileWriter fileWriter = new FileWriter(file);
//		
//		System.out.println("Enter a Message: ");
//		String message  = sc.nextLine();
//		
//		fileWriter.write(message);
//		fileWriter.close();
//		System.out.println("Success! Please check your file");

		/**
		 * 		Description: this is for fileReader:
		 */	
		
		FileReader fileReader = new FileReader(file);
			int i;
			StringBuilder sb = new StringBuilder();
			while((i=fileReader.read())!=-1) {
				sb.append((char)i);
			}
			fileReader.close();
		System.out.println(sb);

	}

}
