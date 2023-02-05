package in.codegram.inheritance;

public class AnimalTest {

	public static void main(String[] args) {
//		Animal animal = new Animal();
//		animal.eat();
//		animal.run();
		
		//TO MAKE A OBJ OF DOG CLASS:
//	Animal animal = new Dog("Tiger");
//	animal.eat();
//	animal.run();
		
		//TO MAKE A OBJ OF CAT CLASS:
		
//		Animal animal = new Cat("Billi");
//		animal.eat();
//		animal.run();
	
		
/**
 * CASE 1: When we have to access the method of its own class with the superclass methods:		
 */
		
//		Dog dog; //Compile time check: You will be able to call method of Declared Type.
//		dog = new Dog("Tiger"); //Run time check: It will be able to call method of available obj. 
//		dog.eat();
//		dog.run();
//		dog.bark(); // To get a name of Dog, we have to use a getter property in Animal class.
		
	 Cat cat;    // Compile time check:
	 cat = new Cat("Billi"); // Runtime Check:
	 cat.eat();
	 cat.run();
	 cat.bite();  //To get a name of cat, we have to use getter property in Animal.
	
	}

}
