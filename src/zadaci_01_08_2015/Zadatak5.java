package zadaci_01_08_2015;

import java.util.Scanner;

/**
 * Write a method which prints a n x n matrix using the following header:
 * public static void printMatrix(int n)
 * Every element in the matrix is either 0 or 1 which is randomly choosen.
 */

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// user enters matrix dimensions
		System.out.print("  Enter the dimension of the matrix: ");

		// print result
		printMatrix(input.nextInt());

		input.close();

	}

	/** Prints a randomly generated n x n matrix */
	public static void printMatrix(int n) {

		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print("    ");
			
			for (int j = 0; j < n; j++) 
				System.out.print((int) (Math.random() * 2) + " ");

			System.out.println();
		}

	}

}
