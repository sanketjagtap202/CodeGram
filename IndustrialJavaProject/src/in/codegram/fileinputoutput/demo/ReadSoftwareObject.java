package in.codegram.fileinputoutput.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadSoftwareObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File file = new File("software.txt");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Software software = (Software)ois.readObject(); //downCasting
		ois.close();
		fis.close();
		System.out.println(software);
	}

}

/**
 * Here, To read the Object, We have to create a Object of FileInputStream(fis) And ObjectInputStream(ois) 
*/