package zadaci_03_08_2015;

import java.util.Scanner;

/**
 * Write a program which asks the user to enter an integer and print its binary notation.
 */

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// aks user to enter integer
		System.out.print("\n\tEnter Integer: ");
		int number = input.nextInt();
		
		// convert entered integer to binary string
		String result = decimalToBinary(number);
		
		// print result
		System.out.println("\n\tThe binary notation of the enterd number is: " + result + ".");

		input.close();

	}
	
	/** Convert decimal integer to binary String */
	public static String decimalToBinary(int number){
		
		String result = "";
		
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
