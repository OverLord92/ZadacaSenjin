package zadaci_08_08_2015;

/**
 * (Sort two-dimensional array) Write a method to sort a two-dimensional array
 * using the following header: public static void sort(int m[][])
 */

public class Zadatak4 {

	public static void main(String[] args) {

		// sample matrix for demonstration
		int[][] matrix = { { 4, 2, 1 }, { 1, 7, 3 }, { 4, 5, 4 }, { 1, 2, 5 },
				{ 1, 1, 3 }, { 4, 1, 4 } };

		// sort matrix
		sort(matrix);

		printMatrix(matrix);

	}

	/** Sort matrix first by row and than by column */
	public static void sort(int matrix[][]) {

		sortByRow(matrix);

		sortByColumn(matrix);
	}

	/** Sort matrix by row */
	public static void sortByRow(int[][] matrix) {
		int[] temp;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][0] < matrix[j][0]) {
					temp = matrix[i];
					matrix[i] = matrix[j];
					matrix[j] = temp;
				}
			}
		}
	}
	
	/** Sort matrix by column */
	public static void sortByColumn(int[][] matrix){
		
		int[] temp;
		
		// sort matrix, which was previously sorted by row, by column  
		for (int i = matrix[0].length - 1; i > 0; i--) {
			for (int j = 0; j < matrix.length; j++) {
				for (int k = 0; k < matrix.length; k++) {
					if (matrix[j][0] == matrix[k][0]
							&& matrix[j][i] < matrix[k][i]) {
						temp = matrix[j];
						matrix[j] = matrix[k];
						matrix[k] = temp;
					}
				}
			}
		}
		
	}

	/** Print matrix */
	public static void printMatrix(int[][] matrix) {

		for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < matrix[0].length; columnIndex++) {
				System.out.print(matrix[rowIndex][columnIndex] + " ");
			}

			System.out.println();
		}
	}
}
