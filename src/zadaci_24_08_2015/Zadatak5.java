package zadaci_24_08_2015;

import java.util.ArrayList;

/**
 * *13.3 (Sort ArrayList) Write the following method that sorts an ArrayList of
 * numbers. public static void sort(ArrayList<Number> list)
 */

public class Zadatak5 {

	public static void main(String[] args) {

		// kreiranje i punjenje liste
		ArrayList<Number> list = new ArrayList<>();
		list.add(2);
		list.add(1);
		list.add(8);
		list.add(11);
		list.add(12);
		list.add(64);
		list.add(54);

		// printanje liste prije sortiranja
		System.out.print("Lista prije   sortiranja: ");
		for (Number num : list)
			System.out.print(num + " ");

		sort(list);

		// printanje liste poslije sortiranja
		System.out.print("\nLista poslije sortiranja: ");
		for (Number num : list)
			System.out.print(num + " ");

	}

	/**
	 * Metoda koja sortira listu sa Number objektima. Ova metoda je helper metoda
	 * i njena funkcija je da pozove mergeSort metodu.
	 */
	public static void sort(ArrayList<Number> list) {
		mergeSort(list);
	}

	/** Metoda koja sortira listu koristeci merge sort */
	public static void mergeSort(ArrayList<Number> list) {
		
		// base case je list.size() == 1
		
		if (list.size() > 1) {

			int firstHalfLength = list.size() / 2;
			ArrayList<Number> firstHalf = new ArrayList<>();
			for (int i = 0; i < firstHalfLength; i++)
				firstHalf.add(list.get(i));
			mergeSort(firstHalf);

			ArrayList<Number> secondHalf = new ArrayList<>();
			for (int i = firstHalfLength; i < list.size(); i++)
				secondHalf.add(list.get(i));
			mergeSort(secondHalf);

			merge(firstHalf, secondHalf, list);
		}
	}

	/** Metoda koja spaja dva sortirana manja niza u sortirani niz */
	public static void merge(ArrayList<Number> list1, ArrayList<Number> list2,
			ArrayList<Number> temp) {
		int counter1 = 0;
		int counter2 = 0;
		int counterTemp = 0;

		//  U rastucem redoslijedu ubacujemo elemente iz list1 i list2 u temp listu
		// sve dok se jedna od manjih lista ne isprazni
		while (counter1 < list1.size() && counter2 < list2.size()) {

			if (list1.get(counter1).doubleValue() < list2.get(counter2)
					.doubleValue()) {
				temp.set(counterTemp++, list1.get(counter1++));
			} else {
				temp.set(counterTemp++, list2.get(counter2++));
			}
		}

		// ubacivanje preostalih elemenata u niz temp
		while (counter1 < list1.size()) {
			temp.set(counterTemp++, list1.get(counter1++));
		}

		while (counter2 < list2.size()) {
			temp.set(counterTemp++, list2.get(counter2++));
		}

	}
}
