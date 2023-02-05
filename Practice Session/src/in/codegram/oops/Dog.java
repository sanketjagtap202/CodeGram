package in.codegram.oops;

public class Dog {
	
	private String name;
	private int age;
	 
	
	// Setter property: 
	 public void setName(String name) {
		this.name = name;
	}
	 
	 public void setAge(int age) {
		 
		 if(age<0) {
			 throw new RuntimeException("Negative age is not allowed");
		 }
		this.age = age;
	}
	
	public void eat() {
		System.out.println(name+" is eating: age: "+age);
	}
	
	public void run() {
		System.out.println(name+" is running: age: "+age);
	}

}
