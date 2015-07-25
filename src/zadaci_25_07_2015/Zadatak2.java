package zadaci_25_07_2015;

/** 
 * Napisati program koji ispisuje sve prijestupne godine, 10 po liniji, 
 * u rasponu godina koje korisnik unese. Program pita korisnika da unese 
 * početnu godinu, krajnju godinu te ispisuje sve godine u tom rasponu. 
 * Razmak između godina treba biti jedan space.  
 * 
 */

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int startYear, endYear, yearsPerLine, counter;

		// korisnik unosi podatke
		System.out.print("Enter start year: ");
		startYear = input.nextInt();

		System.out.print("Enter end year: ");
		endYear = input.nextInt();

		System.out.print("Enter the number per line: ");
		yearsPerLine = input.nextInt();

		counter = 1;

		System.out.println("\nThe leap years between " + startYear +
				" and " + endYear + " are: \n");
		
		//petlja za ispisivanje prestupnih godina
		for (int i = startYear; i <= endYear; i++) {
			if (isLeapYear(i)) {
				if (counter % yearsPerLine == 0) {
					System.out.println(i);
				} else {
					System.out.print(i + " ");
				}
				counter++;
			}
		}

	}

	/** Metoda koja vraca true ukoliko je proslieđena godina prestupna */
	public static boolean isLeapYear(int year) {
		// uslov za prestupnu godinu
		return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
	}

}
