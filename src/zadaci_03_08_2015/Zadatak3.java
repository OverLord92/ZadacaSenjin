package zadaci_03_08_2015;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese slovo te provjerava da li je
 * unijeti karakter samoglasnik ili suglasnik. Na primjer, ukoliko korisnik
 * unese B, program vraća da je dati karakter suglasnik. Ukoliko unese A,
 * program vraća da je dati karakter samoglasnik.
 */

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// korisnik unosi karakter
		System.out.print("Unesite karakter: ");

		// uzimamo prvo slovo unosa kao char
		char c = input.next().charAt(0);
		// toUpperCase
		c = Character.toUpperCase(c);

		// niz sa samoglasnicima
		char[] samoglasnici = { 'A', 'E', 'I', 'O', 'U' };

		// ako se char nalazi u nizu samoglasnici samoglasnik je
		if (Arrays.asList(samoglasnici).contains(c)) {
			System.out.println("Slovo koje ste unijeli je samoglasnik.");
			// ako nije samoglasnik, da li je uneseni char suglasnik
		} else if ((int) (c) >= 65 && (int) (c) <= 90) {
			System.out.println("Slovo koje ste unijeli je suglasnik.");
			//printanje poruke ako korisnik nije unjeo slovo
		} else {
			System.out.println("Niste unijeli slovo. Pokusajte ponovo.");
		}
		
		input.close();
	}

}
