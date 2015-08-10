package zadaci_10_08_2015;

import java.util.Scanner;

/**
 * Write a method that solves a 2 * 2 system of linear equations: The method
 * header is public static double[] linearEquation(double[][] a, double[] b)
 * 
 * Za sistem jednacina
 * 
 * 		ax + by = e
 * 		cx + dy = f
 * 
 * 		a = {{a,b}{c,d}};
 * 		b = {e, f};
 */

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// test program

		// korisnik unosi jednacine u obliku matrica
		System.out
				.println("Unesite a[0][0], a[0][1], a[1][0], a[1][1], b[0], b[1]:");
		double[][] a = enterMatrix(2, 2, input);
		double[] b = { input.nextDouble(), input.nextDouble() };

		// racunanje rjesenja
		double[] result = (linearEquation(a, b));

		// printanje rjesenje
		if (result == null) {
			System.out.println("Jednacina nema rjesenje.");
		} else {
			System.out.println("Rezultat jednacine je (" + result[0] + ", "
					+ result[1] + ").");
		}
	}

	/** Metoda koja racuna rjesenje sistema jednacina */
	public static double[] linearEquation(double[][] a, double[] b) {

		// ukoliko jednacina nije rjesiva metoda vraca null
		if (a[0][0] * a[1][1] - a[0][1] * a[1][0] == 0)
			return null;

		// a * d - b * c se korsiti visestruko pa je ta vrijednost dodijeljena
		// varijabli dividor
		double dividor = (a[0][0] * a[1][1] - a[0][1] * a[1][0]);

		// racunanje x-a         e * d - b * f / a * d - b * c
		double x = (b[0] * a[1][1] - a[0][1] * b[1]) / dividor;

		// racunanje y-a         a * f - e * c / a * d - b * c
		double y = (a[0][0] * b[1] - b[0] * a[1][0]) / dividor;
	
		double[] result = { x, y };
		return result;
	}

	/** Metoda za unos matrice od strane korisnika */
	public static double[][] enterMatrix(int rows, int columns, Scanner input) {
		double[][] matrix = new double[rows][columns];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		return matrix;
	}

}
