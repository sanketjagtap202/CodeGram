package exceptionhandling;

public class StringCalculator {

	public int calculate(String input) {

		int addition = 0;
		try {
			String[] numbers = input.split(",");

			for (String number : numbers) {
				addition += Integer.parseInt(number);
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid format " + e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return addition;

	}

}
