package zadaci_20_07_2015;

import java.util.ArrayList;
import java.util.Collections;

public class Zadatak1 {

	/**
	 * Napisati metodu koja vraća najveću vrijednosti u ArrayListu
	 * Integera. Metoda vraća null ukoliko je lista null iil ukoliko lista
	 * sadrži 0 elemenata.
	 */
	
	
	/** Metoda za testiranje rada max metode */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(3);
		lista.add(8);
		lista.add(1);
		lista.add(7);

		System.out.println(max(lista));

	}
	
	/** Metoda koja vraca najveci integer u ArrayListi */
	public static Integer max(ArrayList<Integer> list) {
		// Ukoliko je lista prazna ili jednaka null metoda vraća null
		if (list == null || list.size() == 0) {
			return null;
		} else {
			// Sortiramo ArrayList i vracamo zadnji (najveci) clan
			Collections.sort(list);
			return list.get(list.size() - 1);
		}
	}

}
