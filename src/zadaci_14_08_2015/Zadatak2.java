package zadaci_14_08_2015;

/** (Square numbers) Find the first ten square numbers that are greater than
 Long.MAX_VALUE. A square number is a number in the form of n2. For example,
 4, 9, and 16 are square numbers. Find an efficient approach to run your
 program fast. */

import java.math.BigInteger;

public class Zadatak2 {

	public static void main(String[] args) {

		// broj longMax definisemo kao najvecu vrijednost koja moze stati u
		// varijablu tipa long
		Long longMax = Long.MAX_VALUE;

		// zatim vadimo korjen tog broja i zaokruzujemo ga sa Math.ceil
		// tako d ace kvadrat ovog broja sigurno biti veci of Long.MAX_VALUE
		longMax = (long) Math.ceil(Math.sqrt(longMax));

		// broj smjestamo u stirng
		String longMaxString = longMax + "";

		// kreiram oobjekat BigInteger
		BigInteger number = new BigInteger(longMaxString);
		BigInteger numberSqr;

		// printamo prvih 10 brojevaq koji us veci od Long.MAX_VALUE
		for (int i = 0; i < 10; i++) {
			numberSqr = number.multiply(number);
			System.out.println(numberSqr);
			number = number.add(BigInteger.ONE);
		}

	}

}
