package zadaci_22_08_2015;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 ** 12.23 (Process scores in a text file on the Web) Suppose that the text file
 * on the Web http://cs.armstrong.edu/liang/data/Scores.txt contains an
 * unspecified number of scores. Write a program that reads the scores from the
 * file and displays their total and average. Scores are separated by blanks.
 */

public class Zadatak4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		// korisnik unosi url s kojeg zeli citati bodove
		System.out.print("Unesite url s kojeg zelite citati bodove: ");
		String urlName = input.next();

		URL url;
		try {
			url = new URL(urlName);
			input = new Scanner(url.openStream());
			double sum = 0;
			int count = 0;
			
			// racunamo sumu i prosjek
			while (input.hasNext()) {
				input.next();
				count++;
			}
			input.close();
			double averrage = sum / count;
			// printanje rezultata
			System.out.println("Ukupan broj bodova je: " + sum
					+ "\nProsjek bodova je: " + averrage);
			
	
			// hvatanje exceptionsa u slucaju pojave greske
		} catch (MalformedURLException e) {
			System.out.println("Problem sa URL-om.");
		} catch (IOException e) {
			System.out.println("Problem sa URL-om.");
		}
	}

}
