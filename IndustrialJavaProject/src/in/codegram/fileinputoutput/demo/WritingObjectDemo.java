package in.codegram.fileinputoutput.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class WritingObjectDemo {

	public static void main(String[] args) throws Exception {
		
		
		File file = new File("Product.txt");
		FileOutputStream fos= new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Product product = new Product();
		product.setName("Iphone");
		product.setPrice(70000);
		oos.writeObject(product);
		oos.close();
		fos.close();

	}

}
