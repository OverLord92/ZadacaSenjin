package zadaci_21_08_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * **12.11 (Remove text) Write a program that removes all the occurrences of a
 * specified string from a text file. For example, invoking java Exercise12_11
 * John filename removes the string John from the specified file. Your program
 * should get the arguments from the command line.
 * 
 * Program koristi fajl textZadatak3.txt koji se nalazi u paketu zadaci_21_08_2015
 * ali se moze modifikovati tako da korisnik unosi naziv datoke
 */

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// fajl s kojim manipulisemo 
		File file = new File("src/zadaci_21_08_2015/textZadatak3.txt");
		
		// promptamo korisnika da unese rijec kojiu teli izbrisati iz fajla
		System.out.print("Unesite string koji zelite izbrisati iz datoteke textZadatak3.txt: ");
		String toBeRemoved = input.next();

		// StringBuilder u koji smjestamo sadrzaj fajla bez izbacenih rijeci
		StringBuilder sb = new StringBuilder();
		scanFile(file, sb, toBeRemoved);

		// printanje StringBuildera u file
		PrintWriter pw;
		try {
			pw = new PrintWriter(file);
			pw.print(sb.toString());
			pw.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ne postoji datoteka pod nazivom " + file.getName());
		}
		
		System.out.println("Izbrisali ste sve rijeci " + toBeRemoved + " iz datoteke " + file.getName());
		input.close();
	}

	/**
	 * Metoda koja skenira fajl i smjesta ga u proslijedjeni StringBuilder,
	 * metoda pri sjeniranju zanemaruje proslijedjeni string toBeRemoved
	 */
	public static void scanFile(File file, StringBuilder sb, String toBeRemoved) {
		
		try {
			// skener pomocu kojeg citamo s fajla
			Scanner input = new Scanner(file);
	
			// niz u koji splitamo liniju
			String[] wordsInCurrentLine;
			
			while (input.hasNextLine()) {
				wordsInCurrentLine = input.nextLine().split(" ");
				for(int i = 0; i < wordsInCurrentLine.length; i++){
					if(!wordsInCurrentLine[i].equals(toBeRemoved))
						sb.append(wordsInCurrentLine[i] + " ");
				}
				sb.append("\n");
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ne postoji datoteka pod nazivom " + file.getName() + ".");
		}
		
	}

}
