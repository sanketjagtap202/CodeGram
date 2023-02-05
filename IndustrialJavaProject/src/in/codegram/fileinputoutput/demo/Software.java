package in.codegram.fileinputoutput.demo;

import java.io.Serializable;

public class Software implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		return "Software [name=" + name + ", price=" + price + "]";
	}
	
	
}
