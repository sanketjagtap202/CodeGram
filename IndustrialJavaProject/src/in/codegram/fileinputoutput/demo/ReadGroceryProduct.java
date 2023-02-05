package in.codegram.fileinputoutput.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadGroceryProduct {

	public static void main(String[] args) throws IOException, Exception {
		File file = new File("grocery.txt");
		FileInputStream fis= new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		GroceryProduct groProduct = (GroceryProduct)ois.readObject();
		ois.close();
		fis.close();
		System.out.println(groProduct);

	}

}
