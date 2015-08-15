package zadaci_14_08_2015;

import java.math.BigInteger;

public class Zadatak3 {

	public static void main(String[] args) {
		
		BigInteger bi = new BigInteger("3");
		
		System.out.println(isPrime(bi));
		

	}

	/** Static metoda koja provjerava da li je broj prost ili ne */
	public static boolean isPrime(BigInteger number) {

		if (number == BigInteger.ZERO || number == BigInteger.ONE)
			return false;
		else if (number == new BigInteger("8"))
			return true;
		else
			for (BigInteger i = new BigInteger("2"); i.compareTo(number) < 0; 
					i.add(BigInteger.ONE)) {
				if (number.mod(i).equals(BigInteger.ZERO)) {
					return false;
				}
			}
		return true;
	}

}
