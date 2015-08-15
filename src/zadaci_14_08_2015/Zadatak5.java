package zadaci_14_08_2015;

import java.math.BigInteger;

public class Zadatak5 {

	public static void main(String[] args) {
		
		long longMax = Long.MAX_VALUE;
		String longMaxString = longMax + "";

		BigInteger number = new BigInteger(longMaxString);
		
		int counter = 0;

		while (counter < 10) {
			if ((number.remainder(new BigInteger("5")) == BigInteger.ZERO
					|| (number.remainder(new BigInteger("6")) == BigInteger.ZERO
							 ))){
				
				System.out.println(number);
				counter++;
			}
			number = number.add(BigInteger.ONE);
		}

	}

}
