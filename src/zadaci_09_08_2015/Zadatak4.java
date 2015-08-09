package zadaci_09_08_2015;

import java.util.Date;

/**
 * Zadatak 9.7 iz knige. Write a test program that creates an Account object with
 * an account ID of 1122, a balance of $20,000, and an annual interest rate of
 * 4.5%. Use the withdraw method to withdraw $2,500, use the deposit method to
 * deposit $3,000, and print the balance, the monthly interest, and the date
 * when this account was created.
 */

public class Zadatak4 {

	public static void main(String[] args) {
		
		// kreiranje instance account
		Account acc = new Account(1122, 20000);

		// setovanje godisnje kamate
		Account.setAnnualInterestRate(4.5);
		// skidanje s racuna
		acc.withdraw(2500);
		
		// uplacivanje na racun
		acc.deposit(3000);

		// printanje rezultata
		System.out.println(acc.getBalance() + "  " + acc.getMonthlyInterest()
				+ " " + acc.getDate());

	}

}

class Account {
	// godisnja kamata definisana kao static
	private static double annualInterestRate = 0;

	// data polja
	private int id = 0;
	private double balance = 0;
	private Date dateCreated;

	/** No-args kontruktor */
	Account() {
		this.dateCreated = new Date();
	}

	/** Konstruktor za odrednjen id i balance */
	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date();
	}

	// geteri i seteri
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate / 100;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Date getDate() {
		return this.dateCreated;
	}

	/** Metoda za racunanje mjesecne kamatne stope */
	public static double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	/** Metoda za racunanje mjesecne kamate */
	public double getMonthlyInterest() {
		return getMonthlyInterestRate() * this.balance;
	}

	/** Metoda koja skina sumu s racuna */
	public void withdraw(double ammount) {
		this.setBalance(this.getBalance() - ammount);
	}

	/** Metoda koja uplacuje sumu na racun */
	public void deposit(double ammount) {
		this.setBalance(this.getBalance() + ammount);
	}
}
