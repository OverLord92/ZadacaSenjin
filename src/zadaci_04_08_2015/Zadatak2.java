package zadaci_04_08_2015;

import java.util.Scanner;

/**
 * Write a program that takes a character and prints his unicode.
 */

public class Zadatak2 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	// ask the user to enter a character
	System.out.print("\n  Unesite karakter: ");
	char c = input.next().charAt(0);
	
	// print result
	System.out.print("  Unicode za taj karakter je: " + (int)(c));
	
	input.close();
	
	}

}
