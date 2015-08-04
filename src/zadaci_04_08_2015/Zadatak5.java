package zadaci_04_08_2015;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * Napisati program koji učitava 10 brojeva te ispisuje koilko je jedinstvenih
 * brojeva unijeto te sve jedinstvene brojeve koji su unijeti, razmaknute jednim
 * spaceom. Ukoliko se neki broj pojavljuje više puta, broj treba ispisati samo
 * jednom.
 */

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// set u koje smjestamo brojeve
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		
		// korisnik unosi brojeve
		System.out.print("\n  Unesite 10 brojeva: ");
		
		// unosimo brojeve u set
		for(int i = 0; i < 10; i++){
			set.add(input.nextInt());
		}
		
		// printanje rezultata
		System.out.print("  Unjeto je " + set.size() + " jedinstvenih brojeva.\n");
		
		System.out.print("  Unjeti brojevi su: ");
		for(Integer i: set){
			System.out.print(i + " ");
		}
		
		input.close();
	}

}
