package in.codegram.fileinputoutput.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadHardwareObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File file = new File("Hardware.txt");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Hardware hardware =(Hardware)ois.readObject();
		ois.close();
		fis.close();
		System.out.println(hardware);
	}

}
