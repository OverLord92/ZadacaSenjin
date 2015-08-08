package zadaci_08_08_2015;

import java.util.Scanner;

/**
 * Write a method to multiply two matrices. The header of the method is:
 * public static double[][] multiplyMatrix(double[][] a, double[][] b)
 */

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// unos prve matrice
		System.out.print("\tUnesite prvu 3 x 3 matricu: ");
		double[][] a = enterMatrix(input);

		// unos druge matrice
		System.out.print("\tUnesite drugu 3 x 3 matricu: ");
		double[][] b = enterMatrix(input);

		// racunanje rezultata
		double[][] c = multiplyMatrix(a, b);

		// printanje rezultata
		System.out.println("\nRezultat mnozenja matrica je: ");
		printMaticesOperation(a, b, c, 'X');

	}

	/** Metoda za unos matrice 3 x 3 */
	public static double[][] enterMatrix(Scanner input) {
		double[][] matrix = new double[3][3];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}

		return matrix;
	}

	/** Metoda koja mnozi dvije 3 x 3 matrice */
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {

		// broj kolona prve matrice mora biti jednak broju redova druge kolone
		if (a.length != b[0].length) {
			System.out.println("Matrice se ne mogu pomnoziti.");
			return null;
		} else {

			double[][] c = new double[3][3];
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b[0].length; j++) {
					c[i][j] = (a[i][0] * b[0][j]) + (a[i][1] * b[1][j])
							+ (a[i][2] * b[2][j]);

				}
			}

			return c;
		}

	}

	/** Metoda za vizualizaciju operacije dvaju matrica */
	public static void printMaticesOperation(double[][] a, double[][] b,
			double[][] c, char operation) {

		System.out.print("\n");
		for (int i = 0; i < a.length; i++) {
			// printanje prve matrice
			for (int j = 0; j < a[0].length; j++) {
				System.out.printf("%4.1f  ", a[i][j]);

			}

			if (i == a.length / 2)
				System.out.print("   " + operation + "   ");
			else
				System.out.print("       ");

			// printanje druge matrice
			for (int j = 0; j < b[0].length; j++) {
				System.out.printf("%4.1f  ", b[i][j]);
			}

			if (i == a.length / 2)
				System.out.print("   =   ");
			else
				System.out.print("       ");

			// printanje zbira matrica
			for (int j = 0; j < c[0].length; j++) {
				System.out.printf("%4.1f  ", c[i][j]);
			}

			System.out.println();
		}
	}

}
