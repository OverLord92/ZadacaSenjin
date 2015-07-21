package zadaci_21_07_2015;

import java.io.File;
import java.util.Scanner;

/**
 * Napišite program koji će brojati broj karaktera, riječi i linija teksta u
 * nekom fileu. Riječi trebaju biti odvojene jednim spaceom. Ime file
 * proslijediti kao argument u vaš program.
 */

public class Zadatak3_File {
	public static void main(String[] args) {
		// Program cita text sa File-a
		File file = new File("text.txt");
		int characters = 0;
		int words = 0;
		int lines = 0;
		String[] strings;
		try {
			// kreiramo novi URL
			Scanner input = new Scanner(file);
			while (input.hasNextLine()) {

				String line = input.nextLine();
				strings = line.split(" ");

				for (int i = 0; i < strings.length; i++) {
					if (isWord(strings[i])) {
						// words povecavamo ako je trenutni string linije rijec
						words++;
					}
				}

				// characters povecavamo za duzinu linije
				characters += line.length();

				lines++;
			}

			System.out.println("The numbers of lines is " + lines + ".");
			System.out.println("The number of words is " + words + ".");
			System.out.println("The number of characters is " + characters
					+ ".");
			input.close();
		}  catch (java.io.IOException ex) {
			System.out.println("I/O Errors: no such file");
		}
	}

	/** Metoda koja provjerava da li je string rijec */
	public static boolean isWord(String s) {
		char c;
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (!Character.isLetter(c)) {
				return false;
			}
		}
		return true;
	}
}
