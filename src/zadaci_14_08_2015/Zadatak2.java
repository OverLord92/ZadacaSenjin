package zadaci_14_08_2015;

import java.math.BigInteger;

public class Zadatak2 {

	public static void main(String[] args) {

		Long longMax = Long.MAX_VALUE;

		longMax = (long)Math.ceil(Math.sqrt(longMax));

		String longMaxString = longMax + "";

		BigInteger number = new BigInteger(longMaxString);
		BigInteger numberSqr;
		

		for (int i = 0; i < 10; i++) {
			numberSqr = number.multiply(number);
			System.out.println(numberSqr);
			number = number.add(BigInteger.ONE);
		}

	}

}
