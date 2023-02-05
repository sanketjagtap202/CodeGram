package inheritancedemo;

public class AnimalTest {

	public static void main(String[] args) {
	
//		Animal animal = new Cat("Siri");
//		animal.eat();
//		animal.run();
	
/*
 * To use method from your subclasses here:		
 */
		Dog dog = new Dog("Tommy");
		dog.eat();
		dog.run();
		dog.bark();
		System.out.println("---------------");
		Cat cat = new Cat("Siri");
		cat.bite();

	}

}
