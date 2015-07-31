package zadaci_31_07_2015;

import java.util.Scanner;

/**
 * Napišite metodu sa sljedećim headerom koja vraća naopako ispisan broj koji
 * joj je proslijeđen kao argument: public static void reverse(int number). Na
 * primjer, reverse(3456) treba da vrati 6543. Napisati program koji pita
 * korisnika da unese neki cijeli broj te mu vrati isti ispisan naopako.
 */

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// korisnik unosi broj
		System.out.print("Enter e number to print it out in reverse: ");
		int number = input.nextInt();
		
		// printanje rezultata
		System.out.print("\nUneseni broj ispisan naopako: ");
		System.out.println(reverse(number) + ".");

		input.close();
		
	}
	
	
	// u zadatku pise da metoda treba biti void, ali u  daljnem tekstu
	// zadatka pise da metoda vraca broj pa sam za retuntn type stavio int
	
	/** Metoda koja vraca broj naopako ispisan */
	public static int reverse(int number){
		
		// string u koji smijestamo proslijedjeni broj
		String numStr = number + "";
		
		// string u koji smijestamo broj ispisan naopako
	    String revNumStr = "";
	    
	    for(int i = numStr.length() - 1; i >= 0; i--){
	    	revNumStr += numStr.charAt(i);
	    }
	    
	    return Integer.parseInt(revNumStr);
	}

}
