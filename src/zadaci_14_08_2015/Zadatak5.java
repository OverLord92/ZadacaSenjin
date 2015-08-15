package zadaci_14_08_2015;

/** (Divisible by 5 or 6) Find the first ten numbers greater than Long.MAX_VALUE
 that are divisible by 5 or 6. */

import java.math.BigInteger;

public class Zadatak5 {

	public static void main(String[] args) {

		// smjestamo Long.MAX_VALUE u longMax
		long longMax = Long.MAX_VALUE;
		
		// smjetamo u string kao bi mogli koristiti u 
		// BigInteger kontruktoru
		String longMaxString = longMax + "";

		BigInteger number = new BigInteger(longMaxString);

		int counter = 0;

		// ukoliko je broj djeljiva sa 5 ili 6 printamo broj
		while (counter < 10) {
			if ((number.remainder(new BigInteger("5")) == BigInteger.ZERO || (number
					.remainder(new BigInteger("6")) == BigInteger.ZERO))) {

				System.out.println(number);
				counter++;
			}
			number = number.add(BigInteger.ONE);
		}

	}

}
