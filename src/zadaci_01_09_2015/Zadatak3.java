package zadaci_01_09_2015;

/**
 * 18.4 (Sum series) Write a recursive method to compute the following series:
 * m(i) = 1 + 1 / 2 + 1 / 3 + .... + 1 / i; Write a test program that displays
 * m(i) for i = 1, 2, . . ., 10.
 */

public class Zadatak3 {

	/** Test program */
	public static void main(String[] args) {

		// printanje rezultata
		for (int i = 1; i <= 10; i++)
			System.out.printf("%2d\t%3.4f\n", i, recursiveM(i));
	}

	/** Metoda koja vraca zbir serije 1 + 1/2 + .. + 1 / num */
	public static double recursiveM(int num) {

		if (num == 1) // base case
			return 1;
		else {
			// rekurzivno pozivanje metode
			return (1.0 / num) + recursiveM(num - 1);
		}
	}

}
