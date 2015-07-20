package zadaci_20_07_2015;

import java.util.Scanner;

public class Zadatak3 {

	/**
	 * Napisati metodu koja prima dva cijela broja kao argumente te vraća
	 * najveći zajednički djelilac za ta dva broja.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Unesite prvi broj:");
		int num1 = input.nextInt();
		System.out.print("Unesite drugi broj broj:");
		int num2 = input.nextInt();

		System.out.print("Najveći zajednički djelilac za brojeve " + num1
				+ " i " + num2 + " je ");
		System.out.println(gcd(num1, num2) + ".");
		input.close();
	}

	/** Metoda koja vraca najveci zajednicki sadrzalac */
	public static int gcd(int num1, int num2) {
		if (num1 == num2) {
			return num1;
			// ukoliko je num2 veci od num1 mijenjamo vrijednosti
		} else if (num2 > num1) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		int gcd = 1;
		// za brojeve od 2 do manjeg od dva broja provjeravamo da li su
		// zajednicki dijelilac i updejtujemo ga
		for (int i = 2; i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}

		return gcd;
	}

}
