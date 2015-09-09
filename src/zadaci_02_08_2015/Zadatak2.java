package zadaci_02_08_2015;

import java.util.Scanner;

/**
 * Write a program that prints the string length and the first character.
 */

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// ask user to enter string
		System.out.println("Enter string: ");
		String str = input.nextLine();

		// print string length and first char
		System.out.println("The length of the string is " + str.length()
				+ ", the first character is " + str.charAt(0) + ".");
		
		input.close();

	}

}
