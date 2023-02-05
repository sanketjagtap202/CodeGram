package oopsassignment;

public class Person {
	private double salary;
	private double tax;
	
	public Person(double salary, double tax) {
		this.salary=salary;
		this.tax=tax;
	}

	public void calSalaryEmployee() {
		
		double netSalaryOfEmployee = salary-(salary*(tax*.01));
		System.out.println("Employee salary is: "+netSalaryOfEmployee);
		
	}
	
	public void calSalaryUnmployee() {
		
		double netSalaryOfUnmployee = salary-(salary*(tax*.01));
		System.out.println("Unmployee salary is: "+netSalaryOfUnmployee);
		
	}
	
public void calSalarySelfmployee() {
		
		double netSalaryOfSelfEmployee = salary-(salary*(tax*.01));
		System.out.println("Self Employee salary is: "+netSalaryOfSelfEmployee);
		
	}



	
}
