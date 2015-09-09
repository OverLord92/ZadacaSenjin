package zadaci_02_08_2015;

import java.util.Scanner;

/**
 * Write a program that asks the user to enter a three digit number and check if
 * the entered number is a palindrome.
 */

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// user enter a three digit number
		System.out.print("Ente a three digit integer: ");
		String number = input.next();
		
		// check if entered string is a number
		if(!isNumber(number)){
			System.out.println("Wrong input. Integer expected.");
			System.exit(1);
		}

		// print result
		System.out.println("The number "
				+ (isPalindrome(number) ? "is a palindrome."
						: " is not a palindrome."));

		input.close();
	}
	
	/** Checks if a string consists of only digits */
	public static boolean isNumber(String number){
		
		for(int currentChar = 0; currentChar < number.length(); currentChar++)
			if(!Character	.isDigit(number.charAt(currentChar)))
				return false;
		
		return true;
	}
	

	/** Checks if the number is a palindrome. Works only with tree digit numbers */
	public static boolean isPalindrome(String number) {
		return number.charAt(0) == number.charAt(2);
	}

}
