package zadaci_24_07_2015;

/** Napisati metodu koja broji slova u stringu. Metoda treba koristiti 
 * sljedeći header: public static int countLetters(String s). 
 * Napisati program koji pita korisnika da unese neki string te mu vrati 
 * koliko taj string ima slova. */

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string to count letters: ");
		String line = input.nextLine();
		System.out.print("The number of letters in the entered string is: ");

		System.out.println(countLetters(line));
		input.close();
	}

	// metoda koja broji slova u stirngu
	public static int countLetters(String s) {
		int count = 0;
		char currentChar;
		for (int i = 0; i < s.length(); i++) {
			currentChar = s.charAt(i);
			// ako je trenutni karakter slovo brojac se povecava za 1
			if (Character.isLetter(currentChar)) {
				count++;
			}
		}
		return count;
	}

}
