package zadaci_25_07_2015;

/** Napisati metode sa sljedećim headerima: public static int reverse(int number) 
 * i public static boolean isPalindrome(int number). Prva metoda prima cijeli broj 
 * kao argument i vraća isti ispisan naopako. (npr. reverse(456) vraća 654.) 
 * Druga metoda vraća true ukoliko je broj palindrom a false ukoliko nije. 
 * Koristite reverse metodu da implementirate isPalindrome metodu. Napišite program
 * koji pita korisnika da unese broj te mu vrati da li je broj palindrome ili ne. */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = 0;
		try {
			System.out.println("Enter a number to check if its a palindrome: ");
			number = input.nextInt();
			System.out
					.println(isPalindrome(number) ? "The entered number is a palindrome."
							: "The entered number is not a palindrome");
		} catch (InputMismatchException e) {
			System.out
					.println("In order for the program to run properly, you need to enter an integer.");
			System.out.println("Restart and try again.");
		}
		input.close();

	}

	public static int reverse(int number) {
		String num = number + "";
		String result = "";

		for (int i = num.length() - 1; i >= 0; i--) {
			result += num.charAt(i);
		}

		return Integer.parseInt(result);
	}

	public static boolean isPalindrome(int number) {
		if (number == reverse(number))
			return true;
		else
			return false;
	}

}
