package zadaci_23_07_2015;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Napisati metodu sa sljedećim headerom koja ispisuje tri broja u rastućem
 * redosljedu: public static void displaySortedNumbers(double num1, double num2,
 * double num3). Napisati program koji pita korisnika da unese tri broja te
 * ispiše ta tri broja u rastućem redosljedu.
 */

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out
				.println("Enter tree numbers, to display them in increasing order: ");
		displaySortedNumbers(input.nextDouble(), input.nextDouble(),
				input.nextDouble());

		input.close();
	}

	/** Metoda koja proslijeđene brojeve ispisuje u rastućem redoslijedu */
	public static void displaySortedNumbers(double num1, double num2,
			double num3) {
		// vrijednosti ubacujemo u niz
		double[] array = { num1, num2, num3 };
		// sortiranje niz
		Arrays.sort(array);
		// ispisivanje sortiranog niza
		for (double number : array)
			System.out.printf("%-6.2f", number);

	}

}
