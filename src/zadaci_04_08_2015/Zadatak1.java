package zadaci_04_08_2015;

import java.util.Scanner;

/**
 * Write a program which takes ASCII code of a character and prints the
 * corresponding character.
 */

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// user enters ASCII code
		System.out.print("\nEnter  ASCII code: ");
		int numChar = input.nextInt();

		// print result
		System.out.println("The corresponding character is: " + (char) (numChar));

		input.close();

	}

}
