package zadaci_02_09_2015;

/**
 * *18.13 (Find the largest number in an array) Write a recursive method that
 * returns the largest integer in an array. Write a test program that prompts
 * the user to enter a list of eight integers and displays the largest element.
 */

public class Zadatak5 {

	/** Test program */
	public static void main(String[] args) {

		int[] arr = { 4, 5, 99, 1, 98, 102, 2 };

		System.out.println(max(arr));

	}

	/** Helper metoda koja poziva max metodu */
	public static int max(int[] arr) {

		// provjeravamo da li je niz prazan
		if (arr == null || arr.length == 0) {
			// ako je je niz prazan metoda vraca -1
			return -1;
		} else {
			return max(arr, arr.length - 1);
		}
	}

	/** Metoda koja vraca najveci broj u nizu */
	public static int max(int[] arr, int index) {

		// uzimamo prvi clan niza kao max
		int max = arr[0];

		// ukoliko je index < 0 metoda prekida
		if (index < 0) // base case
			return max;

		else {
			// provjeravamo da li je broj na trenutnoj poziciji veci od max
			if (arr[index] > max) {
				// ukoliko jest max dobija novu vrijesnost
				max = arr[index];
				return max;
			} else {
				// ponovno pozivanje metode
				return max(arr, index - 1);
			}
		}

	}

}
