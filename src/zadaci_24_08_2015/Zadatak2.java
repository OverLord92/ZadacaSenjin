package zadaci_24_08_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * **12.30 (Occurrences of each letter) Write a program that prompts the user to
 * enter a file name and displays the occurrences of each letter in the file.
 * Letters are case-insensitive. Here is a sample run:
 */

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			// promptamo korisnika da unene naziv fajla
			System.out.print("Unesite naziv fajla: ");
			String fileName = input.next();
			File file = new File(fileName);

			// skener prebacujemo sa System.in na falj
			input = new Scanner(file);

			// niz u kojem smjestamo broj ponavljanja slova
			int[] letterCount = new int[26];

			while (input.hasNextLine()) {
				
				// string sa trenutnom linijom
				String line = input.nextLine();

				// prolazimo kroz sve karaktere u liniji
				for (int i = 0; i < line.length(); i++) {
					
					// program je case insensitive
					char currentChar = Character.toUpperCase(line.charAt(i));

					// program ignorise karaktere koji nisu uppercase slova
					// i na taj nacin sprecaba IndexOutOfBounds Exception
					if (currentChar >= 65 && currentChar <= 90) {
						letterCount[currentChar - 65]++;
					}
				}
			}
	
			// printanje rezultata
			for (int i = 0; i < letterCount.length; i++) {
				System.out.println((char) (65 + i) + " se pojavljuje : "
						+ letterCount[i] + " puta.");
			}
			// printanje poruke korisniku ukoliko unese nepostojeci fajl
		} catch (FileNotFoundException e) {
			System.out.println("Ne postoji datoteka pod tim nazivom.");
		}

	}

}
