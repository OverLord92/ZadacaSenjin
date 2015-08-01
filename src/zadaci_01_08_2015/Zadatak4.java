package zadaci_01_08_2015;

import java.util.Scanner;

/**
 * Napisati metodu koja izračunava zbir svih brojeva u cijelom broju. Koristite
 * sljedeći header: public static int sumDigits(long n). Na primjer, ako
 * pozovemo metodu i proslijedimo joj broj 234 (sumDigits(234)) metoda treba da
 * vrati 9. (2 + 3 + 4 = 9
 */

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		// korisnik unosi broj
		System.out.print("Enter a number to sum its digits: ");
		
		// printanje rezultata
		System.out.println("The sum of the digits is: " + sumDigits(input.nextInt()) + ".");
		
		input.close();
	}
	
	/** Metoda koja sabira cifre broja */
	public static int sumDigits(long n){
		
		int sum = 0;
		int currentDigit;
		
		// pretvaramo broj u string
		String number = n + "";
		
		// prolazimo kroz cifre broja i dodajemo ih sumi
		for(int i = 0; i < number.length(); i++){
			
			// ASCII za od 0 do 9 su 48 do 57 sto znaci da
			// je ASCII - 48 == broj koji je prestavljen
			currentDigit = (int)(number.charAt(i)) - 48;
			sum += currentDigit;
		}
		
		return sum;
	}


}
