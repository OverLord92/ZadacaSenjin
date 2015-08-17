package zadaci_17_08_2015;

import java.util.ArrayList;


/**
 * 11.7 (Shuffle ArrayList) Write the following method that shuffles the
 * elements in an ArrayList of integers. public static void
 * shuffle(ArrayList<Integer> list)
 */

public class Zadatak5 {

	public static void main(String[] args) {
		
		// kreiranje arrayliste i dodavanje clanova
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(101);
		list.add(2);
		list.add(404);
		list.add(7);
		shuffle(list);
		
		// printanje rezultata
		for(Integer i: list)
			System.out.print(i + " ");

	}
	
	/** Metoda koja mjesa arraylistu */
	public static void shuffle(ArrayList<Integer> list){
		
		for(int i = 0; i < list.size() - 1; i++){
			// generisemo radnom broj od 0 do size() - 1
			int random = (int)(Math.random() * list.size());
			// mjenjamo integer na i poziciji za integerom na
			// random poziciji
			Integer temp = list.get(i);
			list.set(i, list.get(random));
			list.set(random, temp);
					
		}
	}

}
