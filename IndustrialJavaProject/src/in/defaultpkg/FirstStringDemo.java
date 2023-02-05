package in.defaultpkg;

class Employee{
	String name;
	
	public Employee(String name) //Created a constructor
	{
		
		this.name=name;
		
	}

	@Override
	public String toString() {
		return this.name;
	}
	
	
}


public class FirstStringDemo {

	public static void main(String[] args) {
		
	//	String str = "Hello";//Only possible way to create a object using String class
		String str = new String("Hello");
		Employee emp = new Employee("Amit");
		System.out.println(str.toString());
		System.out.println(emp.toString());
		
		

	}

}
