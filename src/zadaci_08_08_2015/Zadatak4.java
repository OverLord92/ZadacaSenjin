package zadaci_08_08_2015;

/**
 * (Sort two-dimensional array) Write a method to sort a two-dimensional array
 * using the following header: public static void sort(int m[][])
 */

public class Zadatak4 {

	public static void main(String[] args) {
		
		// matrica 6 x 3 koju sortiramo
		int[][] m = { { 4, 2, 1 }, { 1, 7, 3 }, { 4, 5, 4 }, { 1, 2, 5 }, { 1, 1, 3 },
				{ 4, 1, 4 } };

		// sortiranje - metoda radi sa matricama svih dimenzija
		sort(m);

		// printanje rezultata
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}

			System.out.println();
		}

	}

	/** Metoda koja matricu sortira prvo po redovima a zatim po koloknama */
	public static void sort(int m[][]) {
		
		
		int[] temp;
		
		// sortiranje po redu
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if (m[i][0] < m[j][0]) {
					temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				}
			}
		}

		// sortiranje po kolonama
		for (int i = m[0].length - 1; i > 0 ; i--) {
			for (int j = 0; j < m.length; j++) {
				for (int k = 0; k < m.length; k++) {
					if (m[j][0] == m[k][0] && m[j][i] < m[k][i]) {
						temp = m[j];
						m[j] = m[k];
						m[k] = temp;
					}
				}
			}
		}
	}
}

