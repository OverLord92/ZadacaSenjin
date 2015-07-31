package zadaci_31_07_2015;

import java.util.Scanner;

/**
 * (Izračunavanje napojnice) Napisati program koji učitava ukupan iznos računa
 * koji treba uplatiti kao i procenat tog računa kojeg želimo platiti kao
 * napojnicu te izračunava ukupan račun i napojnicu. Na primjer, ukoliko korisnik
 * unese 10 kao račun i 15 % kao procenat za napojnicu program treba da ispiše da
 * je ukupan račun za uplatiti 11.5 a napojnica 1.5.
 */

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double racun, procenat, napojnica, ukupno;
		
		// korisnik unosi racun i procenat napojnice
		System.out.print("Unesite ukupan iznos racuna: ");
		racun = input.nextDouble();
		
		System.out.print("Unesite procenat napojnice: ");
		procenat = input.nextDouble();
		
		// racunanje napojnice i ukupnog racuna
		napojnica = racun * (procenat / 100);
		ukupno = racun + napojnica;
		
		// printanje rezultata
		System.out.printf("Ukupan racun za platiti je %.2f a napojnica je %.2f.", ukupno, napojnica);
		
		input.close();

	}

}
