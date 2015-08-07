package zadaci_07_08_2015;

/**
 * (Sum elements column by column) Write a method that returns the sum of all
 * the elements in a specified column in a matrix using the following header:
 * public static double sumColumn(double[][] m, int columnIndex)
 */

public class Zadatak4 {

	public static void main(String[] args) {
		
		// kratki test pogram
		double[][] m = {{99, 13}, {34, 54}};
		
		System.out.println(sumColumn(m,0));

	}

	/** Metoda koja vraca zbir brojeva odredjene kolone matrice */
	public static double sumColumn(double[][] m, int columnIndex) {

		double sum = 0;
		
		for(int i = 0; i < m.length; i++){
			sum += m[i][columnIndex];
		}
		
		return sum;
	}

}
