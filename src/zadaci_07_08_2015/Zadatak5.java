package zadaci_07_08_2015;

/**
 * Write a method to add two matrices. The header of the method is as follows:
 * public static double[][] addMatrix(double[][] a, double[][] b)
 */

public class Zadatak5 {

	/** Test program */
	public static void main(String[] args) {

		// first matrix operand
		double[][] a = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };

		// second matrix operand
		double[][] b = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };

		// a matrix for the result
		double[][] c = addMatrices(a, b);

		// print result
		printMaticesOperation(a, b, c, '+');

	}

	/** Sums two matrices and returns result */
	public static double[][] addMatrices(double[][] a, double[][] b) {

		// matrix in which place the result
		double[][] resultMatrix = new double[a.length][a[0].length];

		// check if the matrices are the same size
		if (a.length != b.length || a[0].length != b[0].length) {

			// if the sizes are not the same return null
			System.out.println("The matrices must have the same size.");
			return null;
		}

		// sum matrices
		for (int rowIndex = 0; rowIndex < a.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < a[0].length; columnIndex++) {
				resultMatrix[rowIndex][columnIndex] = a[rowIndex][columnIndex]
						+ b[rowIndex][columnIndex];
			}
		}

		return resultMatrix;
	}

	/** Visualize the process of the addition  */
	public static void printMaticesOperation(double[][] firstOperand, double[][] secondOperand,
			double[][] resultMatrix, char operator) {
		
		for (int rowIndex = 0; rowIndex < firstOperand.length; rowIndex++) {
			
			// print rows of the first matrix
			for (int columnIndex = 0; columnIndex < firstOperand[0].length; columnIndex++) {
				System.out.printf("%4.2f  ", firstOperand[rowIndex][columnIndex]);

			}

			// print the operator in the middle row
			if (rowIndex == firstOperand.length / 2)
				System.out.print("   " + operator + "   ");
			else
				System.out.print("       ");

			// print rows of the second matrix
			for (int j = 0; j < secondOperand[0].length; j++) {
				System.out.printf("%4.2f  ", secondOperand[rowIndex][j]);
			}

			
			// print equal sign in the middle row
			if (rowIndex == firstOperand.length / 2)
				System.out.print("   =   ");
			else
				System.out.print("       ");

			// print result matrix
			for (int j = 0; j < resultMatrix[0].length; j++) {
				System.out.printf("%4.2f  ", resultMatrix[rowIndex][j]);
			}

			System.out.println();
		}
	}
}
