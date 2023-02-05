package in.codegram.fileinputoutput.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteGroceryProduct {

	public static void main(String[] args) throws IOException {
	
		File file = new File("grocery.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		GroceryProduct groProduct = new GroceryProduct();
		groProduct.setGroceryName("Peanut");
		groProduct.setGroceryPrice(500);
		
		oos.writeObject(groProduct);
		oos.close();
		fos.close();

	}

}
