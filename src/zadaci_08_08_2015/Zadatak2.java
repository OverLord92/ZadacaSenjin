package zadaci_08_08_2015;

import java.util.Scanner;

/**
 * Write a method to multiply two matrices. The header of the method is: public
 * static double[][] multiplyMatrix(double[][] a, double[][] b)
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

	/** Input method for a 3 x 3 matrix */
	public static double[][] enterMatrix(Scanner input) {
		double[][] matrix = new double[3][3];

		for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < matrix[0].length; columnIndex++) {
				matrix[rowIndex][columnIndex] = input.nextDouble();
			}
		}

		return matrix;
	}

	/** Multiply two 3 x 3 matrices */
	public static double[][] multiplyMatrix(double[][] firstOperand,
			double[][] secondOperand) {

		// the number of columns in the first matrix must equal the number if
		// rows in the second matrix
		if (firstOperand.length != secondOperand[0].length) {

			// if this is not the case print error message
			System.out.println("Matrice se ne mogu pomnoziti.");
			return null;

		} else {

			// process of multiplication
			double[][] resultMatrix = new double[3][3];
			for (int rowIndex = 0; rowIndex < firstOperand.length; rowIndex++) {
				for (int columnIndex = 0; columnIndex < secondOperand[0].length; columnIndex++) {
					resultMatrix[rowIndex][columnIndex] = (firstOperand[rowIndex][0] * secondOperand[0][columnIndex])
							+ (firstOperand[rowIndex][1] * secondOperand[1][columnIndex])
							+ (firstOperand[rowIndex][2] * secondOperand[2][columnIndex]);

				}
			}

			return resultMatrix;
		}

	}

	/** Visualize Multiplication */
	public static void printMaticesOperation(double[][] firstOperand,
			double[][] secondOperand, double[][] resultMatrix, char operator) {

		System.out.print("\n");
		for (int rowIndex = 0; rowIndex < firstOperand.length; rowIndex++) {

			// print rows of the first matrix
			for (int j = 0; j < firstOperand[0].length; j++) {
				System.out.printf("%4.1f  ", firstOperand[rowIndex][j]);

			}

			// print operator in the middle row
			if (rowIndex == firstOperand.length / 2)
				System.out.print("   " + operator + "   ");
			else
				System.out.print("       ");

			// print rows of the second matrix
			for (int j = 0; j < secondOperand[0].length; j++) {
				System.out.printf("%4.1f  ", secondOperand[rowIndex][j]);
			}

			// print the equals sign
			if (rowIndex == firstOperand.length / 2)
				System.out.print("   =   ");
			else
				System.out.print("       ");

			// print the rows of the result matrix
			for (int j = 0; j < resultMatrix[0].length; j++) {
				System.out.printf("%4.1f  ", resultMatrix[rowIndex][j]);
			}

			System.out.println();
		}
	}

}
