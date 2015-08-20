package zadaci_20_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * **11.17 (Algebra: perfect square) Write a program that prompts the user to
 * enter an integer m and find the smallest integer n such that m * n is a
 * perfect square. (Hint: Store all smallest factors of m into an array list. n
 * is the product of the factors that appear an odd number of times in the array
 * list. For example, consider m = 90, store the factors 2, 3, 3, 5 in an array
 * list. 2 and 5 appear an odd number of times in the array list. So, n is 10.)
 */

public class Zadatak2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// korisnik unosi integer
		System.out.print("Unesite cijeli broj m: ");
		int m = input.nextInt();
		
		input.close();

		// lista u koju smjestamo faktore broja m
		ArrayList<Integer> faktoriM = new ArrayList<>();
		// koristimo metodu prostiFaktori kako bi dodali faktore broja m
		// u listu faktoriM
		prostiFaktori(m, faktoriM);

		// pocetna vrijednost broja n je 1
		int n = 1;

		// arraylista u koju smjestamo faktre koji se ponavljaju neparan broj
		// puta
		ArrayList<Integer> appearedOddTime = new ArrayList<Integer>();

		// provjeravamo da li se faktor pojavljuje neparan broj puta
		for (int i = 0; i < faktoriM.size(); i++) {
			int counter = 0;
			for (int j = 0; j < faktoriM.size(); j++) {
				if (faktoriM.get(i) == faktoriM.get(j))
					counter++;
			}

			// ako se faktor pojavljuje neparan broj puta i ako se ne nalazi u
			// lisi apeearedOddTime ubacujemo ga u listu
			if (counter % 2 == 1 && !appearedOddTime.contains(faktoriM.get(i)))
				appearedOddTime.add(faktoriM.get(i));
		}

		// mnozimo sve n sa svim faktorima iz appearedOddTime
		for (Integer i : appearedOddTime) {
			n *= i;
		}
		
		// printanje rezultata
		System.out.println("Najmanji broj n kako bi m * n bilo savrseni kvadrat je " + n);
		System.out.println("m * n je " + (m * n));
		

	}

	/**
	 * Metoda kojoj prosljedjujemo integer koji zelimo rastaviti na faktore i
	 * listu u koju zelimo smjestiti faktore integera
	 */
	public static void prostiFaktori(int num, ArrayList<Integer> list) {
		// problem rjesavamo pomocu rekurzije

		// base case
		if (num == 1)
			return;
		else {
			int counter = 2;
			while (!(num % counter == 0)) {
				counter++;
			}
			list.add(counter);
			prostiFaktori(num / counter, list);
		}

	}
}
