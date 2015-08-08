package zadaci_07_08_2015;

/**
 * Write a method to add two matrices. The header of the method is as follows:
 * public static double[][] addMatrix(double[][] a, double[][] b)
 */

public class Zadatak5 {

	public static void main(String[] args) {

		// kratki test program
		// prva matrica sabirak
		double[][] a = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		// druga matrica sabirak
		double[][] b = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		// matrica u koju smjestamo rezultat sabiranja
		double[][] c = addMatrix(a, b);

		// printanje sabiranja matrica
		printMaticesOperation(a, b, c, '+');

	}

	/** Metoda koja vraca zbir dvaju matrica */ 
	public static double[][] addMatrix(double[][] a, double[][] b) {

		double[][] c = new double[a.length][a[0].length];

		// provjeravamo da li su matrice istih dimenzija
		if (a.length != b.length || a[0].length != b[0].length) {
			System.out.println("The matrices must have the same size.");
			return null;
		}

		// proces sabiranja matrica
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}

		return c;
	}

	/** Metoda za vizualizaciju operacije dvaju matrica */
	public static void printMaticesOperation(double[][] a, double[][] b, double[][] c, char operation) {
		for (int i = 0; i < a.length; i++) {
			// printanje prve matrice
			for (int j = 0; j < a[0].length; j++) {
				System.out.printf("%4.2f  ", a[i][j]);

			}

			if (i == a.length / 2)
				System.out.print("   " + operation + "   ");
			else
				System.out.print("       ");

			// printanje druge matrice
			for (int j = 0; j < b[0].length; j++) {
				System.out.printf("%4.2f  ", b[i][j]);
			}
			
			if (i == a.length / 2)
				System.out.print("   =   ");
			else
				System.out.print("       ");
			
			// printanje zbira matrica
			for (int j = 0; j < c[0].length; j++) {
				System.out.printf("%4.2f  ", c[i][j]);
			}
			
			System.out.println();
		}
	}
}
