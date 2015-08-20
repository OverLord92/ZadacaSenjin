package zadaci_20_08_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * *12.2 (InputMismatchException) Write a program that prompts the user to read
 * two integers and displays their sum. Your program should prompt the user to
 * read the number again if the input is incorrect.
 */

public class Zadatak3 {
	public static void main(String[] args) {
	Scanner input;
		// boolean koji oznacava validnost unjetih brojeva
		boolean validInput = false;
		
		do{
			try{
				// korisnik unosi brojeve
				input = new Scanner(System.in);
				System.out.print("Unesite dva cijela broja: ");
				int num1 = input.nextInt();
				int num2 = input.nextInt();
				int sum = num1 + num2;
				System.out.println("Zbir ta dva broja je: " + sum);
				// ukoliko je unos validan petlja se zavrsava
				validInput = true;
			}
			// ako korisnik ne unese integer izbacujemo poruku
			// korisniku da je pogrijesio
			catch(InputMismatchException e){
				System.out.println("\nMorate unjeti dva CIJELA broja. Pokusajte ponovo.\n");
			}
		}while(!validInput);
	}

}
