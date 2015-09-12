package zadaci_08_08_2015;

/**
 * Write a program that generates a 6-by-6 two-dimensional matrix filled with 0s
 * and 1s, displays the matrix, and checks if every row and every column have an
 * even number of 1s.
 * 
 * 
 * Da bi uslov bio ispunjen broj jedinica u svim redovima i svim kolonama mora
 * biti paran, sto je gotovo nemoguce koristeci nasumicne brojeve. Uglavnom, ako
 * manuelno unesemo matricu sa parnim brojem jedinica u redovima i kolonama
 * program pokazuje tacan rezultat.
 */

public class Zadatak5 {

	public static void main(String[] args) {

		int[][] matrix = Zadatak3.generateRandomMatrix(6, 6);

		boolean matrixIsEven = true;

		int counter;

		// check if all rows have even numbers of 1s
		for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
			
			counter = 0;
			for (int columnIndex = 0; columnIndex < matrix[0].length; columnIndex++) {
				if (matrix[rowIndex][columnIndex] == 1)
					counter++;
			}

			if (counter % 2 != 0) {
				matrixIsEven = false;
				break;
			}
		}

		// check if all columns have even numbers of 1s
		for (int j = 0; j < matrix[0].length; j++) {
			
			counter = 0;
			for (int i = 0; i < matrix.length; i++) {
				if (matrix[i][j] == 1)
					counter++;
			}

			if (counter % 2 != 0) {
				matrixIsEven = false;
				break;
			}
		}

		// print result
		System.out
				.print(matrixIsEven ? "\nThe matrice has" : "\nThe matrice has NOT");
		System.out.println(" even numbers in rows in columns.");

	}

}
