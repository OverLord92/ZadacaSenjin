package zadaci_09_08_2015;

import java.util.Scanner;

/**
 * The two-dimensional arrays m1 and m2 are strictly identical if their
 * corresponding elements are equal. Write a method that returns true if m1 and
 * m2 are strictly identical, using the following header: public static boolean
 * equals(int[][] m1, int[][] m2) Write a test program that prompts the user to
 * enter two 3 * 3 arrays of integers and displays whether the two are strictly
 * identical. Here are the sample runs.
 */

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// unos prve matrice
		int[][] list1;
		System.out.print("Enter list1: ");
		list1 = enterMatrix(input);

		// unos druge matrice
		int[][] list2;
		System.out.print("Enter list2: ");
		list2 = enterMatrix(input);

		// printanje rezultata
		System.out
				.println(equals(list1, list2) ? "The two arrays are strictly identical"
						: "The two arrays are not strictly identical");

	}

	/** Metoda koja provjerava da li su matrice identicne */
	public static boolean equals(int[][] m1, int[][] m2) {
		boolean isEqual = true;

		// provjeracamo da li je broj redova i kolona matrica jednak
		if (m1.length != m2.length || m1[0].length != m2[0].length) {
			return false;
		} else {
			// provjeravamo da li su clanovi matrica identicni
			for (int i = 0; i < m1.length; i++) {
				for (int j = 0; j < m1[0].length; j++) {
					if (m1[i][j] != m2[i][j]) {
						isEqual = false;
						break;
					}
				}
			}
		}

		return isEqual;

	}

	/** Metoda za unos 3 x 3 matrice */
	public static int[][] enterMatrix(Scanner input) {
		int[][] matrix = new int[3][3];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		return matrix;
	}

}
