package zadaci_14_08_2015;

/** (Large prime numbers) Write a program that finds five prime numbers larger
 than Long.MAX_VALUE. */

import java.math.BigInteger;

public class Zadatak3 {

	/** Test program */
	public static void main(String[] args) {

		BigInteger dva = new BigInteger("2");
		System.out.println("2 is prime? " + isPrime(dva));

		BigInteger tri = new BigInteger("3");
		System.out.println("3 is prime? " + isPrime(tri));

		BigInteger deset = new BigInteger("10");
		System.out.println("10 is prime? " + isPrime(deset));

	}

	/** Static metoda koja provjerava da li je broj prost ili ne */
	public static boolean isPrime(BigInteger number) {

		// metoda je identicna prethodnim isPrime metodama samo sto je
		// prilagodjena radu s BigIntegerima
		
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
