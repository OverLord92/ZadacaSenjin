package zadaci_14_08_2015;

/** (Mersenne prime) A prime number is called a Mersenne prime if it can be written
 in the form 2p - 1 for some positive integer p. Write a program that finds
 all Mersenne primes with p … 100 and displays the output as shown below.
 (Hint: You have to use BigInteger to store the number, because it is too big to
 be stored in long. Your program may take several hours to run.) */

import java.math.BigInteger;

public class Zadatak4 {

	public static void main(String[] args) {

		int p = 1;
		BigInteger n = BigInteger.ONE;
		BigInteger m;
		BigInteger two = new BigInteger("2");

		System.out.println("         p         2 ^ p - 1");

		while (p <= 100) {
			n = n.multiply(two); // n = 2 ^ p
			m = n.subtract(BigInteger.ONE); // m = 2 ^ p - 1
			
			// provejravamo da li je m prime
			// ako jest m je Mersenne prime
			if (isPrime(m)) {
				System.out.printf("%10d      %8d\n", p, m);
			}
			p++;
		}

	}

	/** Static metoda koja provjerava da li je broj prost ili ne */
	public static boolean isPrime(BigInteger number) {

		if (number.equals(BigInteger.ZERO) || number.equals(BigInteger.ONE))
			return false;
		else if (number.equals(new BigInteger("2")))
			return true;
		else
			for (BigInteger i = new BigInteger("2"); i.compareTo(number) < 0; i = i
					.add(BigInteger.ONE)) {
				if (number.remainder(i).equals(BigInteger.ZERO)) {
					return false;
				}
			}
		return true;
	}

}
