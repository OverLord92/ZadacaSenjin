package zadaci_01_08_2015;

import java.util.Scanner;

/**
 * Write a program wich plays rock-paper-scissort with the user. The program
 * randomly generates numbers 0, 1 and 2 wich represent paper, rock, scissor
 * .The program asks the user to enter 0, 1 or 2 and prints message with the
 * winners name. 
 */

public class Zadatak2 {
	
	public static final String[] SIGNS = { "Rock", "Paper", "Scissors" };

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// generate the programs choice
		int programChoice = (int) (Math.random() * 3);

		printUserMenu();

		// the user enters his/her choice
		System.out.print("    Enter your guess: ");
		int userChoice = input.nextInt();

		printChoosenSigns(userChoice, programChoice);
		
		printGameOutcome(userChoice, programChoice);

		input.close();
	}
	
	public static void printUserMenu(){
		System.out.println("\n  You are playing rock-paper-scissors! Choose wisely.\n");
		System.out.println("    *** 0 - rock ***" + 
		"\n    *** 1 - paper ***" +
		"\n    *** 2 - scissors ***\n");
	}
	
	/** Prints the choosen signs */
	public static void printChoosenSigns(int userChoice, int programChoice){
		System.out.println("\n    Your choice -> " + SIGNS[userChoice] + " : "
		+ SIGNS[programChoice] + " <- choice of the program.\n");
	}
	
	/** Prints if the user wan, lost or draw. */
	public static void printGameOutcome(int userChoice, int programChoice){
			
		if (userChoice == programChoice) {
			System.out.println("    Draw.");
		} else if (programChoice == 0) {
			System.out.println(userChoice == 1 ? "    You won!" : "    You lost!");

		} else if (programChoice == 1) {
			System.out.println(userChoice == 2 ? "    You won!" : "    You lost!");

		} else if (programChoice == 2) {
			System.out.println(userChoice == 0 ? "    You won!" : "    You lost!");
		}

	}

}
