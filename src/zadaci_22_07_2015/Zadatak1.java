package zadaci_22_07_2015;

/**
 * Napisati metodu koja prima 2 argumenta: početni broj i krajnji broj te printa
 * sve proste brojeve u zadanom rangu. BONUS: metoda može primati i treći
 * argument, broj brojeva za isprintati po liniji.
 */

public class Zadatak1 {

	/** Testna metoda */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPrimeNumbers(1, 100);
		printPrimeNumbers(1, 100, 5);
	}

	/**
	 * Metoda koja prima dva argumenta i ispisuje sve proste brojeve u rom
	 * rasponu
	 */
	public static void printPrimeNumbers(int startNum, int endNum) {
		System.out.println("The prime numbers between " + startNum + " and "
				+ endNum + " are: ");
		for (int i = startNum; i <= endNum; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
		System.out.println();
	}

	/**
	 * Overloadovana metoda koja prima tri argumenta i ispisuje odredjen broj
	 * prostih brojeva po liniji
	 * */
	public static void printPrimeNumbers(int startNum, int endNum, int perLine) {
		
		System.out.println("The prime numbers between " + startNum + " and "
				+ endNum + " are: ");
		
		int numberOfPrimes = 1;
		for (int i = startNum; i <= endNum; i++) {

			if (isPrime(i)) {
				if (numberOfPrimes % perLine == 0) { // uslov za prelazak u
														// sljedeci red
					System.out.printf("%-4d\n", i);
				} else {
					System.out.printf("%-4d", i);
				}
				numberOfPrimes++;
			}
		}
		System.out.println();
	}

	/** Metoda koja provjerava da li je broj prost ili ne */
	public static boolean isPrime(int number) {
		if (number == 0 || number == 1)
			return false;
		else if (number == 2)
			return true;
		else
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					return false;
				}
			}
		return true;
	}

}
