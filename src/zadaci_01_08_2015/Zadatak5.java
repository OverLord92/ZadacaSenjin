package zadaci_01_08_2015;

import java.util.Scanner;

/**
 * Napisati metodu koja ispisuje n x n matricu koristeći se sljedećim headerom:
 * public static void printMatrix(int n). Svaki element u matrici je ili 0 ili
 * 1, nasumično generisana. Napisati test program koji pita korisnika da unese
 * broj n te mu ispiše n x n matricu u konzoli.
 */

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// korisnik unosi velicinu matrice
		System.out.print("  Enter the dimension of the matrix: ");

		// printanje rzultata
		printMatrix(input.nextInt());

		input.close();

	}

	/** Metoda koja printa matricu dimenzije n */
	public static void printMatrix(int n) {

		System.out.println();
		for (int i = 0; i < n; i++) {

			System.out.print("    ");
			
			for (int j = 0; j < n; j++) {

				System.out.print((int) (Math.random() * 2) + " ");

			}

			System.out.println();
		}

	}

}
