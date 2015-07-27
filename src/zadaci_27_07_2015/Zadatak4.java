package zadaci_27_07_2015;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Napišite program koji učitava neodređen broj cijelih brojeva (unos prekida
 * nula), pronalazi najveći od unijetih brojeva te ispisuje koliko se najveći
 * broj puta ponovio. Na primjer, ukoliko unesemo 3 5 2 5 5 5 0 program ispisuje
 * da je najveći broj 5 te ispisuje da se isti ponavlja 4 puta.
 */

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> lista = new ArrayList<>();

		// dodajemo vrijednosti borjeva u String sve dok
		// korisnik ne unese 0
		System.out.print("Unesite sljedeci broj: ");
		int broj = input.nextInt();

		while (broj != 0) {
			lista.add(broj);
			System.out.print("Unesite sljedeci broj: ");
			broj = input.nextInt();
		}

		int maxValue = lista.get(0);
		int maxCounter = 0;

		// petlja za racunanje učestanosti najvećeg roja
		for (Integer number : lista) {

			// parsujemo trenutni član String niza u int;
			if (number > maxValue) {
				maxValue = number;
				maxCounter = 1;
			} else if (number == maxValue)
				maxCounter++;

		}

		// štampanje rezultata
		System.out.println("\nNajveci broj je " + maxValue
				+ " koji je se pojavio " + maxCounter + " puta.");

	}

}
