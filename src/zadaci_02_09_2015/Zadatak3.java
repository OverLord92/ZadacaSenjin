package zadaci_02_09_2015;

/**
 * *18.10 (Occurrences of a specified character in a string) Write a recursive
 * method that finds the number of occurrences of a specified letter in a string
 * using the following method header: public static int count(String str, char
 * a)
 */

public class Zadatak3 {

	/** Test program */
	public static void main(String[] args) {

		System.out.println(count("baraba ", 'a'));

	}

	/** Metoda koja broji koliko se puta char a pojavljuje u stringu str */
	public static int count(String str, char a) {

		// brojac
		int count = 0;

		// ukoliko je duzina stringa == 0 metoda vraca brojac
		if (str.length() == 0) // base case
			return count;

		// ako je string duzine 1 ili duzi ponovo pozivamo metodu sa subtringom
		// koji iskljucuje zadnji karakter stringa
		else {
			
			// provjeravamo da li je zadnji karakter stringa jednak charu a
			if (a == str.charAt(str.length() - 1)){
				// ako jest, povecavamo brojac za 1
				count++;
			}
			// ponovno pozivanje metode sa substringom
			str = str.substring(0, str.length() - 1);
			return count + count(str, a);
		}

	}

}
