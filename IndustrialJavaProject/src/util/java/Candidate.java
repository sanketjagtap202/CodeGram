package util.java;

public class Candidate {

	private int salary;
	private double tax;
	public Candidate(int salary, double tax) {
		this.salary=salary;
		this.tax = tax;
	}
	public void calSalary1() {
		double netSalary = salary-(salary*(tax*.01));
		System.out.println("Net salary of student is is: "+netSalary);
	
	}
	
	public void calSalary2() {
		double netSalary2 = salary-(salary*(tax*.01));
		System.out.println("Net salary of employee is: "+netSalary2);
	}
}
