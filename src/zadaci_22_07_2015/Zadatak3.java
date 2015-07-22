package zadaci_22_07_2015;

import java.util.Scanner;

/**
 * Nizovi niz1 i niz2 su striktno identični ukoliko su svi njihovi elementi na
 * istim pozicijama jednaki. Napisati metodu koja vraća true ukoliko su nizovi
 * niz1 i niz2 striktno identični. Koristiti sljedeći header:
 * 
 * public static boolean equals(int[ ] niz1, int[ ] niz2)
 * 
 * Napisati testni program koji pita korisnika da unese dva niza cijelih brojeva
 * te provjerava da li su striktno identični
 */

public class Zadatak3 {
    /** Nije potrebno definisati duzinu niza prije unosa elemenata*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		String nizString = "";
		System.out.print("Enter the first array: ");
		//niz brojeva koje korisnik unosi smjestamo u String
		nizString += input.nextLine();

		//splitujemo string u niz Stringova
		String[] niz = nizString.split(" ");
		
		//zatim parsiramo clanove string niza u int niz
		int[] niz1 = new int[niz.length];

		for (int i = 0; i < niz.length; i++) {
			niz1[i] = Integer.parseInt(niz[i]);
		}
		

		//proces unosa se ponavlja i za drugi niz
		nizString = "";
		System.out.print("Enter the second array: ");
		nizString += input.nextLine();

		niz = nizString.split(" ");
		int[] niz2 = new int[niz.length];

		for (int i = 0; i < niz.length; i++) {
			niz2[i] = Integer.parseInt(niz[i]);
		}

		
		//printamo rezultat
		System.out.println(equals(niz1, niz2) ? "The arrays are identical."
				: "The arrays are not identical");
		input.close();

	}

	/** MEtoda koja provjerava da li su nizovi identicni */
	public static boolean equals(int[] niz1, int[] niz2) {
		//ako nizovi nisu iste duzine ne mogu biti identicni
		if (niz1.length != niz2.length) 
			return false;
		else {
			for (int i = 0; i < niz1.length; i++) {
				if (niz1[i] != niz2[i])
					return false;
			}
		}
		return true;
	}

}
