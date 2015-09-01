package zadaci_01_09_2015;

import java.util.Scanner;

/**
 * *18.2 (Fibonacci numbers) Rewrite the fib method in Listing 18.2 using
 * iterations.
 */

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int f0 = 0; // nulti clan niza
		int f1 = 1; // prvi clan niza

		// korisnik unosi index broja kojeg zeli racunati
		System.out.print("Unesite broj: ");
		int n = input.nextInt();
		input.close();

		// pocetna vrijednost fibonacijevog broja
		int currentFib = 0;

		// racunanje fibonacijevog broja na n-tom indexu
		for (int i = 2; i <= n; i++) {
			// sabiramo dva prethodna clana niza
			currentFib = f0 + f1;
			// dodjveljivanje seljedeceg para vrijednosti za racunanje
			f0 = f1;
			f1 = currentFib;

		}

		// printanje rezultata
		System.out.println("fib(" + n + ") je " + currentFib);

	}

}
