package zadaci_21_08_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * *12.14 (Process scores in a text file) Suppose that a text file contains an
 * unspecified number of scores separated by blanks. Write a program that
 * prompts the user to enter the file, reads the scores from the file, and
 * displays their total and average.
 */

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// korisnik unosi naziv datoteke 
		// text file se zove "scores.txt" koji se nalazi u projekt folderu
		System.out.print("Unesite ime datoteke: ");
		String fileName = input.next();
		try {
			File file = new File(fileName);

			Scanner inputFile = new Scanner(file);
			double sum = 0;
			int counter = 0;
			
			// sabiranje bodova
			while (inputFile.hasNext()) {
				sum += inputFile.nextDouble();
				counter++;
			}
			
			// racunanje prosjeka
			double averrage = sum / counter;
			// printanje rezultata
			System.out.println("Zbir bodova je " + sum);
			System.out.println("Prosjek bodova je " + averrage);
			
			input.close();
			inputFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("Datoteka pod tim imenom ne postoji.");
		}
	}

}
