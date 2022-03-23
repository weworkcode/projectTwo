public class MilesToKM {
    public static void main(String[] args) {
		// Create a constant number of kilometers in a mile
		final double kmpm = 1.609; 

		// Display table header
		System.out.println(
			"Miles        Kilometers");

		// Create and display table showing conversion from miles to kilometers
		for (int i = 1; i <= 10; i++) {
			System.out.printf(
				"%-13d%-10.3f\n", i, (i * kmpm));
		}
	}
}
