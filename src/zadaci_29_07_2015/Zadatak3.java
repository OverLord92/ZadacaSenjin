package zadaci_29_07_2015;

/**
 * Ako pozovemo metodu System.currentTimeMillis() dobijemo broj milisekundi od
 * 1. januara 1970 do trenutka pozivanja metode. Napisati program koji ispisuje
 * trenutačni datum i vrijeme u formatu "Trenutni datum i vrijeme: 22. juli,
 * 2015 19:59:47
 */

public class Zadatak3 {

	// nizovi imena mjeseci i dana u mjesecu 
	public static final String[] MONTH_NAMES = { "Jan", "Feb", "Mar", "April",
			"Maj", "Jun", "Jul", "Aug", "Sep", "Okto", "Nov", "Dec" };

	public static final int[] DAYS_IN_MONTH = { 31, 28, 31, 30, 31, 30, 31, 31,
			30, 31, 30, 31 };
	
	// varijable potrebne za racunanje rezultata definisane na nivou klase
	// kako bi bile dostupne u svim metodama
	static int millis_per_sec = 1000;
	static int millis_per_min = 60_000;
	static int millis_per_hour = 3_600_000;

	static long millis_per_day = 24 * millis_per_hour;
	static long millis_per_year = 365 * millis_per_day;

	// mogucnost podesavanja vremenske zone
	static int timeZone = +2;
	
	
	

	public static void main(String[] args) {
		
		long millis = System.currentTimeMillis();

		printDateAndTime(millis);
	}
	
	
	/** metoda za rpintanje datuma i vremena */
	public static void printDateAndTime(long millis){
		
		System.out.print("Trenutni datum i vrijeme: ");
		System.out.println(getDate(millis) + "" +getTime(millis));
		
	}

	/** Metoda koja vraca trenutni datum u oblik stringa */
	public static String getDate(long millis) {
		
		String date = "";

		// pocetna godina unix vremena
		int year = 1970;

		// izracunavanje godine
		while (millis > millis_per_year) {

			millis -= millis_per_year;
	
			if (isLeapYear(year)) {
				millis -= millis_per_day;
			}
			
			year++;

		}
		
		// racunanje mjeseca
		int month = 0;
		
		while(millis > (DAYS_IN_MONTH[month] * millis_per_day)){
			millis -= (DAYS_IN_MONTH[month] * millis_per_day);
			month++;
			
		}
		
		// racunanje dana
		long days = millis / millis_per_day + 1;
		
		
		if(days < 10){
			date += "0"; 
		}
		date += days + ".";
		
		date += MONTH_NAMES[month] + ", " + year + " ";
		
		
		return date;

	}

	/** Metoda koja vraca trenutno vrijeme */
	public static String getTime(long millis) {

		String time = "";

		int hours, mins, secs;

		// racunanje sati
		hours = (int) ((millis / millis_per_hour) % 24) + timeZone;
		millis %= millis_per_hour;

		// dodajemo nulu ispred sata ukoliko je hours <10
		if (hours < 10)
			time += "0" + hours + ":";
		else
			time += hours + ":";

		
		// racunanje minute
		mins = (int) (millis / millis_per_min);
		millis %= millis_per_min;

		//dodajemo nulu ispred minute ukoliko je mins < 10
		if (mins < 10)
			time += "0" + mins + ":";
		else
			time += mins + ":";

		
		
		// racunanje sekunde 
		secs = (int) (millis / millis_per_sec);

		// dodavanje nule ispred sekunde ako je secs < 10
		if (secs < 10)
			time += "0" + secs + "";
		else
			time += secs + "";

		return time;
	}

	
	/** Metoda koja vraca true ukoliko je je godina prestupna */
	public static boolean isLeapYear(int year) {

		return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
	}

}
