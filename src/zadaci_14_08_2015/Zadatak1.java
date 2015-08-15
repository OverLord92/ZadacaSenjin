package zadaci_14_08_2015;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * *10.16 (Divisible by 2 or 3) Find the first ten numbers with 50 decimal
 * digits that are divisible by 2 or 3.
 */

public class Zadatak1 {

	public static void main(String[] args) {

		// BigDecimal u koji smjestamo broj u scientific notation
		// da ne bi moral ipisati 50x 0
		BigDecimal numberDecimal = new BigDecimal("1e50");

		// zatim broj prebacujemo u integer
		BigInteger number = numberDecimal.toBigInteger();

		int counter = 0;

		// petlja koja printa prvih 10 50-ocifrenih brojeva koji su djeljivi sa
		// 2 ili 3
		while (counter < 10) {
			// ako je broj djeljiv sa 2 ili 3 printamo ga
			if ((number.remainder(new BigInteger("2")) == BigInteger.ZERO || (number
					.remainder(new BigInteger("3")) == BigInteger.ZERO))) {

				System.out.println(number);
				counter++;
			}
			number = number.add(BigInteger.ONE);
		}
	}

}
