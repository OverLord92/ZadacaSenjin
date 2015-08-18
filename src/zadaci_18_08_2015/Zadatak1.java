package zadaci_18_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * *11.9 (Largest rows and columns) Write a program that randomly fills in 0s
 * and 1s into an n-by-n matrix, prints the matrix, and finds the rows and
 * columns with the most 1s. (Hint: Use two ArrayLists to store the row and
 * column indices with the most 1s.)
 */

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite dimenziju matrice: ");
		int n = input.nextInt();

		int[][] matrix = new int[n][n];
		ArrayList<Integer> maxRow = new ArrayList<>();
		ArrayList<Integer> maxColumn = new ArrayList<>();

		System.out.println("Proizvoljna matrica je: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		int numberOfOnes;
		int maxNumberOfOnes = 0;

		for (int i = 0; i < matrix.length; i++) {
			numberOfOnes = 0;
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 1) {
					numberOfOnes++;
				}
			}
			if (numberOfOnes > maxNumberOfOnes) {
				maxNumberOfOnes = numberOfOnes;
				maxRow.clear();
				maxRow.add(i);
			} else if (numberOfOnes == maxNumberOfOnes) {
				maxRow.add(i);
			}

		}

		System.out.print(maxRow.size() == 1 ? "Red sa najvise jedinica je: "
				: "Redovi sa najvise jedinica su: ");
		for (Integer i : maxRow)
			System.out.print(i + " ");
		System.out.println();
		
		maxNumberOfOnes = 0;
		for (int i = 0; i < matrix[0].length; i++) {
			numberOfOnes = 0;
			for (int j = 0; j < matrix.length; j++) {
				
				if (matrix[j][i] == 1) {
					numberOfOnes++;
				}
			}
			if (numberOfOnes > maxNumberOfOnes) {
				maxNumberOfOnes = numberOfOnes;
				maxColumn.clear();
				maxColumn.add(i);
			} else if (numberOfOnes == maxNumberOfOnes) {
				maxColumn.add(i);

			}
		}
		
		System.out.print(maxRow.size() == 1 ? "Kolona sa najvise jedinica je: "
				: "Kolone sa najvise jedinica su: ");
		for (Integer i : maxColumn)
			System.out.print(i + " ");
		System.out.println();
		
		input.close();
	}
}
