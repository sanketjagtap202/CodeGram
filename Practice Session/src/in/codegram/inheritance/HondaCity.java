package in.codegram.inheritance;

public class HondaCity extends Cars {

	public HondaCity(String name) {
		super(name);
	}
	
	public void safety() {
		System.out.println(getName()+" has 4 air bags");
	}

}
