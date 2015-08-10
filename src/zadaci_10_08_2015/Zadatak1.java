package zadaci_10_08_2015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * The two-dimensional arrays m1 and m2 are identical if they have the same
 * contents. Write a method that returns true if m1 and m2 are identical, using
 * the following header: public static boolean equals(int[][] m1, int[][] m2)
 */

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// unos prve matrice
		System.out.print("Enter list1: ");
		double[][] m1 = enterMatrix(3, 3, input);

		// unos druge matrice
		System.out.print("Enter list2: ");
		double[][] m2 = enterMatrix(3, 3, input);

		// printanje rezultata
		System.out.println(equals(m1, m2) ? "The two arrays are identical"
				: "The two arrays are not identical");

	}

	/**
	 * Metoda koja vraca true ukoliko matrice imaju iste elemente, koji nisu
	 * nuzno u istom redoslijedu
	 */
	public static boolean equals(double[][] m1, double[][] m2) {

		// provjeracamo da li su dimenzije matrica jednake
		if (m1.length != m2.length || m1[0].length != m2[0].length)
			return false;

		// arrayliste u koje ubacujemo sadrzaj matrica
		ArrayList<Double> list1 = new ArrayList<>();
		ArrayList<Double> list2 = new ArrayList<>();

		// elemente iz matrice m1 ubacujemo u listu list1, a
		// elemente iz matrice m2 u listu list2
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				list1.add(m1[i][j]);
				list2.add(m2[i][j]);
			}
		}

		// sortiramo liste sa elementima iz matrica
		Collections.sort(list1);
		Collections.sort(list2);

		// i provjeravamo da li su liste identicne
		// ako su liste identicne matrice imaju isti sadrzaj
		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i).doubleValue() != list2.get(i).doubleValue()) {
				return false;
			}
		}

		return true;
	}

	/** Metoda za unos matrice od strane korisnika */
	public static double[][] enterMatrix(int rows, int columns, Scanner input) {
		double[][] matrix = new double[rows][columns];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		return matrix;
	}

}
