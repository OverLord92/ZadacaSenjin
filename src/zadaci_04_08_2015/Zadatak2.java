package zadaci_04_08_2015;

import java.util.Scanner;

/**
 * Napisati program koji prima karakter te vraća njegov Unicode. Primjer:
 * ukoliko korisnik unese karakter E program mu vraća 69 kao unicode za taj
 * karakter.
 */

public class Zadatak2 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	// korisnik unosi karakter
	System.out.print("\n  Unesite karakter: ");
	char c = input.next().charAt(0);
	
	// printanje rezultata
	System.out.print("  Unicode za taj karakter je: ");
	System.out.println((int)(c));
	
	input.close();
	
	}

}
