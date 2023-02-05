package in.codegram.inheritance;

public class Cars {

	private String name;
	
	
	
	public Cars(String name) {
		this.name=name;
	}
	
	//Using getter property to get a name of car:
	
	public String getName() {
		return name;
	}

	public void speed() {
		System.out.println(name+" is in normal speed");
	}
	
	public void gear() {
		System.out.println(name+" has 5 gears");
	}
}
