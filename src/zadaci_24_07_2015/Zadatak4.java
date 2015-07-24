package zadaci_24_07_2015;

/** 
 * Napisati program koji prima 10 cijelih brojeva
 * te ih ispisuje u obrnutom redosljedu. 
 */

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int[] numbers = new int[10];
		System.out.print("Enter ten numbers: ");

		// unos brojeva u niz
		for (int i = 0; i < 10; i++) {
			numbers[i] = input.nextInt();
		}
		
		System.out.println();

		// printanje rezultata
		System.out.println("The numbers printed in opposite order: \n");
		System.out.print(" ");
		for (int i = 9; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
		input.close();
	}

}
