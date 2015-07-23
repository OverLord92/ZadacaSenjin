package zadaci_23_07_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese neki cijeli broj te ispisuje
 * njegove najmanje faktore u rastućem redosljedu. Na primjer, ukoliko korisnik
 * unese 120 program treba da ispiše 2, 2, 2, 3, 5. (2 * 2 * 2 * 3 * 5 = 120)
 */

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		int number = 0;
		try {

			number = inputInteger();
		} catch (InputMismatchException e) {
			number = inputInteger();
		}
		// stampanje prostih faktora pomocu dvije while petlje
		int counter;
		System.out.print("The factors of the integer are: ");
		while (number != 1) {
			counter = 2;
			while (!(number % counter == 0)) {
				counter++;
			}
			System.out.print(counter + " ");
			// dijelimo sa faktorom
			number /= counter;

		}

	}

	public static int inputInteger() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer to print out its faktors ");
		return input.nextInt();
	}

	/** Metoda za printanje prosti faktora pomocu rekurzije*/
	public static void recursiveProstiFaktori(int num) {
		if (num == 1)
			return;
		else {
			int counter = 2;
			while (!(num % counter == 0)) {
				counter++;
			}
			System.out.print(counter + " ");
			recursiveProstiFaktori(num / counter);
		}

	}

}
