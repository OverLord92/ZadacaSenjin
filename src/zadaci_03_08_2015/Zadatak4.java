package zadaci_03_08_2015;

import java.util.Scanner;

/**
 * Napišite program koji pita korisnika da unese cijeli broj i ispiše njegov
 * ekvivalent u binarnom kodu. Za ovaj program NE smijemo koristiti
 * Integer.toBinaryString(int) metodu.
 */

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String result = "";

		System.out.print("\n  Unesite cijeli broj: ");
		int broj = input.nextInt();

		// integer kojem dodjeljujemo vrijednost unesenog broja
		// koristi se za racunanje duzine binarnog broja
		// da bi uneseni broj ostao nepromjenjen
		int number = broj;

		// najveci stepen na 2 manji od unesenog broja
		int najveciStepen = 0;

		// odredjujemo najveci stepen odnosno duzinu binarnog broja
		while (number > 0) {
			number /= 2;
			if (number != 0) {
				najveciStepen++;
			}
		}

		// petlja za printanje binarnog broja
		for (int i = najveciStepen; i >= 0; i--) {
			// ako je 2 na i manje od preostalog broja pisemo 1
			// i oduzimamo 2 na i od broja
			if (Math.pow(2, i) <= broj) {
				result += "1";
				broj -= Math.pow(2, i);
				// u suprotnom slučaju pišemo 0
			} else {
				result += "0";
			}
		}
		
		// printanje rezultata
		System.out.println("\n    Uneseni broj ispisan u binarnom obliku: " + result + ".");

		input.close();

	}
}
