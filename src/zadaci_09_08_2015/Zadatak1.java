package zadaci_09_08_2015;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Implement the following method to sort the rows in a two dimensional array. A
 * new array is returned and the original array is intact. public static
 * double[][] sortRows(double[][] m) Write a test program that prompts the user
 * to enter a 3 * 3 matrix of double values and displays a new row-sorted
 * matrix.
 */

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[][] matrix = new double[3][3];
		
		// korsinnik unosi matricu
		System.out.print("Enter a 3-by-3 matrix row by row:");
		matrix = enterMatrix(input);
		
		// pozivanje metode
		double[][] sortedMatrix = sortRows(matrix);
		
		// printanje rezultata
		System.out.println("The row-sorted array is:");
		for (int i = 0; i < sortedMatrix.length; i++) {
			for (int j = 0; j < sortedMatrix[0].length; j++) {
				System.out.print(sortedMatrix[i][j] + " ");
			}
			System.out.println();
		}
		
		input.close();		

	}
	
	/** Metoda koja sortira redove u matrici */
	public static double[][] sortRows(double[][] m) {

		for (int i = 0; i < m.length; i++) {
			Arrays.sort(m[i]);
		}

		return m;
	}
	
	/** Metoda za unos 3 x 3 matrice */
	public static double[][] enterMatrix(Scanner input){
		double[][] matrix = new double[3][3];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = input.nextDouble();
				}
		}
		return matrix;
	}
}
