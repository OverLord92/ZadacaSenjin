package zadaci_14_08_2015;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * *10.16 (Divisible by 2 or 3) Find the first ten numbers with 50 decimal
 * digits that are divisible by 2 or 3.
 */

public class Zadatak1 {

	public static void main(String[] args) {

		BigDecimal numberDecimal = new BigDecimal("1e50");

		BigInteger number = numberDecimal.toBigInteger();
		
		int counter = 0;

		while (counter < 10) {
			if ((number.remainder(new BigInteger("2")) == BigInteger.ZERO
					|| (number.remainder(new BigInteger("3")) == BigInteger.ZERO
							 ))){
				
				System.out.println(number);
				counter++;
			}
			number = number.add(BigInteger.ONE);
		}
	}

}
