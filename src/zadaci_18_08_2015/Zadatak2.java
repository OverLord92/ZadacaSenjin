package zadaci_18_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * (Sort ArrayList) Write the following method that sorts an ArrayList of
 * numbers: 
 * public static void sort(ArrayList<Integer> list)
 */

public class Zadatak2 {

	/** Test Program */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.print("Unesite 5 brojeva: ");
		for(int i = 0; i < 5; i++)
			list.add(input.nextInt());
		
		// sortiranje liste koristenjem sort metode
		sort(list);
		
		// printanje rezultata
		System.out.println(list.toString());
		
		input.close();
	}
	
	/** Metoda koja sortira array list  */
	public static void sort(ArrayList<Integer> list){
		
		// koristimo isertion sort
		
		int currentElement;
		int k;
		for(int i = 1; i < list.size(); i++){
			currentElement = list.get(i);
			for(k = i - 1; k >= 0 && list.get(k) > currentElement; k--)
				list.set(k + 1, list.get(k));
					
			list.set(k + 1, currentElement);
		}
		
	}

}
