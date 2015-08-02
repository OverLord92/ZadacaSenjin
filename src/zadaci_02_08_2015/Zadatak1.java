package zadaci_02_08_2015;

import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese cijeli trocifreni broj te
 * provjerava da li je unijeti broj palindrom. Broj je palindrom ukoliko se čita
 * isto i sa lijeva na desno i sa desna na lijevo npr. 121, 131, itd.
 */

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// korisnik unosi broj
		System.out.print("Unsite trocifreni broj: ");
		// smjestamo broj kao string
		String number = input.next();
		
		// printanje rezultata
		if(number.charAt(0) == number.charAt(2))
			System.out.println("The number is a palindrome.");
		else
			System.out.println("The number is not a palindrome.");
		
		input.close();
	}

}
