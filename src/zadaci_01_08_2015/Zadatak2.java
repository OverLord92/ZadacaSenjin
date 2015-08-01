package zadaci_01_08_2015;

import java.util.Scanner;

/**
 * Napisati program koji igra sa protivnikom rock-paper-scissors.
 * (papir-bunar-makaze ili tako nekako po naški) Program nasumično generiše
 * brojeve 0, 1 i 2 koji predstavljaju papir, bunar i makaze. Program pita
 * korisnika da unese 0, 1 ili 2 te mu ispisuje poruku da li je korisnik
 * pobijedio, da li je računar pobijedio ili je bilo neriješeno.
 */

public class Zadatak2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int program, user;
		
		// niz sa znakovima
		String[] signs = {"Rock", "Paper", "Scissors"};

		// generisanje znaka koji ce program imati
		program = (int) (Math.random() * 3);

		// printanje uputstva za korisnika
		System.out
				.println("\n  You are playing rock-paper-scissors! Choose wisely.\n");
		System.out.println("    *** 0 - rock ***" + "\n    *** 1 - paper ***"
				+ "\n    *** 2 - scissors ***\n");

		// unos korisnikovog izbora
		System.out.print("    Enter your guess: ");
		user = input.nextInt();
		
		// printanje rezultata
		System.out.println("\n    Your choice -> " + signs[user] + " : " + signs[program] + " <- choice of the program.\n");

		if (user == program) {
			System.out.println("    Draw.");
		} else if (program == 0) {
			System.out.println(user == 1 ? "    You won!" : "    You lost!");

		} else if (program == 1) {
			System.out.println(user == 2 ? "    You won!" : "    You lost!");

		} else if (program == 2) {
			System.out.println(user == 0 ? "    You won!" : "    You lost!");

		}

		input.close();
		}

}
