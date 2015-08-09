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
 * 
 * 
 * Location je definisana kao genericna klasa
 * metoda locateLargest kao genericna metoda
 */

public class Zadatak5Generics {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// generisanje matrice
		Double[][] values;
		System.out.print("Enter the number of rows and columns in the array: ");
		values = enterMatrix(input.nextInt(), input.nextInt(), input);

		// kreiranje instnce Locaation
		GenericLocation<Double> max = locateLargest(values);
		// printanje rezultata
		System.out.println("The location of the largest element is "
				+ max.maxValue + " at (" + max.row + "," + max.column + ").");

	}

	/** Genericna metoda za pronalazenje lokacije najveceg clana u matrici */
	public static <T extends Comparable<T>> GenericLocation<T> locateLargest(T[][] a) {
		int maxRow = 0;
		int maxColumn = 0;
		T maxValue = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j].compareTo(maxValue) == 1) {
					maxValue = a[i][j];
					maxRow = i;
					maxColumn = j;
				}
			}
		}
		return new GenericLocation<T>(maxRow, maxColumn, maxValue);
	}

	/** Metoda za unos matrice odredjene velicine matrice */
	public static Double[][] enterMatrix(int rows, int columns, Scanner input) {
		System.out.println("Enter the array: ");
		Double[][] matrix = new Double[rows][columns];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		return matrix;
	}

}

// genericna klasa GenericLocation koja radi sa svim vrstama objekata koji implementiraju
// comparable interface
class GenericLocation<T extends Comparable<T>> {
	// data polja su public pa nema potrebe za geterima i seterima
	public int row;
	public int column;
	public T maxValue;

	// konstruktor
	GenericLocation(int row, int column, T maxValue) {
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}
}
