package zadaci_01_09_2015;

/** 18.5 (Sum series) Write a recursive method to compute the following series:
m(i) = 1/3 + 2/5 + .... + i / (2 * i + 1);
Write a test program that displays m(i) for i = 1, 2, . . ., 10. */

public class Zadatak4 {

	/** Test program */
	public static void main(String[] args) {

		// prints m(i) for numbers 1 to 10, including 10
		for (int i = 1; i <= 10; i++)
			System.out.printf("%2d\t%3.4f\n", i, recursiveM(i));
	}

	/** Calculates the series 1 / 3 + 2 / 5 + .. + number / (2 * number + 1) */
	public static double recursiveM(int number) {

		if (number == 1) // base case
			return 1.0 / 3;
		else {
			// calculates current element and calls the method for the previous element
			return ((double)number / (2 * number + 1)) + recursiveM(number - 1);
		}
	}

}