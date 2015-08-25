package zadaci_25_08_2015;

/** **13.4 (Display calendars) Rewrite the PrintCalendar class in Listing 6.12 to display
 a calendar for a specified month using the Calendar and GregorianCalendar
 classes. Your program receives the month and year from the command line. For
 example:
 java Exercise13_04 5 2016 */

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);

		int year, month;

		// prosljdjujemo argumente iz komandne linije
		year = Integer.parseInt(args[1]);

		month = Integer.parseInt(args[0]);

		// printanje kalendara
		Kalendar.printCal(year, month);

		input.close();
	}
}

class Kalendar {

	// niz za imenima mjeseci
	public static final String[] MONTH_NAMES = { "Jan", "Feb", "Mar", "April",
			"Maj", "Jun", "Jul", "Aug", "Sep", "Okto", "Nov", "Dec" };

	// niz sa brojevima dana u mjesecima
	public static final int[] DAYS_IN_MONTH = { 31, 28, 31, 30, 31, 30, 31, 31,
			30, 31, 30, 31 };

	// niz sa imenima dana
	public static final String[] NAME_OF_DAYS = { "Pon", "Uto", "Sri", "Cet",
			"Pet", "Sub", "Ned" };

	/** Helper metoda koja poziva metode za header i body */
	public static void printCal(int year, int month) {

		printHeader(year, month);

		printBody(year, month);

	}

	/** Metoda koja printa zaglavlje kalendara */
	public static void printHeader(int year, int month) {

		System.out.println("\n                   " + MONTH_NAMES[month - 1]
				+ " " + year + "                 ");
		System.out.println("  _____________________"
				+ "______________________\n");

		System.out.print("    ");

		// petlja koja printa imena dana sedmice
		for (int i = 0; i < 7; i++) {
			System.out.printf("%3s   ", NAME_OF_DAYS[i]);
		}
	}

	/** Metoda koja printa tijelo kalendara */
	public static void printBody(int year, int month) {

		// ako je godina prestupna februar ima 28 + 1 dana
		// if (isLeapYear(year))
		// DAYS_IN_MONTH[1]++;

		// brojac za "prazna mjesta"
		int counter = getStartDays(year, month) - 1;

		System.out.println();
		System.out.print("    ");

		for (int i = 0; i <= counter; i++) {
			System.out.print("      ");
		}

		// broj dana u printanom mjesecu
		int daysInMonth = DAYS_IN_MONTH[month - 1];

		// povecanje broja dana ako je februar u prestupnoj godini
		if (isLeapYear(year) && month == 2) {
			daysInMonth++;

		}
		// brojac koji stampa datume
		for (int i = 1; i <= daysInMonth; i++) {

			counter++;

			if (counter % 7 == 0)
				System.out.print("\n    ");

			System.out.printf("%-6d", i);

		}

		System.out.println();

	}

	/** Metoda koja vraca pocetni dan mjeseca */
	public static int getStartDays(int year, int month) {

		month--;

		// 1. januar 1970 je bio četvrtak

		int days = 0;

		// petlja koja broji dane do po godinama koje su prosle od 1973
		// do trazene godine
		for (int i = 1973; i < year; i++) {

			if (isLeapYear(i)) {
				days += 366;
			} else {
				days += 365;
			}

		}

		// petlja koj broji dane po mjesecima do trazenog mjeseca
		for (int i = 0; i < month; i++) {
			days += DAYS_IN_MONTH[i];
		}

		if (month > 1 && isLeapYear(year))
			days++;

		// ako je prvi dan u mjesecu pon metoda vraca 0, utorak 1 itd
		return days % 7;

	}

	/** Metoda koja vraca true ukoliko je je godina prestupna */
	public static boolean isLeapYear(int year) {

		return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
	}

}
