package zadaci_29_07_2015;

import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese broj minuta (npr. 1 milijardu)
 * te ispiše korisniku koliko je to u godinama i danima. Zbog jednostavnosti,
 * pretpostavimo da godina ima 365 dana.
 */

public class Zadatak4 {
	
	// static varijalble
	static final int MINS_PER_DAY = 60 * 24;
	static final int MINS_PER_YEAR = MINS_PER_DAY * 365;

	/** Main metoda */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// korisnikov unos broja minuta
		System.out.print("Enter the number of minutes: ");
		long mins = input.nextInt();
		
		String minutes = mins + "";
		
		int years, days;
		
		// racunanje godina i dana
		years = (int)(mins / MINS_PER_YEAR);
		mins %= (int)(MINS_PER_YEAR);
		
		days = (int)(mins / MINS_PER_DAY);
		
		// printanje rezultata
		System.out.print(minutes + " minutes is equal to: ");
		
		if(years == 0){
			System.out.println(days + " days.");
		}
		else if(years == 1){
			System.out.println(" a year and " + days + " days.");
		}
		else{
			System.out.println(years + " years " + days + " days.");
		}
		
		input.close();
		
	}

}
