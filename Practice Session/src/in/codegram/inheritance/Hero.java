package in.codegram.inheritance;

public class Hero extends Bicycle {

	
	
// USING CONSTRUCTOR:
	public Hero(String name) {
		super(name);
		
	}

	public void gear() {
		System.out.println(getName()+" has no gear");
	}
}
