package zadaci_12_08_2015;

import java.util.Stack;

/**
 * Write a program that displays all the prime numbers less than 120 in
 * decreasing order. Use the StackOfIntegers class to store the prime numbers
 * (e.g., 2, 3, 5, ...) and retrieve and display them in reverse order.
 */

public class Zadatak5 {

	public static void main(String[] args) {

		// gornja granica za stampanje prostih brojeva
		int broj = 120;

		// stek u koji smjestamo proste brojeve
		Stack<Integer> prostiBrojevi = new Stack<>();

		// dvicu dodajemo odma, jer je jedini parni broj, da bi u petlji mogli
		// prolaziti samo kroz neparne brojeve
		prostiBrojevi.add(2);

		// pelja u kojoj dodajemo proste brojeve u stek
		for (int i = 3; i < broj; i += 2) {
			if (isPrime(i))
				prostiBrojevi.add(i);
		}

		// printanje rezultaata
		System.out.println("Prosi brojevi manji od " + broj + " su:");

		for (Integer number : prostiBrojevi) {
			System.out.print(number + " ");
		}

	}

	/** Metoda koja provjerava da li je broj prost ili ne */
	public static boolean isPrime(int number) {
		if (number == 0 || number == 1)
			return false;
		else if (number == 2)
			return true;
		else
			for (int i = 3; i < number; i++) {
				if (number % i == 0) {
					return false;
				}
			}
		return true;
	}

}
