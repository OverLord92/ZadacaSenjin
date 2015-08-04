package zadaci_04_08_2015;

import java.util.Scanner;

/**
 * Napisati program koji prima ASCII kod (cijeli broj između 0 i 127) te
 * ispisuje koji je to karakter. Na primjer, ukoliko korisnik unese 69 kao ASCII
 * kod, program mu ispisuje da je karakter sa tim brojem karakter E.
 */

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// korisnik unosi broj
		System.out.print("\n  Unesite broj između 0 i 127: ");
		int numChar = input.nextInt();
		
		// printanje rezultata
		System.out.print("  Odgovarajuci ASCII karakter je: ");
		System.out.println((char)(numChar));
		
		input.close();
		
	}

}
