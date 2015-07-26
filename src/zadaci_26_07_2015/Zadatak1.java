package zadaci_26_07_2015;

import java.util.Scanner;

/**
 * Napisati program koji ispisuje tri nasumična cijela broja te pita korisnika
 * da unese njihov zbir. Ukoliko korisnik pogriješi, program ispisuje pitanje
 * ponovo sve sa porukom da pokuša ponovo. Ukoliko korisnik unese tačan odgovor,
 * program mu čestita i završava sa radom.
 */

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int num1, num2, num3, result, guess;

		// generisanje nasumicnih sabiraka
		num1 = (int) (1 + Math.random() * 9);
		num2 = (int) (1 + Math.random() * 9);
		num3 = (int) (1 + Math.random() * 9);

		// racunanje rezultata
		result = num1 + num2 + num3;

		System.out.print(num1 + " + " + num2 + " + " + num3 + " = ");
		guess = input.nextInt();

		// ako odgovor nije tacan ulazimo u petljnu koja se ponavlja
		// sve dok korisnik ne unese pravi odgovor 
		if (guess == result) {
			System.out.println("Correct answer.");
		} else {

			do {
				System.out.println("Wrong answer.\n\nTryAgain: ");
				System.out.print(num1 + " + " + num2 + " + " + num3 + " = ");
				
				guess = input.nextInt();
			} while (guess != result);
			
			System.out.println("Correct answer.");
		}
		input.close();

	}

}
