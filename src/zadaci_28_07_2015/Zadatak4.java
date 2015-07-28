package zadaci_28_07_2015;

import java.util.Scanner;

/**
 * Napisati metodu koja pronalazi broj ponavljanja određenog karaktera u
 * stringu. Metoda treba da koristi sljedeći header: public static int
 * count(String str, char a). Na primjer, ukoliko pozovemo metodu na sljedeći
 * način: count("Welcome", e) metoda treba da vrati 2. Napisati program koji
 * pita korisnika da unese string i koji karakter želi da prebroji u datom
 * stringu te mu ispiše koliko se puta određeni karakter ponovio u zadatom
 * stringu.
 */

public class Zadatak4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean validInput = false;
		String str, userInput;
		char a = ' ';

		
		// korisnik unosi stirng u kojem zeli brojati karakter
		System.out.println("The program is case insensitive.");
		System.out
				.println("Enter the string in wich you want to count a character: ");
		str = input.nextLine();
		str = str.toLowerCase();

		// petlja radi sve dok korisnik ne unose string duzine 1
		do {
			System.out.print("Enter the character you wanto to count: ");
			
			userInput = input.next();
			userInput = userInput.toLowerCase();

			if (userInput.length() == 1) {
				
				// uzimamo charAt(0) kao char a
				a = userInput.charAt(0);
				validInput = true;
			} else {
				System.out
						.println("\nYou must enter a single character. Try again. ");
			}
		} while (!validInput);
		
		// printanje rezultata
		System.out.println("The character " + a + " ocurs " + count(str, a) + " times.");
		
		input.close();

	}

	/** Metoda koja vraca broj karaktera a u stringu str */
	public static int count(String str, char a) {

		int counter = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == a) {
				counter++;
			}

		}

		return counter;
	}

}
