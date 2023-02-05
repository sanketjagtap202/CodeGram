package abstractiondemo;

public class CarTest {

	public static void main(String[] args) {
		
		
		Car driver= new Maruti();
		// cannot create a obj. of abstract class(Car),but can create a obj of Maruti.
		driver.drive();
		driver.stop();
		driver.tankFilling();
		
		System.out.println("--------xxx-----------");
		
		Car driver1 = new Honda();
		driver1.drive();
		driver1.stop();
		driver1.tankFilling();

	}

}
