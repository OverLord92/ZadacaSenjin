package zadaci_28_07_2015;

/**  
 * Napisati metodu koja vraća broj dana u godini. Metoda koristi 
 * sljedeći header: public static int numberOfDayInAYear(int year). 
 * Napisati program koji pita korisnika da unese početnu godinu, 
 * krajnju godinu te ispisuje broj dana za svaku godinu u rasponu. 
 * 
 */

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int startYear, endYear;

		// korisnik unosi pocetnu i zavrsnu godinu
		System.out.print("Enter the start and end year: ");
		startYear = input.nextInt();
		
		System.out.print("Enter end year: ");
		endYear = input.nextInt();
		
		System.out.println();
		
		// printanje godina i broj dana u za svaku pojedinacnu godinu
		for(int i = startYear; i <= endYear; i++){
			System.out.println("The year " + i + " has " + numberOfDayInAYear(i) + " days.");
		}
		
		input.close();
		

	}

	/** Metoda koja vraca broj dana u godini */
	public static int numberOfDayInAYear(int year) {
		if (isLeapYear(year))
			return 366;
		else
			return 365;
	}

	/** Metoda koja provjerava da li je godina prestupna */
	public static boolean isLeapYear(int year) {

		return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));

	}

}
