package zadaci_24_07_2015;

/** Napisati program koji pita korisnika da unese mjesečni iznos 
 * štednje te broj mjeseci nakon kojeg bi želio znati stanje računa.  
 * */

import java.util.Scanner;

public class Zadatak1 {

	// godisnja i mjesecna kamata kao static varijable
	static double annualInterest = 0.05;
	static double monthlyRate = annualInterest / 12;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		// korisnik unosi podatke
		System.out.print("Enter the amount: ");
		double amount = input.nextDouble();
		System.out.print("Enter time period: ");
		int timePeriod = input.nextInt();

		double balance = 0;

		// petlja za racunanje stanja na racunu
		for (int i = 0; i < timePeriod; i++) {
			balance = (balance + amount) * (1 + monthlyRate);
		}
		// printanje rezultata
		System.out.print("After " + timePeriod
				+ " moths, your balance would be: ");
		System.out.printf("%.3f", balance);
		input.close();
	}

}
