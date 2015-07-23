package zadaci_23_07_2015;

import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese prvih 9 brojeva te ispiše
 * desetocifreni ISBN-10 broj. (Primjer: ukoliko unesemo, kao prvih 9 brojeva,
 * 013601267 program nam ispisuje 0136012671 kao ISBN-10 broj. Ukoliko unesemo
 * 013031997 kao prvih 9 brojeva, program nam ispisuje 013031997X kao ISBN-10
 * broj)
 */

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String isbn = "";
		do {
			System.out.println("Enter ISBN number:");
			isbn = input.next();
			if (validIsbn(isbn)) {
				getIsbn(isbn);
			} else {
				System.out
						.println("Invalid ISBN number. The isbn must consist of 9 digits.");
				System.out.println("Try again.\n\n");
			}
		
		//petlja se vrti sve dok se ne unese validan broj	
		} while (!validIsbn(isbn));
		
		input.close();

	}
	
	/** Metoda koja za vraca cijeli ISBN-10 */
	public static String getIsbn(String isbn) {

		int result = 0;
		
		// petlja koja racuna izraz:
		// d1*1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9
		for (int i = 0; i < isbn.length(); i++) {
			String currentChar = isbn.charAt(i) + "";
			result += Integer.parseInt(currentChar) * (i + 1);
		}

		result = result % 11;

		if (result == 10) {
			isbn += "X";
		} else {
			isbn += result;
		}
		System.out.print("The ISBN-10 number is: ");
		System.out.println(isbn);
		return isbn;
	}

	/** Metoda koja provjerava da li je uneseni broj validan*/
	public static boolean validIsbn(String isbn) {
		if (isbn.length() != 9)
			return false;
		for (int i = 0; i < 9; i++) {
			char isbnChar = isbn.charAt(i);
			if (!Character.isDigit(isbnChar)) {
				return false;
			}
		}
		return true;
	}

}
