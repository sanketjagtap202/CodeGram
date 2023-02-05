package in.codegram.fileinputoutput.demo;

import java.io.Serializable;

public class GroceryProduct implements Serializable {

	String groceryName;
	int groceryPrice;
	public String getGroceryName() {
		return groceryName;
	}
	public void setGroceryName(String groceryName) {
		this.groceryName = groceryName;
	}
	public int getGroceryPrice() {
		return groceryPrice;
	}
	public void setGroceryPrice(int groceryPrice) {
		this.groceryPrice = groceryPrice;
	}
	@Override
	public String toString() {
		return "GroceryProduct [groceryName=" + groceryName + ", groceryPrice=" + groceryPrice + "]";
	}
	
	
}
