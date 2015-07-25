package zadaci_25_07_2015;

/**
 * Napisati program koji učitava iznos investicije, godišnju interesnu 
 * stopu i broj godina te vraća buduću vrijednost investicije koristeći 
 * se sljedećom formulom: 
 * buducaVrijednostInvesticije = 
 * iznosInvesticije * (1 + mjesecnaInteresnaStopa)^brojGodina*12. 
 * Na primjer, ukoliko uneste kao iznos investicije 1000, 3.25 kao 
 * godišnju interesnu stopu i 1 kao broj godina program vam vraća 
 * 1032.98 kao buducu vrijednost investicije. 
 */

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		double amount, annualInterestRate, monthlyInterestRate, years;

		// korisnik unosi podatke
		System.out.print("Enter the amount: ");
		amount = input.nextDouble();

		System.out.print("Enter annual interest rate: ");
		annualInterestRate = input.nextDouble() / 100;

		monthlyInterestRate = annualInterestRate / 12;

		System.out.print("Enter number of years: ");
		years = input.nextDouble();

		double futureAmount;

		// racunanje buduce vrijednosti
		futureAmount = amount * Math.pow(1 + monthlyInterestRate, years * 12);

		// koristeci pirntf ispisivalo je rezultat 1032.99
		// pa sam morao ovako

		futureAmount = (double) Math.floor(futureAmount * 100) / 100;

		System.out.print("The future amount would be: " + futureAmount + ".");
	}

}
