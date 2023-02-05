package inheritancedemo;

public class Dog extends Animal {

	public Dog(String name) {
	
		super(name); //Passing parameter to superclass constructor. 
	}
	
	public void bark() {
		System.out.println(getName()+" is barking");
	}
	
}
