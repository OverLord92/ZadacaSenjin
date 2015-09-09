package zadaci_02_09_2015;

/**
 * *18.9 (Print the characters in a string reversely) Write a recursive method
 * that displays a string reversely on the console using the following header:
 * public static void reverseDisplay(String value)
 */

public class Zadatak2 {

	/** Test program */
	public static void main(String[] args) {

		reverseDisplay("probni String");

	}

	/** Prints the charactes of the string in reverse */
	public static void reverseDisplay(String value) {

		if (value.length() == 0) // base case
			return;
		else {
			// print the first character from rigth
			System.out.print(value.charAt(value.length() - 1));

			// calling the method again with a substring of the previous string
			value = value.substring(0, value.length() - 1);
			reverseDisplay(value);
		}

	}

}
