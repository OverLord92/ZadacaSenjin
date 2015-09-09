package zadaci_02_08_2015;

import java.util.Scanner;

/**
 * Write a program that asks the user to enter his/her Social Security Number - SSN.
 * Napisati program koji pita korisnika da unese Social Security Number (SSN) u
 * formatu DDD-DD-DDDD gdje D predstavlja broj. Program treba da provjerava da
 * li je broj unesešen u ispravnom formatu. Ukoliko nije, program pita korisnika
 * da pokuša ponovo. Ukoliko jeste unešen u pravom formatu, program završava sa
 * radom.
 */

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// user enters SSN
		System.out.print("  Enter Social Security Number: ");
		String ssn = input.next();
		
		// checking the validity of the input using regular expression
		boolean validSnn = validFormat(ssn);		

		// if the user entered the wrong format the program enters the loop
		while(validSnn == false){
			
			System.out.print("\tInvalid input. Try again: ");
			ssn = input.next();
			validSnn = validFormat(ssn);
		}
		
		System.out.println("\tValid input.");

		input.close();
	}
	
	/** Checks if the user entered the right format */
	public static boolean validFormat(String ssn) {
		
		return ssn.matches("[\\d]{3}-[\\d]{2}-[\\d]{4}");
	}

}
