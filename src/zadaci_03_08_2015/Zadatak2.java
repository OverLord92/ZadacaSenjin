package zadaci_03_08_2015;

import java.util.Scanner;

/**
 * Write a program which asks the user to enter a string, and then counts the
 * upper case letters in the string.
 */

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// ask user to enter string
		System.out.print("Unsite string: ");
		String str = input.nextLine();

		int numOfUpperCaseLetters = countUpperCaseLetters(str);
		
		// print result
		System.out.println("The string has " + numOfUpperCaseLetters
				+ " upper case characters.");

		input.close();
	}
	
	/** Counts upper case letters */
	public static int countUpperCaseLetters(String str){
		int countUpperCaseLetters = 0;

		// counting upper case letters using ASCII 
		for (int i = 0; i < str.length(); i++) {
			if ((int) (str.charAt(i)) >= 65 && (int) (str.charAt(i)) <= 90) {
				countUpperCaseLetters++;
			}
		}
		
		return countUpperCaseLetters;
	}

}
