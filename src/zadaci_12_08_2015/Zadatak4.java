package zadaci_12_08_2015;

import java.util.Scanner;
import java.util.Stack;

/**
 * Write a program that prompts the user to enter a positive integer and
 * displays all its smallest factors in decreasing order. For example, if the
 * integer is 120, the smallest factors are displayed as 5, 3, 2, 2, 2. Use the
 * StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and retrieve
 * and display them in reverse order.
 */

public class Zadatak4 {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// promptamo korisnika da unese broj
		System.out.println("Unesite broj kako bi ispisali njegove proste faktore: ");
		Integer number = input.nextInt();
		
		// stek u koji smjestamo faktore
		Stack<Integer> prostiFaktori = new Stack<>();
		
		// pozivanje metode koja dodaje faktore u stek
		prostiFaktori(number, prostiFaktori);
		
		// printanje rezultata
		System.out.println("Prosti faktori su:");
		for(Integer faktor: prostiFaktori){
		System.out.print(faktor + " ");
		}
		
		input.close();
		
	}
	
	/** Rekurzivna metoda koja dodaje proste faktore u stek */
	public static void prostiFaktori(int broj, Stack<Integer> stek) {
		// base case
		if (broj == 1);
		else {
			int najmanjiFaktor = najmanjiFaktor(broj);
			// dodajemo najmanji faktor u stek
			stek.add(najmanjiFaktor);
			// djelimo broj sa najmanji faktorom
			broj /= najmanjiFaktor;
			// rekurzija
			prostiFaktori(broj, stek);
		}
	}
	
	/** Metoda za izracunavanje najmanjeg faktora broja */
	private static int najmanjiFaktor(int broj) {
		int najmanjiFaktor = 1;
		do {
			najmanjiFaktor++;
		} while (broj % najmanjiFaktor != 0);
		return najmanjiFaktor;
	}
	

}
