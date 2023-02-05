package oopsassignment;

public class PersonTest {

	public static void main(String[] args) {
		Person employee = new Employee(25000, 5);
		employee.calSalaryEmployee();
		
		System.out.println("-----------------");
		
		Person unemployee = new UnEmployed(2000, 3.5);
		unemployee.calSalaryUnmployee();
		
		System.out.println("-----------------");
		
		Person selfemployee = new SelfEmployed(30000, 10);
		selfemployee.calSalarySelfmployee();
	}

}
