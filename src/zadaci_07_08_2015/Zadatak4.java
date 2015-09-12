package zadaci_07_08_2015;

/**
 * (Sum elements column by column) Write a method that returns the sum of all
 * the elements in a specified column in a matrix using the following header:
 * public static double sumColumn(double[][] m, int columnIndex)
 */

public class Zadatak4 {

	/** Test program */
	public static void main(String[] args) {
		
		double[][] m = {{99, 13}, {34, 54}};
		
		// print result
		System.out.println(sumColumn(m,0));

	}

	/** Sums elements of forwarded column */
	public static double sumColumn(double[][] m, int columnIndex) {

		double columnSum = 0;
		
		// sum elements of the column
		for(int rowIndex = 0; rowIndex < m.length; rowIndex++){
			columnSum += m[rowIndex][columnIndex];
		}
		
		return columnSum;
	}

}
