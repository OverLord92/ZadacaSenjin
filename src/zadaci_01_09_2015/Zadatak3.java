package zadaci_01_09_2015;

/**
 * 18.4 (Sum series) Write a recursive method to compute the following series:
 * m(i) = 1 + 1 / 2 + 1 / 3 + .... + 1 / i; Write a test program that displays
 * m(i) for i = 1, 2, . . ., 10.
 */

public class Zadatak3 {

	/** Test program */
	public static void main(String[] args) {

		// print m(i) for numbers 1 to 10, including 10
		for (int i = 1; i <= 10; i++)
			System.out.printf("%2d\t%3.4f\n", i, recursiveM(i));
	}

	/** Calculates the series 1 + 1/2 + .. + 1 / number */
	public static double recursiveM(int number) {

		if (number == 1) // base case
			return 1;
		else {
			// calculates current element and calls the method for the previous element
			return (1.0 / number) + recursiveM(number - 1);
		}
	}

}
