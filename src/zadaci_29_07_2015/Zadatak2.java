package zadaci_29_07_2015;

/**
 * Napisati program koji ispisuje sve proste brojeve od 2 do 1000, ukljućujući i
 * 2 i 1000. Program treba da ispiše 8 brojeva po liniji te razmak između
 * brojeva treba da bude jedan space.
 */

public class Zadatak2 {

	public static void main(String[] args) {

		int counter = 1;

		// broj prostih brojeva koje zelimo printati po linijii
		int perLine = 8;

		// printamo 2 prije petlje
		System.out.print(2 + " ");

		// da bi u petlji mogli prolaziti samo kroz neparne brojeve
		for (int i = 3; i <= 1000; i += 2) {
			if (isPrime(i)) {
				counter++;
				if (counter % perLine == 0) {
					System.out.println(i);
				} else {
					System.out.print(i + " ");
				}
			}
		}

	}

	/** Metoda koja provjerava da li je broj prost ili ne */
	public static boolean isPrime(int number) {
		if (number == 0 || number == 1)
			return false;
		else if (number == 2)
			return true;
		else
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					return false;
				}
			}
		return true;
	}

}
