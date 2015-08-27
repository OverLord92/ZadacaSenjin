package zadaci_27_08_2015;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 13.19 (Convert decimals to fractions) Write a program that prompts the user
 * to enter a decimal number and displays the number in a fraction. Hint: read
 * the decimal number as a string, extract the integer part and fractional part
 * from the string, and use the BigInteger implementation of the Rational class
 * in Programming Exercise 13.15 to obtain a rational number for the decimal
 * number.
 */

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// korisnik unosi broj
		System.out.print("Unesite decimalni broj: ");
		String number = input.next();

		input.close();

		// unos korisnika splitujemo tako da ce parts[0] biti cijeli dio broja a
		// parts[1] ce biti dio iza zareza
		String[] parts = number.split("[,.]");

		// duzina broja iza decimalnog zareza
		int duzina = parts[1].length();

		// razlomak sa cijelim dijelom broja
		BigRational leftPart = new BigRational(new BigInteger(parts[0]),
				BigInteger.ONE);
		
		// pretvaranje dijela broja iza zareza u razlomak
		BigRational rigthPart = new BigRational(new BigInteger(parts[1]),
				BigInteger.TEN.pow(duzina));

		// zbir lijeve strane razlomka i desne strane razlomka
		BigRational result = leftPart.add(rigthPart);

		// printanje rezultata
		System.out.println(result);
		
	}

}
