package zadaci_02_08_2015;

import java.util.Scanner;

/**
 * Write a program that asks the user to enter an integer and prints a pyramid
 * of this numbers.
 */

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// user enters the dimension of the pyramid
		System.out.print("Enter the dimension of the pyramid: ");
		int number = input.nextInt();

		// print the pyramid
		for (int currentRow = 1; currentRow <= number; currentRow++) {

			// loop for printing the empty spaces
			for (int j = 1; currentRow <= number - j; j++) {
				System.out.print("  ");
			}

			// print the left side of the pyramid
			for (int k = 1; k < currentRow; k++)
				System.out.print(k + " ");

			// print the right side of the pyramid
			for (int l = currentRow; l > 0; l--) {
				System.out.print(l + " ");
			}

			System.out.println();
		}

		input.close();
	}

}
