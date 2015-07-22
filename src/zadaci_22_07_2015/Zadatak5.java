package zadaci_22_07_2015;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Implementirati sljedeću metodu da sortira redove u 2D nizu.
 * 
 * public static double[ ][ ] sortRows(double[ ][ ] array)
 * 
 * Napisati testni program koji pita korisnika da unese 3x3 matricu (ili da pita
 * korisnika koliku matricu želi unijeti) te mu ispisuje na konzoli matricu sa
 * sortiranim redovima - od najmanjeg broja do najvećeg.
 */

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		// korisnik unosi matricu
		System.out.println("Enter a 3 x 3 matrix: ");
		
		double[][] array = new double[3][3];
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				array[i][j] = input.nextDouble();
			}
		}
		
		
		double[][] sortedArray = sortRows(array);
		
		printMatrix(sortedArray);
		input.close();
		
	}

	/** Metoda koja vraca sortiranu matricu */
	public static double[][] sortRows(double[][] array) {
		// matrica koju smo proslijedili metodi ostaje nepromjenjena
		double[][] sortedArray = array.clone();
		for (int i = 0; i < array[0].length; i++) {
			Arrays.sort(sortedArray[i]);
		}
		return sortedArray;
	}
	
	
	
	/** Metoda za printanje niza */
	public static void printArray(double[] array){
		for(double d: array)
			System.out.printf("%6.2f", d);
		System.out.println();
	}
	
	/** Metoda za printanje matrice */
	public static void printMatrix(double[][] matrix){
		for(double[] d: matrix)
			printArray(d);
		System.out.println();
	}
	

}
