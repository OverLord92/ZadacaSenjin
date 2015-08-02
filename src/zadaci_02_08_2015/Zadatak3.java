package zadaci_02_08_2015;

import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese Social Security Number (SSN) u
 * formatu DDD-DD-DDDD gdje D predstavlja broj. Program treba da provjerava da
 * li je broj unesešen u ispravnom formatu. Ukoliko nije, program pita korisnika
 * da pokuša ponovo. Ukoliko jeste unešen u pravom formatu, program završava sa
 * radom.
 */

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// korisnik unosi SSN
		System.out.print("  Unesite Social Security Number: ");
		String ssn = input.next();

		// postavljamo validnost unosa na true
		boolean validSnn = true;

		// provjeravamo da li je ssn odgovarajuce duzine
		if (ssn.length() != 11) {
			System.out.println("   The length of the input is wrong.");
		} else {

			// prolazimo kroz svaki karakter broja
			for (int i = 0; i < ssn.length(); i++) {
				// provjerava da li je na 3 i 6 poziciji '-'
				if (i == 3 || i == 6) {
					if (ssn.charAt(i) != '-') {
						validSnn = false;
						break;
					}
				} else {
					// provjerava da li je na ostalim pozicijama digit
					if (!Character.isDigit(ssn.charAt(i))) {
						validSnn = false;
						break;
					}
				}
			}
		}

		// printanje rezultata
		System.out.println(validSnn ? "\n    Valid input." : "\n    Invalid input.");

		input.close();
	}

}
