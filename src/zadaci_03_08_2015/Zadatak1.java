package zadaci_03_08_2015;

import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese neki string te mu vraća taj
 * isti string naopako.
 */

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str, result = "";
		
		// korisnik unosi string
		System.out.print("String koji unesete ce biti ispisan naopako.\nUnesite string: ");
		str = input.nextLine();
		
		// obrtanje karaktera unesenog stringa
		for(int i = str.length() - 1; i >= 0; i--){
		result += str.charAt(i);	
		}
		
		// printanje rezultata
		System.out.println("\n  The result string:\n   " + result);
		
		input.close();
	}

}
