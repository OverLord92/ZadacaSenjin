package zadaci_04_08_2015;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * Write a program which takes 10 numbers and prints the distinct numbers.
 */

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// place numbers in linked hash set, hashset dont allow duplicates
		LinkedHashSet<Integer> distinctNumbers = new LinkedHashSet<>();

		// user enters numbers
		System.out.print("\nEnter 10 numbers: ");

		// place entered numbers into hashset
		for (int i = 0; i < 10; i++)
			distinctNumbers.add(input.nextInt());

		// print result
		System.out.print("You enterd " + distinctNumbers.size()
				+ " distinct numbers.\n");

		System.out.print("Ditinct: ");
		for (Integer i : distinctNumbers) {
			System.out.print(i + " ");
		}

		input.close();
	}

}
