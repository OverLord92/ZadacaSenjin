package zadaci_26_07_2015;

import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese godinu i prva tri slova imena
 * mjeseca (prvo slovo uppercase) te mu ispiše broj dana u tom mjesecu. Na
 * primjer, ukoliko korisnik kao godinu unese 2001 a kao mjesec Jan program mu
 * ispisuje da Jan 2011 ima 31 dan.
 */

public class Zadatak3 {

	// niz definisan kao static varijabla kako bi mu se moglo pristupiti
	// iz drugih metoda
	static String[] monthNames = { "Jan", "Feb", "Mar", "Apr", "Maj", "Jun",
			"Jul", "Aug", "Sep", "Okt", "Nov", "Dec" };

	/** Modifikovan Zadatak2 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int year, days = 0;
		String monthName;

		// nizovi sa brojevima dana i imenima mjeseci
		int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// korisnik unosi podatke
		System.out.print("Enter the year: ");
		year = input.nextInt();

		//provjeravamo da li je godina prestupna
		if (isLeapYear(year))
			daysInMonth[1]++;

		System.out.print("Enter the first tree letters of the month: ");
		monthName = input.next();

		// u slucaju nevazeceg unosa program  printa poruku 
		//da korisnik pokusa ponovo i prekida sa radom
		isInputValid(monthName);

		for (int i = 0; i < monthNames.length; i++) {
			if (monthName.equals(monthNames[i])) {
				days = daysInMonth[i];
				break;
			}
		}

		// printanje rezultata
		System.out.print(monthName + " " + year + " ima " + days);
		System.out.println(days == 31 ? " dan." : " dana.");
		input.close();

	}

	/** Metoda koja vraca true ukoliko je godina prestupna */
	// nisam morao pisati metodu jer sam ju imao vec u jednom od prethodnih
	// zadataka, ali za svaki slučaj
	public static boolean isLeapYear(int year) {
		// return(year % 4 == 0);
		return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
	}

	/** Metoda koja prekida rad programa u slucaju pogresnog unosa */
	public static void isInputValid(String monthName) {
		for (int i = 0; i < monthNames.length; i++) {
			if (monthName.equals(monthNames[i]))
				return;
		}
		System.out.println("Invalid enter. Restart and try Again.");
		System.exit(1);
	}

}
