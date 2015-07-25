package zadaci_21_07_2015;

/**
 * Napisati program koji ispisuje sve prestupne godine, 10 po liniji, od godine
 * 101 do 2100, odvojene jednim spaceom. Također ispisati i ukupan broj
 * prijestupnih godina u ovom vremenskom periodu.
 */

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Vrijednosti pocetne i zavrsne godine kao i zeljeni broj ispisanih
		// godina po liniji se mogu mijenjati u linija ispod
		int startYear = 101;
		int endYear = 2100;

		int yearsPerLine = 10;
		int leapYears = 1;

		System.out.println("The leap years between the year " + startYear
				+ " an the year " + endYear + " are: \n");

		/**
		 * Provjeravamo za sve brojeve od pocetne do zavrsne godine da li su
		 * prestupne
		 */
		for (int i = startYear; i <= endYear; i++) {
			
			// uslov za prestupnu goidnu
			if ((i % 400 == 0 || (i % 4 == 0 && i % 100 != 0))) {

				// broj ispisanih godina po liniji
				if (leapYears % yearsPerLine == 0) {
					System.out.println(i);
				} else {
					System.out.print(i + " ");
				}
				leapYears++;
			}
		}

		System.out.println("\n\nThe number of leap years between the year "
				+ startYear + " an the year " + endYear + " is " + leapYears
				+ ".");

	}

}
