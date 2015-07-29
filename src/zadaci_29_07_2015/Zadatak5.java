package zadaci_29_07_2015;

import java.util.Scanner;

/**
 * Napisati program koji učitava neodređen broj cijelih brojeva, određuje koliko
 * je pozitivnih brojeva korisnik unijeo, koliko negativnih te izračunava ukupnu
 * sumu i prosjek svih unesenih brojeva. (Korisnik prekida unos tako što unese
 * nulu). Na primjer, ukoliko korisnik unese 1 2 -1 3 0 program treba da ispiše
 * da je broj pozitivnih brojeva 3, negativnih brojeva 1, suma ili zbir su 5.0 a
 * prosjek svih brojeva je 1.25.
 */

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number, count = 0, positive = 0, negative = 0;
		double averrage, sum = 0;

		// korsinik unosi brojeve do ne unese nulu
		do {

			System.out.print("Enter a number: ");
			number = input.nextInt();

			if (number > 0) {
				positive++;
			} else if (number < 0) {
				negative++;
			}

			// racunanje sume
			sum += number;
			count++;
		} while (number != 0);

		// racunanje prosjeka
		averrage = sum / (count - 1);

		// printanje rezultata
		System.out.println("Pozitivnih brojeva je " + positive
				+ ", negativnih brojeva " + negative + ",\nzbir je " + sum
				+ " a prosjek svih brojeva je " + averrage);
		
		input.close();

	}

}
