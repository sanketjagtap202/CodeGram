package inheritancedemo;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void bite() {
		System.out.println(getName()+" is biting");
	}
	

}
