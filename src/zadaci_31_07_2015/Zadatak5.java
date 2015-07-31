package zadaci_31_07_2015;

import java.util.Scanner;

/**
 * Pretpostavimo da kupujemo rižu ili neki drugi proizvod u dva različita
 * pakovanja. Želimo napisati program koji upoređuje cijene ta dva pakovanja.
 * Program pita korisnika da unese težinu i cijenu oba pakovanja te ispisuje
 * koje pakovanje ima bolju cijenu.
 */

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double cijena1, tezina1, cijena2, tezina2;

		// korisnik unosi tezinu i cijenu prvog pakovanja
		System.out.print("unesite tezinu i cijenu prvog pakovanja: ");
		tezina1 = input.nextDouble();
		cijena1 = input.nextDouble();

		// korisnik unosi tezinu i cijenu drugog pakovanja
		System.out.print("unesite tezinu i cijenu drugog pakovanja: ");
		tezina2 = input.nextDouble();
		cijena2 = input.nextDouble();

		// racunanje i printanje rezultata
		if (tezina1 / cijena1 == tezina2 / cijena2) {
			System.out.println("Pakovanja imaju isti odnos tezine po cijeni.");
		} else if (tezina1 / cijena1 >= tezina2 / cijena2) {
			System.out.println("Isplativije vam je uzeti prvo pakovanje.");
		} else {
			System.out.println("Isplativije vam je uzeti drugo pakovanje.");
		}

		input.close();
	}

}
