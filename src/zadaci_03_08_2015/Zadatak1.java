package zadaci_03_08_2015;

import java.util.Scanner;

/**
 * Write a program which asks the user to enter a string, and prints the string
 * in reverse.
 */

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// ask user to enter string
		System.out
				.print("Enter a string to print it i nreverse: ");
		String str = input.nextLine();

		String result = reverseString(str);
		
		// print result
		System.out.println("\n  The result string:\n   " + result);

		input.close();
	}
	
	/** Returns the reversed string str */
	public static String reverseString(String str){
		
		String result = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		
		return result;
	}

}
