package zadaci_30_07_2015;

/**
 * Napisati metodu sa sljedećim headerom: public static int isPrime(int n) koja
 * provjerava da li je broj prost/prime. Napsati test program koji poziva ovu
 * metodu i ispisuje sve proste brojeve u rasponu od 0 do 100_000.
 */

public class Zadatak3 {

	public static void main(String[] args) {

		// broj ispisanih brojeva po liniji
		int perLine = 10;
		
		int counter = 1;

		
		System.out.println("The prime numbers between 0 and 100000 are:\n");
		
		// dvicu stampamo posebno kao jedini parni prosti broj
		System.out.printf("%-5d ", 2);
			
		// da bi u petlji mogli prolaziti samo kroz neparne brojeve
		for (int i = 3; i <= 100_000; i += 2) {

			if (isPrime(i) == 1) {
				counter++;

				// printanje prostih brojeva
				if (counter % perLine == 0) {
					System.out.println(i);
				} else {
					System.out.printf("%-5d ", i);
				}
			}
		}

	}

	/** Metoda vraca 1 ukoliko je broj prost, a 0 ako broj nije prost */
	public static int isPrime(int n) {

		// broj je se vodi kao prost 
		int isPrime = 1;

		for (int i = 2; i <= n / 2; i++) {
			
			// sve dok se ovaj uslov ispuni
			if (n % i == 0) {
				isPrime = 0;
			}
		}

		return isPrime;
	}

}
