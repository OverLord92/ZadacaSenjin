package zadaci_27_07_2015;

/** 
 * Napisati program koji pita korisnika da unese cijeli broj za današnji 
 * dan u sedmici (0 za ponedjeljak, 1 za utorak...) i da unese broj dana 
 * nakon današnjeg dana te mu ispiše koji je to dan u budućnosti. 
 * (Primjer: ako korisnik unese 1 kao današnji dan a 3 kao dan u budućnosti
 *  program mu ispisuje da je danas utorak a dan u budućnosti je petak.) 
 */

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int startDay, futureDay, daysPassed;

		// niz sa imenima dana
		String[] days = { "ponedjeljak", "utorak", "srijeda", "četvrtak",
				"petak", "subota", "nedjelja" };

		// korisnik unosi podatke
		System.out.print("Unesite broj (0 - 6) za današnji dan: ");
		startDay = input.nextInt();

		System.out.print("Unesite broj dana koji ce proci: ");
		daysPassed = input.nextInt();

		futureDay = (startDay + daysPassed) % 7;

		// printanje rezultata
		System.out.print("Danas je " + days[startDay]
				+ " a dan u buducnosti je " + days[futureDay] + ".");
		input.close();
	}

}
