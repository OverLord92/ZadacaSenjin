package zadaci_08_08_2015;

/**
 * (Largest row and column) Write a program that randomly fills in 0s and 1s
 * into a 4-by-4 matrix, prints the matrix, and finds the first row and column
 * with the most 1s. Here is a sample run of the program: 0011 0011 1101 1010
 * The largest row index: 2 The largest column index: 2
 */

public class Zadatak3 {

	public static void main(String[] args) {
		int[][] matrix = new int[4][4];

		// generisanje i printanje matrice 4 x 4 sa vrijednostima 0 i 1
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}

		// racunanje reda sa najvise jedinica
		int count;
		int countMax = 0;
		int rowMax = 0;
		for (int i = 0; i < matrix.length; i++) {
			count = 0;
			for (int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j] == 1)
					count++;
			}

			if (count > countMax){
				countMax = count;
				rowMax = i;
			}
		}
		// printanje rezultata
		System.out.println("The largest row index: " + rowMax);
		
		
		// racunanje colone sa najvise jedinica
		countMax = 0;
		int columnMax = 0;
		for (int j = 0; j < matrix[0].length; j++) {
			count = 0;
			for (int i = 0; i < matrix.length; i++) {
				if(matrix[i][j] == 1)
					count++;
			}
			

			if (count > countMax){
				countMax = count;
				columnMax = j;
			}
		}
		// printanje rezultata
		System.out.println("The largest column index: "  + columnMax);

		
	}

}
