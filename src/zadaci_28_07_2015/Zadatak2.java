package zadaci_28_07_2015;

import java.util.ArrayList;

/**
 * Twin prime brojevi su par prostih brojeva koji se razlikuju za 2. Na primjer,
 * brojevi 3 i 5 su twin primes, brojevi 5 i 7 i 11 i 13 su također twin primes.
 * Napisati program koji ispisuje sve twin prime brojeve manje od 10000, 10
 * parova po liniji.
 */

public class Zadatak2 {

	public static void main(String[] args) {

		// lista u koju smještamo proste brojeve
		ArrayList<Integer> primeNumbers = new ArrayList<>();

		// ubacujemo 2 u listu zato što je jedini paran prost broj
		primeNumbers.add(2);

		// d abi u petlji mogli prolaziti samo kroz neparne brojeve
		for (int i = 3; i < 10000; i += 2) {

			if (isPrime(i))
				primeNumbers.add(i);

		}

		
		int num1, num2;
		int counter = 0;
		
		// broj printanih parova po liniji
		int perLine = 10;

		// petlja u kojoj provjerevamo da li je razlika dva susjedna 
		// prosta broja 2, ako jest printamo par
		for (int i = 0; i < primeNumbers.size() - 1; i++) {
			
			num1 = primeNumbers.get(i);
			num2 = primeNumbers.get(i + 1);
			
			if (num2 - num1 == 2) {
				counter++;
				
				// printamo odredjeni broj parova po liniji
				if (counter % perLine == 0) {
					System.out.printf("%4d & %-4d;   \n", num1, num2);
				} else
					System.out.printf("%4d & %-4d;   ", num1, num2);
				
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
