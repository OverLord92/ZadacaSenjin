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

		int[][] matrix = new int[6][6];

		// generisanje i printanje 6 x 6 matrice
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		boolean isEven = true;

		// brojac za jedinice
		int count;

		// provjeravamo da li svi redovi imaju paran broj jedinica
		for (int i = 0; i < matrix.length; i++) {
			count = 0;
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 1)
					count++;
			}

			if (count % 2 != 0) {
				isEven = false;
				break;
			}
		}

		// provjeravamo da li sve kolone imaju paran broj jedinica
		for (int j = 0; j < matrix[0].length; j++) {
			count = 0;
			for (int i = 0; i < matrix.length; i++) {
				if (matrix[i][j] == 1)
					count++;
			}

			if (count % 2 != 0) {
				isEven = false;
				break;
			}
		}

		// printanje rezultata
		System.out
				.print(isEven ? "\nThe matrice has" : "\nThe matrice has NOT");
		System.out.println(" even numbers in rows in columns.");

	}

}
