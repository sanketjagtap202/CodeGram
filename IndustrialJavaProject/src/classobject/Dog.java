package classobject;

public class Dog {
//Adjectives/ States
	private String name; 
	/*
	 * Whene we create name, age fields as private, it will not be access by any obj created in test file.
	 * 
	 */
	private int age;
	//Properties: setters: is a property 
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if(age<0) {
		//	System.out.println("Negative age is not allowed");
	throw new RuntimeException("Negative age is not allowed");	
		}
		this.age = age;
	}
	
	
	
	//Verbs/Behaviour
	
	
	void eat() {
		System.out.println(name +" is eating: Age is: "+age);
	};
	
	void run() {
		System.out.println(name+ " is running");
		
	};
	
	
}
