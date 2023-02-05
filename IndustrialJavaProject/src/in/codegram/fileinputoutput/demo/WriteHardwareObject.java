package in.codegram.fileinputoutput.demo;

import java.io.File;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteHardwareObject {

	public static void main(String[] args) throws IOException {
	
		File file = new File("Hardware.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Hardware hardware = new Hardware();
		hardware.setName("Steel");
		hardware.setPrice(100);
		oos.writeObject(hardware);
		oos.close();
		fos.close();

	}

}
