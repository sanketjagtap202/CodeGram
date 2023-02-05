package in.codegram.inheritance;

public class Bicycle {
	private String name;

	
// USING SETTER METHOD:
//	public void setName(String name) {
//		this.name = name;
//	}
	
// USING CONSTRUCTOR:	
	
	public Bicycle(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void sit() {
		System.out.println(name + " has a sit");
	}

	public void carrier() {
		System.out.println(name + " has a carrier");
	}
}
