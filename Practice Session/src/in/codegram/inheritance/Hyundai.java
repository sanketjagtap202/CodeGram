package in.codegram.inheritance;

public class Hyundai extends Cars {

	public Hyundai(String name) {
		super(name);
		
	}
	
	public void safety() {
		System.out.println(getName()+" has 2 air bags");
	}

}
