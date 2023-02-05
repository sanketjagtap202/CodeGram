package in.codegram.inheritance;

public class CarsTest {

	public static void main(String[] args) {

//		Cars cars = new HondaCity("Honda Civic");
//		cars.gear();
//		cars.speed();

//		Cars cars = new Hyundai("i20 sports");
//		cars.gear();
//		cars.speed();

//		HondaCity car; // Compile Time check:
//		car = new HondaCity("Honda Civic"); // Run Time check:
//		car.gear();
//		car.speed();
//		car.safety();

Hyundai car; // Compile time check: Will be able to call method of declared type(Hyundai is type)
car = new Hyundai("i20 sports"); // Runtime check: Will be able to call methods of available object.
car.gear();
car.speed();
car.safety();

}

}
