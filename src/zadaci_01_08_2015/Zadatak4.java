package zadaci_01_08_2015;

import java.util.Scanner;

/**
 * Write a program that sums the digits of an integer. 
 * Method header:
 * public static int sumDigits(long n)
 */

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		// User enter number
		System.out.print("Enter a number to sum its digits: ");
		
		int userInput = input.nextInt();
		int sumOfDigits = sumDigits(userInput);
		
		// print result
		System.out.println("The sum of digits of number " + userInput + " is: " + sumOfDigits + ".");
		
		input.close();
	}
	
	/** Sums the digits of an integer */
	public static int sumDigits(long n){
		
		int sumOfDigits = 0;
		int currentDigit;
		
		// parse the interer into a string
		String number = n + "";
		
		// add the value of the digits to the sumw
		for(int i = 0; i < number.length(); i++){
			
			// ASCII representation for the digits from 0 to 9 is 48 to 57
			// ASCII representation - 48 = actual digit;
			currentDigit = (int)(number.charAt(i)) - 48;
			sumOfDigits += currentDigit;
		}
		
		return sumOfDigits;
	}


}
