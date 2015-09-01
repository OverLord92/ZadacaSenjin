package zadaci_01_09_2015;

/** 18.5 (Sum series) Write a recursive method to compute the following series:
m(i) = 1/3 + 2/5 + .... + i / (2 * i + 1);
Write a test program that displays m(i) for i = 1, 2, . . ., 10. */

public class Zadatak4 {

	/** Test program */
	public static void main(String[] args) {

		// printanje rezultata
		for (int i = 1; i <= 10; i++)
			System.out.printf("%2d\t%3.4f\n", i, recursiveM(i));
	}

	/** Metoda koja vraca zbir serije 1 / 3 + 2 / 5 + .. + num / (2 * num + 1) */
	public static double recursiveM(int num) {

		if (num == 1) // base case
			return 1.0 / 3;
		else {
			// rekurzivno pozivanje metode
			return ((double)num / (2 * num + 1)) + recursiveM(num - 1);
		}
	}

}