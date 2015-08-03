package zadaci_03_08_2015;

import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese neki string te mu vraća broj
 * uppercase karaktera u unijetom stringu. Na primjer, ukoliko korisnik unese
 * string "Dobrodošli u Dubai" program mu vraća da je broj uppercase karaktera
 * 2.
 */

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// korisnik unosi string
		System.out.print("Unsite string: ");
		String str = input.nextLine();

		int countUpperCase = 0;

		// petlja za brojanje velikih slova
		for (int i = 0; i < str.length(); i++) {
			if ((int) (str.charAt(i)) >= 65 && (int) (str.charAt(i)) <= 90) {
				countUpperCase++;
			}
		}

		// printanje retultata
		System.out.println("The string has " + countUpperCase
				+ " upper case characters.");
		
		input.close();
	}

}
