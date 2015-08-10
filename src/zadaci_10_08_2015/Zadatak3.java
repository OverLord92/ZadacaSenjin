package zadaci_10_08_2015;

import java.util.Scanner;

/**
 * Write a method that returns the intersecting point of two lines. The
 * intersecting point of the two lines can be found by using the formula shown
 * in Programming Exercise 3.25. Assume that (x1, y1) and (x2, y2) are the two
 * points on line 1 and (x3, y3) and (x4, y4) are on line 2. The method header
 * is public static double[] getIntersectingPoint(double[][] points)
 */

/**
 * (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1 (y3 - y4)x - (x3 - x4)y =
 * (y3 - y4)x3 - (x3 - x4)y3
 */

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// korisnik unosi koordinate tacaka
		System.out.println("Unesite x1, y1, x2, y2, x3, y3, x4, y4:");
		// generisanje matrice sa koordinatama
		double[][] points = enterMatrix(4, 2, input);

		// matrica u koju smjestamo koordinate tacke presjeka
		double[] result = getIntersectingPoint(points);

		// ako su prave paralelne izbacuje poruku korisniki
		if (result == null) {
			System.out.println("Linije su paralelne.");
		} else {
			// ako prave nisu paralelne printa koordinate tacke presjeka
			System.out.printf("Koordinate tacke presjeka su: (%4.2f, %4.2f).", result[0], result[1]);
		}
	}

	/**
	 * Metoda koja prima matricu sa koordinatama tacaka pravih a vraca kordinate
	 * tacke u kojoj se prave sijeku ili vraca null ukoliko su prave paralelne
	 */
	public static double[] getIntersectingPoint(double[][] point) {

		// definisanje matrica koristeci se formulom iz opisa zadatka
		double[][] a = new double[2][2];
		a[0][0] = point[0][1] - point[1][1];          

		a[0][1] = (point[0][0] - point[1][0]);
		if(a[0][1] != 0) a[0][1] *= -1;
		
		a[1][0] = point[2][1] - point[3][1];

		
		a[1][1] = (point[2][0] - point[3][0]);
		if(a[1][1] != 0) a[1][1] *= -1;
		

		double[] b = new double[2];
		b[0] = (point[0][1] - point[1][1]) * point[0][0] - (point[0][0] - point[1][0]) * point[0][1];
		b[1] = (point[2][1] - point[3][1]) * point[2][0] - (point[2][0] - point[3][0]) * point[2][1];

		// pozivamo metodu za rjesavanj sistema jednacina iz proslog zadatka
		return Zadatak2.linearEquation(a, b);
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
