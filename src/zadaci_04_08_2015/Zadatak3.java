package zadaci_04_08_2015;

import java.util.Scanner;

/**
 * Write a program which asks the user to enter a short integer and writes all
 * 16 bits fo the entered integer.
 */

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// ask user to enter number
		System.out.print("\nEnter number: ");
		short number = input.nextShort();

		// convert integer into binary string
		String binaryNum = decimalToBinary(number);

		// printanje rezultata
		System.out.println("All 16 bits of this short integer are: " + format(binaryNum, 16));

		input.close();

	}

	/** Prints a number in desired length */
	public static String format(String binaryNum, int length) {

		String result = "";

		// concat zeros to result
		for (int i = 0; i < length - binaryNum.length(); i++) {
			result += "0";
		}

		// concat binary number to result
		result += binaryNum;

		return result;
	}

	/** Convert decimal integer to binary String */
	public static String decimalToBinary(int number){
		
		String result = "";
		
		// calculating the binary number from right to left
		while(number > 0){
			if(number % 2 == 1)
				result = 1 + result;
			else
				result = 0 + result;;
			
			number /= 2;
		}
		return result;
	}

}
