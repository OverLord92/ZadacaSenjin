package zadaci_22_07_2015;

import java.util.Scanner;

/**
 * Napisati metodu koja vraća lokaciju najvećeg elementa u 2D nizu. Metoda treba
 * da koristi sljedeći header:
 * 
 * public static int[ ] locateLargest(double[ ][ ] a)
 * 
 * Napisati test program koji pita korisnika da unese 2D niz te mu ispisuje
 * lokaciju najvećeg elementa u nizu.
 */

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//korisnik unosi elemente matrice
		System.out.println("Enter a 3 x 3 matrix: ");
		double[][] array = new double[3][3];
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				array[i][j] = input.nextDouble();
			}
		}
		
		int[] location = locateLargest(array);
		// printanje rezultata
		System.out.print("The location of the largest element is: ");
		System.out.println("[" + location[0] + ", " + location[1] + "]");

		
		input.close();
	}

	/** Metoda koja vraca niz sa koordinatama najveceg elementa u nizu */
	public static int[] locateLargest(double[ ][ ] a){
		int[] result = {0,0};
		double minValue = a[0][0];
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				if(a[i][j] > minValue){
					minValue = a[i][j];
					result[0] = i;
					result[1] = j;
				}
			}
		}
		return result;
	}
}