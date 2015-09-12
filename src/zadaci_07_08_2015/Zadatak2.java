package zadaci_07_08_2015;

import java.util.Arrays;

/**
 * (Random number chooser) Write a method that returns a random number between 1
 * and 54, excluding the numbers passed in the argument. The method header is
 * specified as follows: public static int getRandom(int... numbers)
 */

public class Zadatak2 {

	public static void main(String[] args) {

		// print a random number between 1 and 54 excluding forwarded
		// numbers
		int randomNumber = getRandomNumber(7, 17, 18, 19, 20, 21, 27, 37, 47);
		System.out.println(randomNumber);

	}

	/**
	 * Returns a random integer between 1 and 54 excluding forwarded numbers
	 */
	public static int getRandomNumber(Integer... numbers) {

		int randomNumber;

		do {

			// kepp generating new radnom number until the generated number is
			// not contained in the array numbers
			randomNumber = 1 + (int) (Math.random() * 54);

		} while (Arrays.asList(numbers).contains(randomNumber));

		return randomNumber;
	}

}
