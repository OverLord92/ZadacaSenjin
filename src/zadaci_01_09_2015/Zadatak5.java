package zadaci_01_09_2015;

/**
 * (Sum series) Write a recursive method to compute the following series: m(i) =
 * 1 / 2 + 2 / 3 + ..... + i / (i + 1) Write a test program that displays m(i)
 * for i = 1, 2, . . ., 10.
 */

public class Zadatak5 {

	/** Test program */
	public static void main(String[] args) {

		// print m(i) for the numbers 1 to 10
		for (int i = 1; i <= 10; i++)
			System.out.printf("%2d\t%3.4f\n", i, recursiveM(i));
	}

	/** Calculate the series 1/2 + 2 / 3 + ... + number / (number + 1) */
	public static double recursiveM(int num) {

		if (num == 1) // base case
			return 0.5;
		else {
			// calculates the current element and calls the method for the
			// previous element in the series
			return ((double) num / (num + 1)) + recursiveM(num - 1);
		}
	}

}
