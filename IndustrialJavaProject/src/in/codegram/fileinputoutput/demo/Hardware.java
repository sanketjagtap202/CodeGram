package in.codegram.fileinputoutput.demo;

import java.io.Serializable;

public class Hardware implements Serializable {

	String name;
	int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Hardware [name=" + name + ", price=" + price + "]";
	}

}
