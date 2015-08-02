package zadaci_02_08_2015;

import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese neki string te mu ispisuje
 * dužinu tog stringa kao i prvo slovo stringa.
 */

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// korisnik unosi string
		System.out.println("Unesite string: ");
		String str = input.nextLine();

		// printanje rezultata
		System.out.println("Duzins stringa je " + str.length()
				+ " a prvo slovo je " + str.charAt(0));
		
		input.close();

	}

}
