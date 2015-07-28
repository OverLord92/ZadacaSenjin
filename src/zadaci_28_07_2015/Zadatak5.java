package zadaci_28_07_2015;

import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese dva stringa te provjerava i
 * ispisuje da li je drugi string substring prvog stringa. Na primjer, ukoliko
 * korisnik unese ABCD kao prvi string a BC kao drugi string program mu ispisuje
 * da je BC substring ABCD stringa.
 */

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String str1 = "";
		String str2 = "";
		String substring;
		
		System.out.println("The program is case insensitive.");

		// korisnik unosi stringove
		do {

			System.out.println("Enter the first string: ");
			str1 = input.nextLine();
			str1 = str1.toLowerCase();

			System.out.println("Enter the second string: ");
			str2 = input.nextLine();
			str2 = str2.toLowerCase();

			// provjera da li je drugi string duzi od prvog
			if (str2.length() > str1.length()) {
				System.out
						.println("The first string must be longer than the first,"
								+ "\nin orfer for the program to work. Try again: ");
			}

			// proces unosa se ponavlja sve dok je prvi string kraci od drugog
		} while (str2.length() > str1.length());

		boolean isSubstring = false;

		// za svaki substring u prvom stringu duzine drugog stringa i provjeravamao
		for (int i = 0; i < str1.length() - str2.length() + 1; i++) {

			substring = str1.substring(i, i + str2.length());

			// da li je taj substring jednak drugom stringu
			if (substring.equals(str2))
				isSubstring = true;
		}

		// printanje rezultata
		System.out
				.println(isSubstring ? "The second string is a substring of the first string."
						: "The second string is not a substring of the first.");
		
		input.close();

	}

}
