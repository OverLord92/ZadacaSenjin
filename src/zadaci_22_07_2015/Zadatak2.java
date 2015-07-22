package zadaci_22_07_2015;

import java.util.Scanner;

/**
 * Napisati metodu koja nalazi najmanji element u nizu decimalnih vrijednosti
 * koristeći se sljedećim headerom: public static double min(double[ ] array)
 * 
 * Napišite potom test program koji pita korisnika da unese deset brojeva te
 * poziva ovu metodu da vrati najmanji element u nizu.
 */

public class Zadatak2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		double[] array = new double[10];
		// korisnik unosi vrijednosti u niz
		System.out.println("Enter ten numbers: ");
		for(int i = 0; i < array.length; i++){
			array[i] = input.nextDouble();
		}
		
		//printanje rezultat
		System.out.println("The smallest value in the array is " + min(array) + ".");

		input.close(); //obavezno zatvoriti scanner
	}

	/** Metoda koja vraca najmanju vrijednost u nizu */
	public static double min(double[] array) {
		double minValue = array[0];
		for (double d : array) {
			if (d < minValue) {
				minValue = d;
			}
		}
		return minValue;
	}

}
