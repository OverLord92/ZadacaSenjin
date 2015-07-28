package zadaci_28_07_2015;

/**
 * Napisati program koji ispisuje sve moguće kombinacije za biranje dva broja u
 * rasponu od 1 do 7. Također, program ispisuje broj svih mogućih kombinacija.
 * Dakle, program treba da ispiše sve moguće parove brojeva u datom rasponu,
 * krenuvši sa 1 2, 1 3, 1 4, itd. Broj mogućih kombinacija je 21.
 */

public class Zadatak3 {

	public static void main(String[] args) {

		// pocetna i zavrsna godina
		int startNumber = 1;
		int endNumber = 7;

		// brojac za moguce okmbinacije
		int posibleCombinations = 0;

		// printanje rezultata
		System.out.println("   The posible combinations of the numbers "
				+ startNumber + " and " + endNumber + " are:\n");

		for (int i = startNumber; i <= endNumber; i++) {

			for (int j = i; j <= 7; j++) {

				if (i != j) {
					posibleCombinations++;
					System.out.println("    -  " + i + "  " + j);
				}
			}

		}

		System.out.println("\n   The number of combinations is: "
				+ posibleCombinations + ".");

	}

}
