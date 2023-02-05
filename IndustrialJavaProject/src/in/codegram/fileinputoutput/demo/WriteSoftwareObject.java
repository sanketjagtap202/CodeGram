package in.codegram.fileinputoutput.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteSoftwareObject {

	public static void main(String[] args) throws IOException {
		
		File file = new File("software.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Software software = new Software();
		software.setName("CADCAM");
		software.setPrice(10000);
		oos.writeObject(software);
		oos.close();
		fos.close();

	}

}

/**
 * Here, To write a object, we have to create object of FileOutputstream(fos) and ObjectOutputStream(oos) 
*/