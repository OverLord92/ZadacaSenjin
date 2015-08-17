package zadaci_17_08_2015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * (Maximum element in ArrayList) Write the following method that returns the
 * maximum value in an ArrayList of integers. The method returns null if the
 * list is null or the list size is 0. public static Integer
 * max(ArrayList<Integer> list)
 */

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// arraylist u koji smjestamo brojeve
		ArrayList<Integer> list = new ArrayList<>();
		// korsinik unosi brojeve
		System.out.println("Unesite niz brojeva");
		int number = input.nextInt();
		// unos se prekida ukoliko korisnik unese 0
		while (number != 0) {
			list.add(number);
			number = input.nextInt();
		}

		System.out.println("Najveci unjeti broj je: " + max(list) + ".");

		input.close();

	}

	/** Metoda koja vraca najveci broj u nizu */
	public static Integer max(ArrayList<Integer> list) {

		// ako je lista null ili je duzina 0 metoda vraca 0
		if (list == null || list.size() == 0) {
			return 0;
		}

		// inace metoda vraca zadnji clan sortiranog niza
		Collections.sort(list);
		return list.get(list.size() - 1);
	}

}
