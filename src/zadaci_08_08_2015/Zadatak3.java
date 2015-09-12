package zadaci_08_08_2015;

/**
 * (Largest row and column) Write a program that randomly fills in 0s and 1s
 * into a 4-by-4 matrix, prints the matrix, and finds the first row and column
 * with the most 1s. Here is a sample run of the program: 0011 0011 1101 1010
 * The largest row index: 2 The largest column index: 2
 */

public class Zadatak3 {

	public static void main(String[] args) {
		
		// generate a random matrix
		int[][] matrix = generateRandomMatrix(4, 4);

		// calculate row with most 1s
		int rowMax = biggestRow(matrix);
		
		// calculate column with most 1s
		int columnMax = biggestColumn(matrix);
		
		// print result
		System.out.println("The largest row index: " + rowMax);
		System.out.println("The largest column index: "  + columnMax);

		
	}
	
	/** Generates a matrix randomly populated with 0s and 1s */
	public static int[][] generateRandomMatrix(int rowNumber, int columnNumber){
		
		int[][] randomMatrix = new int[rowNumber][columnNumber];
		for (int rowIndex = 0; rowIndex < rowNumber; rowIndex++) {
			for (int columnIndex = 0; columnIndex < columnNumber; columnIndex++) {
				randomMatrix[rowIndex][columnIndex] = (int) (Math.random() * 2);
				System.out.print(randomMatrix[rowIndex][columnIndex]);
			}
			System.out.println();
		}
		
		return randomMatrix;

	}
	
	/** Calculate biggest row */
	public static int biggestRow(int[][] matrix){
		
		int rowSum;
		int maxRowSum = 0;
		
		int maxRowIndex= 0;
		
		// calculate biggest row based on the sum of elements in every row
		for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
			
			rowSum = 0;
			for (int columnIndex = 0; columnIndex < matrix[0].length; columnIndex++) {
				rowSum += matrix[rowIndex][columnIndex];
			}

			if (rowSum > maxRowSum){
				maxRowSum = rowSum;
				maxRowIndex = rowIndex;
			}
		}
		
		return maxRowIndex;
	}
	
	/** Calculate biggest column */
	public static int biggestColumn(int[][] matrix){
		
		int columnSum;
		int maxSum = 0;
		int maxColumnIndex= 0;
		
		// calculate column with most 1s based on the sum of the column
		for (int columnIndex = 0; columnIndex < matrix[0].length; columnIndex++) {
			
			columnSum = 0;
			for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
				columnSum += matrix[rowIndex][columnIndex];
			}

			if (columnSum > maxSum){
				maxSum = columnSum;
				maxColumnIndex = columnIndex;
			}
		}
		
		return maxColumnIndex;
	}

}
