package zadaci_24_07_2015;

/**
 * Napisati program koji simulira nasumično izvlačenje karte iz špila od 52 karte. 
 * Program treba ispisati koja karta je izvučena (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J,
 *  Q ili K) te znak u kojem je data karta (Srce, Pik, Djetelina, Kocka). Primjer: 
 *  Karta koju ste izvukli je 10 u znaku kocke. 
 */

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ovaj dio služi da program ispiše kartu tek
		// poslije pritiska entera
		Scanner input = new Scanner(System.in);
		System.out.println("Press enter to draw a card.");
		input.nextLine();

		// niz sa vrijednostima karata (zbog 10ke ne moze char)
		String[] value = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J", "Q", "K" };

		// niz sa znakovima
		String[] sign = { "srca", "pika", "djeteline", "kocke" };

		// printanje rezultata
		System.out.print("Karta koju ste izvukli je ");
		System.out.print(value[(int) (Math.random() * 13)]);
		System.out.print(" u znaku ");
		System.out.println(sign[(int) (Math.random() * 4)] + ".");

		input.close();
	}

}
