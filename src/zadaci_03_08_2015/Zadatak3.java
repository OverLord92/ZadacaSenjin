package zadaci_03_08_2015;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a program which asks the user to enter a letter and checks if the
 * letter is a vowel or a consonant.
 */

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// ask user to enter letter
		System.out.print("Enter letter: ");
		char c = input.next().charAt(0);
		
		// print result
		System.out.println(consonantOrVowel(c));

		input.close();
	}
	
	
	/** Checks if a character is a consonant or a vowel */
	public static String consonantOrVowel(char c){

		// the method is case insensitive
		c = Character.toUpperCase(c);
		
		String result = "The entered character is ";

		// array with vowels
		Character[] samoglasnici = { 'A', 'E', 'I', 'O', 'U' };

		// check if enters letter is a vowel
		if (Arrays.asList(samoglasnici).contains(c)) {
			result += "a vowel.";
			
			// if isnt vowel check if its consonant using ASCII
		} else if ((int) (c) >= 65 && (int) (c) <= 90) {
			result += "a consonant.";
			
			// the enters character is not a letter
		} else {
			result += "neither a vowel nor a consonant.";
		}
		
		return result;
	}

}
