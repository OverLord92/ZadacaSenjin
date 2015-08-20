package zadaci_20_08_2015;

import java.util.Scanner;

/**
 * *12.3 (ArrayIndexOutOfBoundsException) Write a program that meets the
 * following requirements: * Creates an array with 100 randomly chosen integers.
 * * Prompts the user to enter the index of the array, then displays the
 * corresponding element value. If the specified index is out of bounds, display
 * the message Out of Bounds.
 */

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			// kreiramo niz
			int[] niz = new int[100];

			// inicijalizacija niza
			for (int i = 0; i < niz.length; i++)
				niz[i] = (int) (Math.random() * 10);

			// promptanje korisnika da unese index
			System.out.print("Unesite index: ");
			int index = input.nextInt();
			
			input.close();

			// ukoliko je index van granica niz program baca
			// IndexOutOfBoundException
			if (index < 0 || index >= niz.length)
				throw new IndexOutOfBoundsException();
			
			// hvatamo exception i ispisujemo poruku u konzolu
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Out of Bounds.");
		}
		
	}

}
