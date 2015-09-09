package zadaci_04_08_2015;

import java.util.Scanner;

/**
 * Write a program which asks the user to enter an integer and the desired width
 * of the format in which the number should be printed.
 */

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// ask user to enter number and desired width
		System.out.print("Enter number and width: ");

		int number = input.nextInt();
		int width = input.nextInt();

		// print result
		System.out.println(format(number, width));

		input.close();

	}

	/** Metoda koja vraca broj sa vodecim nulama */
	public static String format(int number, int width) {

		// smjestamo broj u string
		String num = number + "";
		String result = "";

		// concat leading zeros result
		for (int i = 0; i < width - num.length(); i++) {
			result += "0";
		}

		// concat number to result
		result += num;

		return result;
	}

}
