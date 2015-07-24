package zadaci_24_07_2015;

import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese 2 stringa te ispisuje najveći
 * zajednički prefix za ta dva stringa, ukoliko isti postoji. Na primjer,
 * ukoliko korisnik unese sljedeća dva stringa "Dobrodošli u Dubai" i
 * "Dobrodošli u Vankuver" program treba da ispiše: Najveći zajednički prefix za
 * dva stringa je "Dobrodošli u".
 * 
 * U slucaju da sa prefiksom misli na zajednicke rijeci
 * 
 */

public class Zadatak3_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		String first, second;
		String result = "";

		System.out.print("Enter first string: ");
		first = input.nextLine();

		System.out.print("Enter second string: ");
		second = input.nextLine();

		// ako su stringovi identicni printa slejdecu poruku
		if (first.equals(second)) {
			System.out.println("The strings are identical.");
			System.exit(0);
		}

		// u slucaju da je drugi string duzi - mijenjamo vrijednosti
		if (second.length() > first.length()) {
			String temp = first;
			first = second;
			second = temp;
		}

		String[] firstArray = first.split(" ");
		String[] secondArray = second.split(" ");

		// petlja ide do duzine kraceg stringa
		for (int i = 0; i < second.length(); i++) {
			if (!(firstArray[i].equals(secondArray[i]))) {
				break;
			}
			result += " " + firstArray[i];
		}

		// printanje rezultata
		// ako nemaju znajednicni prefix printa sljedecu poruku
		if (result.length() == 0) {
			System.out.println("The entered strings have no common prefix.");
		} else {
			// ako postoji prefix printa sljedecu poruku
			System.out.print("The common prefix for the entered strings is: ");
			System.out.println(result);
			input.close();
		}

	}

}
