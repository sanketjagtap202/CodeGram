package classobject;

public class ClassObjectTest {

	public static void main(String[] args) {
		Dog dog = new Dog(); //Obj created
		
		//dog.name="Tommy";
		//dog.age = -5;
		
		//Using setters, u can assign value to name and age
		
		dog.setName("Tommy");
	dog.setAge(10); //Age can never be negative
		dog.eat();
		dog.run();

	}

}
