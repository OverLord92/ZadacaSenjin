package zadaci_21_08_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * *12.13 (Count characters, words, and lines in a file) Write a program that
 * will count the number of characters, words, and lines in a file. Words are
 * separated by whitespace characters. The file name should be passed as a
 * command-line argument.
 */

public class Zadatak4 {

	public static void main(String[] args) {

		// program prima argument iz komandne linije
		String fileName = args[0].trim();
		
		try {
			File file = new File(fileName);
			Scanner inputFile = new Scanner(file);
			int lineCount = 0;
			int wordCount = 0;
			int charCount = 0;

			// string  koji smjestamo trenutni red
			String line;
			// niz u koji splitamo red
			String[] words;
			
			// petlja koja broji redove, rijeci i karaktere
			while (inputFile.hasNextLine()) {
			line = inputFile.nextLine();
			lineCount++;
			words = line.split(" ");
			wordCount += words.length;
			charCount += line.length();
			}
			
			// printanje rezultata
			System.out.println("Broj redova: " + lineCount);
			System.out.println("Broj rijeci: " + wordCount);
			System.out.println("Broj karaktera: " + charCount);
			
			inputFile.close();
			
			// hvatamo FileNotFoundException ukoliko korisnik unese naziv
			// datoteke koja ne postoji
		} catch (FileNotFoundException e) {
			System.out.println("Ne postoji datoteka pod tim imenom.");
		}

	}

}
