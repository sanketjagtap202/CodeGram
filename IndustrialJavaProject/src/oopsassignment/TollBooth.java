/*
 * Description: To find a number of cars passing from toll by paying and without paying
 * Author: Sanket
 * Date: 23 jan 2023
 */

package oopsassignment;

public class TollBooth {

	private int numberCars;
	private double amount; 
	
	
	public TollBooth() {
	
		numberCars=0;
		amount =0;
	}
	
	public final void payingCar() {
		numberCars++;
		amount+=50;
	}
	
	public final void noPaycar() {
		numberCars++;
	}
	
	public final void display() {
		System.out.println("Number of cars: "+numberCars);
		System.out.println("Total amount collected: "+amount);
	}
}
