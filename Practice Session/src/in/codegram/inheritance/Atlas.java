package in.codegram.inheritance;

public class Atlas extends Bicycle {

	
	
// USING CONSTRUCTOR:
	public Atlas(String name) {
		super(name);
	}

	public void gear() {
		System.out.println( getName()+" has a gear");
	}
}
