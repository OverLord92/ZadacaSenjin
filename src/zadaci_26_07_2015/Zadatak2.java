package zadaci_26_07_2015;

import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese mjesec i godinu te mu ispiše
 * broj dana u datom mjesecu. Na primjer, ukoliko korisnik unese kao godinu 2012
 * a kao mjesec 2, program treba ispisati da je Februar 2012 imao 29 dana.
 * Ukoliko korisnik unese kao godinu 2015 a kao mjesec 3, program treba ispisati
 * da je Mart 2015 imao 31 dan.
 */

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int year, monthNumber, days;
		
		// nizovi sa brojevima dana i imenima mjeseci
		int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] monthName = { "Januar", "Februar", "Mart", "April", "Maj", "Jun",
				"Jul", "August", "Septembar", "Oktobar", "Novembar", "Decembar" };

		
		// korisnik unosi podatke
		System.out.print("Enter the year: ");
		year = input.nextInt();

		// provjeravamo da li je godina prestupna
		if (isLeapYear(year))
			daysInMonth[1]++;

		System.out.print("Enter the month: ");
		monthNumber = input.nextInt() - 1;
		
		days = daysInMonth[monthNumber];

		// printanje rezultata
		System.out.print(monthName[monthNumber] + " " + year + " ima " + days);
		System.out.println(days == 31? " dan." : " dana.");
		input.close();

	}

	/** Metoda koja vraca true ukoliko je godina prestupna */
	// nisam morao pisati metodu jer sam ju imao vec u jednom od prethodnih
	// zadataka, ali za svaki slučaj
	public static boolean isLeapYear(int year) {
		// return(year % 4 == 0);
		return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
	}

}
