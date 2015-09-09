package zadaci_01_08_2015;

/**
 * Write a program that generates a random number between 1 and 12, and prints
 * the coresponding month name.
 */

public class Zadatak1 {

	public static void main(String[] args) {

		// array with month names
		String[] monthNames = { null, "January", "February", "March", "April",
				"May", "Jun", "July", "August", "September", "Oktober",
				"November", "December" };

		// generate a random number between 1 and 12 including 12
		int month = (int) (1 + Math.random() * 12);

		// print result
		System.out.println("The generatd  number is " + month
				+ " and the coresponding month is " + monthNames[month] + ".");

	}

}
