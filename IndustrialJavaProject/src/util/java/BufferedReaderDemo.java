package util.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		
		String line;
		
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		
		while((line=br.readLine())!=null) {
			
			System.out.println(line);
		}
		
	}

}
