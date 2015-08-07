package zadaci_07_08_2015;

import java.util.Scanner;

/**
 * Write the following method that tests whether the array has four consecutive
 * numbers with the same value. public static boolean isConsecutiveFour(int[]
 * values)
 */

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// kreiramo niz odredljene dimenzije
		System.out.print("Enter the number of values: ");
		int[] values = new int[input.nextInt()];

		// dodavanje unesenih brojeva u niz koji cemo proslijediti metodi
		System.out.print("Enter the values: ");
		for (int i = 0; i < values.length; i++) {
			values[i] = input.nextInt();
		}

		// printanje rezultata
		System.out
				.println(isConsecutiveFour(values) ? "The list has consecutive fours"
						: "The list has NO consecutive fours");

		input.close();

	}

	/** Metoda koja provjeraa da li niz ima 4 uzastopna ista broja */
	public static boolean isConsecutiveFour(int[] values) {
		
		boolean isConFour = false;
		
		int currentNum = values[0];
		int count = 1;
		for (int i = 1; i < values.length; i++) {
			// ukoliko je broj isti povecavamo brojac za += 1
			if (values[i] == currentNum) {
				count++;
				// ako nije mijenjao vrijednost broja i postavljamo brojac na 1
			} else {
				currentNum = values[i];
				count = 1;
			}
			// ako je ovaj uslov ispunjen niz ima 4 uzastopno ista broja
			if (count == 4) {
				isConFour = true;
				break;
			}

		}
		return isConFour;

	}

}
