package zadaci_03_08_2015;

/**
 * Pretpostavimo da školarina za godinu dana na fakultetu košta 10.000 i da se
 * povećava za 5% svake godine. Godinu dana od danas, školarina će iznositi
 * 10.500. Napisati program koji izračunava koliko će školarina za godinu dana
 * iznositi kroz 10 godina.
 */

public class Zadatak5 {

	public static void main(String[] args) {

		double skolarina = 10_000;

		double porastSkolarine = 0.05;

		// printanje rezultata
		for (int i = 1; i <= 10; i++) {
			skolarina *= (1 + porastSkolarine);
			System.out.printf("Poslije %2d " + (i < 5 ? "godine" : "godina")
					+ " skolarina ce iznosti %.2f.\n", i, skolarina);
		}

	}

}
