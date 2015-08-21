package zadaci_21_08_2015;

import java.util.Scanner;

/**
 * *12.7 (NumberFormatException) Write the bin2Dec(String binaryString) method
 * to convert a binary string into a decimal number. Implement the bin2Dec
 * method to throw a NumberFormatException if the string is not a binary string.
 */

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// promptamo korisnika da unese binarni broj
		System.out.print("Unesite binarni broj koji zelite konvertovati: ");
		String binaryString = input.next();

		input.close();
		
		// printanje rezultata
		System.out.println("Decimalna vrijednost unesenog broja je: "
				+ bin2Dec(binaryString));

	}

	/**
	 * Metoda koja vraca decimarlnu vrijednost binarnog broja. Metoda baca
	 * NumberFormatException ukoliko proslijedjeni string nije binarni broj.
	 */
	public static int bin2Dec(String binaryString) {
		// provjeravamo svaku cifru u stringu. ukolko bilo koja od njih nije
		// 0 ili 1 metoda baca excpetion
		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1')
				throw new NumberFormatException();
		}

		// konvertujemo binarni broj u decimalni
		int result = 0;
		for (int i = 0; i < binaryString.length(); i++) {
			// ako je trenutna cifra 1 povecavamo rezultat
			if (binaryString.charAt(binaryString.length() - i - 1) == '1')
				result += Math.pow(2, i);
		}
		return result;
	}

}
