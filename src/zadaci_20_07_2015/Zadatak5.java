package zadaci_20_07_2015;

import java.util.Scanner;

public class Zadatak5 {

	/**
	 * Napisati program koji učitava niz brojeva, pronalazi najveći broj te
	 * ispisruje koliko se puta taj broj ponavlja. Pretpostavimo da se unos
	 * brojeva završava sa nulom.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int num;
		int maxValue = 0;
		int numberOfMax = 0;

		do {
			System.out.print("Enter number: ");
			num = input.nextInt();
			// ako je num u trenutnoj iteraciji veci od maxValue vracamo brojac
			// na 1 i num postaje najveci broj
			if (num > maxValue) {
				maxValue = num;
				numberOfMax = 1;
			// ukoliko je num jednak maxValue povecavamo brojac za jedan
			} else if (num == maxValue) {
				numberOfMax++;
			}
		} while (num != 0);

		System.out.println(maxValue + " " + numberOfMax);
	}
}
