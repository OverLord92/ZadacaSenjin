package zadaci_21_07_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Napisati metodu koja prima jedan argument, broj pitanja, te generiše toliko
 * nasumičnih, jednostavnih pitanja oduzimanja tipa : „Koliko je 5 - 2 ?“.
 * Metoda treba da broji broj tačnih i netačnih odgovora te ih ispiše korisniku
 */

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of questions: ");
		subtractionTest(input.nextInt());
		input.close();
	}

	/** Metoda koja je zadana u zadatku */
	public static void subtractionTest(int questions) {
		Scanner input = new Scanner(System.in);
		int right = 0;
		int wrong = 0;
		int num1, num2;

		// postavljamo pitanje question puta
		for (int i = 0; i < questions; i++) {
			// generišemo dva nasumicna broja od 1 do 9
			num1 = (int) (1 + Math.random() * 9);
			num2 = (int) (1 + Math.random() * 9);

			// ako je num2 veci od num1 mijenjamo vrijednosti
			if (num2 > num1) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}

			System.out.print(num1 + " - " + num2 + " = ");
			int guess = 0;
			try {
				guess = input.nextInt();
				// hvatamo exception ukoliko korisnik ne unese integer
			} catch (InputMismatchException e) {
				input.next();
				guess = tryAgain();
			}
			if (guess == num1 - num2) {
				System.out.print("Correct answer.\n");
				right++;
			} else {
				System.out.print("Wrong Answer.\n");
				wrong++;
			}
		}
		input.close();
		System.out.println("\n\nThe number of right answer is: " + right);
		System.out.println("The number of wrong answer is: " + wrong);
	}

	/**
	 * Metoda koja se poziva ukoliko dođe do inputmismatchException-a, koja
	 * omogućava korisniku da ponovo unese vrijednost
	 */
	public static int tryAgain() {
		Scanner input = new Scanner(System.in);
		System.out
				.println("Wrong input, you have to enter an integer. Try again: ");
		return input.nextInt();
	}

}
