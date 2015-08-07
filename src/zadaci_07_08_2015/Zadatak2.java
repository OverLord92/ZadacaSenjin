package zadaci_07_08_2015;


/**
 * (Random number chooser) Write a method that returns a random number between 1
 * and 54, excluding the numbers passed in the argument. The method header is
 * specified as follows: public static int getRandom(int... numbers)
 */

public class Zadatak2 {

	public static void main(String[] args) {

		// printanje proizvoljnog broja koji iskljucuje proslijedjene brojeve
		int randomNumber = getRandom(7, 17, 27, 37, 47);
		System.out.println(randomNumber);

	}

	/**
	 * Metoda koja vraca proizvoljan broj iskljucujuci brojeve koji su
	 * proslijedjeni kao argumenti
	 */
	public static int getRandom(int... numbers) {

		int result;

		do {
			result = 1 + (int) (Math.random() * 54);

			// broju result dodjeljujemo cnovu proizvoljnu vrijednost sve dok se
			// ona ne nalazi u nizu brojeva koji su prosliedjeni metodi
		} while (isPresentInArray(numbers, result));

		return result;
	}

	/** Metoda koja provjerava da li se broj nalazi u nizu */
	public static boolean isPresentInArray(int[] numbers, int num) {
		boolean isPresent = false;

		for (int i : numbers) {
			if (i == num)
				isPresent = true;
		}

		return isPresent;
	}

	// Nisam mogao koristiti Arrays.asList(array).contains(number) zato sto taj
	// nacin ne radi sa primitivnim varijablama pa sam napisao kastm metodu

}
