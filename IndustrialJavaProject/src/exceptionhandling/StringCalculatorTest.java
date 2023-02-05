/**
 * Description: Lab06 Assignments:Question 3: To add a numbers with commas
 */

package exceptionhandling;

public class StringCalculatorTest {

	public static void main(String[] args) {

		StringCalculator cal = new StringCalculator();

		int case1 = cal.calculate("30,10");
		System.out.println(case1);
		int case2 = cal.calculate("10");
		System.out.println(case2);
		int case3 = cal.calculate("");
		System.out.println(case3);
		int case4 = cal.calculate("One, 10");
		// System.out.println(case4);
	}

}
