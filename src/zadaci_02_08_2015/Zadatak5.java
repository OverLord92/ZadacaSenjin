package zadaci_02_08_2015;

import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese cijeli broj te ispisuje
 * piramidu svih brojeva do tog broja. (Na primjer, ukoliko korisnik unese 7 vrh
 * piramide je broj 1, red ispod vrha piramide je 2 1 2, red ispod je 3 2 1 2 3,
 * red ispod 4 3 2 1 2 3 4 itd.)
 */

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// korisnik unosi dimenziju piramide
		System.out.print("Enter the dimension of the pyramid: ");
		int number = input.nextInt();

		// petlja za stampanje piramide
		for (int i = 1; i <= number; i++) {

			// pelja za printanje praznina " "
			for (int j = 1; i <= number - j; j++) {
				System.out.print("  ");
			}

			// petlja za stampanje lijeve strane piramide
			for (int k = 1; k < i; k++)
				System.out.print(k + " ");

			// pelja za stampanje desne strane piramide
			for (int l = i; l > 0; l--) {
				System.out.print(l + " ");
			}

			System.out.println();
		}

		input.close();
	}

}
