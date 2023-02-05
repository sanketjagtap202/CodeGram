package in.codegram.fileinputoutput.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class ReadObjectDemo {

	public static void main(String[] args) throws Exception {
		File file = new File("Product.txt");
		 FileInputStream fis = new FileInputStream(file);
		 ObjectInputStream ois = new ObjectInputStream(fis);
		Product product=(Product)ois.readObject(); //downCasting
		ois.close();
		fis.close();
		System.out.println(product);
	}

}
