package zadaci_20_07_2015;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak2 {

	/**
	 * Napisati program koji pita korisnika da unese string te mu ispište broj
	 * samoglasnika i suglasnika u datom stringu.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string to count the vowels: ");
		String korisnik = input.nextLine();

		System.out.println("The number Of Vowels in the string is "
				+ numberOfVowels(korisnik + "\n"));
		input.close();

	}

	/** Metoda koj vraca broj samoglasnika u stringu */
	public static int numberOfVowels(String string) {

		Character[] vowels = { 'A', 'E', 'I', 'O', 'U' };
		Character c;
		int numberOfVowels = 0;

		// za svaki karakter u stringu provjeravamo da li je samoglasnik
		// tj. da li se nalazi u nizu vowels
		for (int i = 0; i < string.length(); i++) {
			c = string.charAt(i);
			c = Character.toUpperCase(c);

			// ako jeste povecavamo brojac samoglasnika za jedan
			if (Arrays.asList(vowels).contains(c)) {
				numberOfVowels++;
			}
		}
		return numberOfVowels;

	}

}
