package zadaci_02_09_2015;

/**
 * *18.9 (Print the characters in a string reversely) Write a recursive method
 * that displays a string reversely on the console using the following header:
 * public static void reverseDisplay(String value)
 */

public class Zadatak2 {

	/** test program */
	public static void main(String[] args) {

		reverseDisplay("probni String");

	}

	/** Printa karaktere stringa u obrnutom smjeru */
	public static void reverseDisplay(String value) {

		if (value.length() == 0) // base case
			return;
		else {
			// printamo zadnji karakter stringa
			System.out.print(value.charAt(value.length() - 1));
			// pozivamo metodu sa substringom prethodnog stringa iskljucujuci
			// zadnji karakter
			value = value.substring(0, value.length() - 1);
			reverseDisplay(value);
		}

	}

}
