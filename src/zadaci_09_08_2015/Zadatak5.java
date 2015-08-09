package zadaci_09_08_2015;

import java.util.Scanner;

/**
 * Design a class named Location for locating a maximal value and its location
 * in a two-dimensional array. The class contains public data fields row,
 * column, and maxValue that store the maximal value and its indices in a
 * two-dimensional array with row and column as int types and maxValue as a
 * double type. Write the following method that returns the location of the
 * largest element in a two-dimensional array: public static Location
 * locateLargest(double[][] a)
 */

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// unos clanova matrice
		double[][] values;
		System.out.print("Enter the number of rows and columns in the array: ");
		values = enterMatrix(input.nextInt(), input.nextInt(), input);

		// kreiranje instance klase Location sa lokacijom najveceg clana u
		// matrici
		Location max = locateLargest(values);

		// printanje rezultata
		System.out.println("The location of the largest element is "
				+ max.maxValue + " at (" + max.row + "," + max.column + ").");

	}

	/**
	 * Metoda koja vraca instancu Location-a sa lokacijom najveceg clana u
	 * matrici
	 */
	public static Location locateLargest(double[][] a) {
		int maxRow = 0;
		int maxColumn = 0;
		double maxValue = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] > maxValue) {
					maxValue = a[i][j];
					maxRow = i;
					maxColumn = j;
				}
			}
		}
		return new Location(maxRow, maxColumn, maxValue);
	}

	/** Metoda za unos matrice */
	public static double[][] enterMatrix(int rows, int columns, Scanner input) {
		System.out.println("Enter the array: ");
		double[][] matrix = new double[rows][columns];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		return matrix;
	}

}

// klasa Location 
class Location {
	public int row;
	public int column;
	public double maxValue;

	// konstruktor
	Location(int row, int column, double maxValue) {
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}
}
