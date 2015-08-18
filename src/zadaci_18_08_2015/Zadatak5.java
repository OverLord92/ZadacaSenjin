package zadaci_18_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * (Combine two lists) Write a method that returns the union of two array lists
 * of integers using the following header: public static ArrayList<Integer>
 * union( ArrayList<Integer> list1, ArrayList<Integer> list2)
 */

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// korisnik unosi clanove prve liste
		System.out.print("Unesite 5 brojeva u list1: ");
		ArrayList<Integer> list1 = new ArrayList<>();
		for(int i = 0; i < 5; i++)
			list1.add(input.nextInt());
		
		// korisnik unosi clanove druge liste
		System.out.print("Unesite 5 brojeva u list2: ");
		ArrayList<Integer> list2 = new ArrayList<>();
		for(int i = 0; i < 5; i++)
			list2.add(input.nextInt());
		
		// pozivanje metode
		ArrayList<Integer> union = union(list1, list2);
		
		// printanje rezultata
		System.out.print("Unija list1 i list2 je: ");
		for(Integer i: union)
			System.out.print(i + " ");
		
		input.close();
	}

	/** Metoda koja vraca uniju dvije liste */
	public static ArrayList<Integer> union(ArrayList<Integer> list1,
			ArrayList<Integer> list2) {
		
		// kreiramo listu sa sadrzajem prve liste
		ArrayList<Integer> union = new ArrayList<>(list1);

		// dodamo clanove druge liste
		union.addAll(list2);

		// i vracamo uniju obe liste
		return union;
	}
}
