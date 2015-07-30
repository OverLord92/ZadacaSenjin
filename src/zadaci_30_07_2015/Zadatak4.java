package zadaci_30_07_2015;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese 3 cijela broja te mu ispiše ta
 * ista tri broja u rastućem redosljedu. Bonus: Napisati metodu koja prima tri
 * cijela broja kao argumente te vraća brojeve u rastućem redosljedu.
 */

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter tree integers: ");

		int num1 = input.nextInt(), 
				num2 = input.nextInt(), 
				num3 = input.nextInt();

		// niz u koji smjestamo sortirane brojeve
		int[] niz;

		niz = sort(num1, num2, num3);

		// printanje rezultata
		System.out.print("The sorted numbers are: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
		
		input.close();

	}

	/** Metoda koja argumente vraca u obliku sortiranog niza */
	public static int[] sort(int... args) {

		Arrays.sort(args);

		return args;

	}

}
