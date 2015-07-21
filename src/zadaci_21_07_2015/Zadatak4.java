package zadaci_21_07_2015;

import java.util.Scanner;

/**
 * Napisati metodu koja ispisuje n x n matricu korsiteći sljedeći header: public
 * static void printMatrix(int n)
 * 
 * Svaki element u matrici je ili 0 ili 1, generisan nasumično. Napisati test
 * program koji pita korisnika da unese n te ispisuje n x n matricu.
 */

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the matrix: ");
		printMatrix(input.nextInt());
		input.close();
	}
	
    /** Metoda koja stampa matricu velicine n x n */
	public static void printMatrix(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print((int) (Math.random() * 2) + " ");
			}
			System.out.println();
		}

	}

}
