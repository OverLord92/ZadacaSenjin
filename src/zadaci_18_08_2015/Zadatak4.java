package zadaci_18_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * *11.13 (Remove duplicates) Write a method that removes the duplicate elements
 * from an array list of integers using the following header: public static void
 * removeDuplicate(ArrayList<Integer> list)
 */

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// korisnik unosi brojrve u listu
		ArrayList<Integer> list = new ArrayList<>();
		System.out.print("Unesite 10 cijelih brojeva: ");
		for (int i = 0; i < 10; i++)
			list.add(input.nextInt());

		// pozivanje metode
		removeDuplicate(list);

		// printanje rezultata
		for (Integer i : list)
			System.out.print(i + " ");

		input.close();
	}

	/** Metoda koja uklanje duplikate iz liste */
	public static void removeDuplicate(ArrayList<Integer> list) {

		// kreiramo novu listu sa istim sadrzajem kao list
		ArrayList<Integer> temp = new ArrayList<>(list);

		// brisemo sadrzaj u listi list
		list.clear();

		// zatim u listu list vracamo samo brojeve koji se ne ponavljaju
		int count;
		int currentElement;
		for (int i = 0; i < temp.size(); i++) {
			currentElement = temp.get(i);
			count = 0;
			// provjeravamo da li se od i - 1 do 0 ponavlja broj i
			// ako se ne ponavlja ubacujemo ga u listu
			for (int k = i - 1; k >= 0; k--) {
				if (temp.get(k) == currentElement)
					count++;
			}

			if (count == 0)
				list.add(currentElement);

		}

	}

}
