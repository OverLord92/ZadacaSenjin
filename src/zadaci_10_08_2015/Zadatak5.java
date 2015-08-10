package zadaci_10_08_2015;

import java.util.Scanner;

/**
 * A Latin square is an n-by-n array filled with n different Latin letters, each
 * occurring exactly once in each row and once in each column. Write a program
 * that prompts the user to enter the number n and the array of characters, as
 * shown in the sample output, and checks if the input array is a Latin square.
 * The characters are the first n characters starting from A.
 */

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// korisnik unosi dimenzije matrice
		System.out.print("Unesite dimenziju matrice: ");
		int dimenzija = input.nextInt();

		// matrica u koju smjestamo slova
		char[][] matrica = new char[dimenzija][dimenzija];

		// korisnik unosi slova
		System.out.println("Unesite 4 reda od po 4 slova: ");
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[0].length; j++) {
				// karakter unosimo kao prvi karakter unesenog stringa
				char karakter = input.next().charAt(0);
				// to upper case
				karakter = Character.toUpperCase(karakter);

				// provjeravamo da li je uneseni karakter van dozvoljenog
				// raspona
				if ((int) karakter < 65 || (int) karakter > 65 + dimenzija) {
					System.out
							.println("Pogresan unos. Morate unjeti slovo od A do "
									+ (char) (65 + dimenzija) + ".");
					// ukoliko jeste printamo poruku korisniku da je pogrijesio
					// i zatvaramo program
					System.exit(1);
				}
				// ako je uneseni karakter validan unosimo ga u matricu
				matrica[i][j] = karakter;
			}
		}

		// provjeravamo da li se svaki karakter ponavlja samo jednom u svakom redu i koloni
		// ako je taj sulov ispunjen matrica je latinska kocka
		boolean isLatinSqr = true;
		for (int i = 0; i < matrica.length; i++) {
			char currentChar = matrica[i][0];
			for (int j = 1; j < matrica[0].length; j++) {
				System.out.println(matrica[i][j] + "   " + currentChar);
				if ((int) matrica[i][j] == (int) currentChar) {
					isLatinSqr = false;
					break;
				}
			}
		}

		// printanje rezultata
		System.out.println(isLatinSqr ? "Unesena matrica je latinska kocka."
				: "Unesena matrica NIJE latinska kocka.");

		input.close();

	}

}
