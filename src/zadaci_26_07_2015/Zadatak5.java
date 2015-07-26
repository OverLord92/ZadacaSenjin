package zadaci_26_07_2015;

import java.util.Scanner;

/**
 * Neke web stranice forsiraju određena pravila za passworde. Napisati metodu
 * koja provjerava da li je unijeti string validan password. Pravila da bi
 * password bio validan su sljedeća: 1. Password mora biti sačinjen od najmanje
 * 8 karaktera. 2. Password smije da se sastoji samo od slova i brojeva. 3.
 * Password mora sadržati najmanje 2 broja. Napisati program koji pita korisnika
 * da unese password te mu ispisuje "password je validan" ukoliko su sva pravila
 * ispoštovana ili "password nije validan" ukoliko pravila nisu ispoštovana.
 */

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		// korisnik unosi password
		System.out.print("Enter password: ");
		String password = input.nextLine();
		password.trim();
		
		//printanje rezultata
		System.out.println(isPasswordValid(password) ? "password je validan"
				: "password nije validan");

		input.close();
		
	}

	/** Metoda koja provjerava da li je password validan */ 
	public static boolean isPasswordValid(String password) {

		int numOfDigits = 0;

		//provjerava da li je ispinjen uslov za duzinu passwords
		if (password.length() < 8)
			return false;

		else
			for (int i = 0; i < password.length(); i++) {
				Character currentChar = password.charAt(i);
				//provjerava da li ima karaktera sem slova ibrojeva
				if (!Character.isLetterOrDigit(currentChar))
					return false;
				if (Character.isDigit(currentChar))
					numOfDigits++;

			}

		// provjerava li password ima najmanje dva broja
		if (numOfDigits < 2)
			return false;
		return true;
	}

}
