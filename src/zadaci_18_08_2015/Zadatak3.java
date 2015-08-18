package zadaci_18_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

/** 11.12 (Sum ArrayList) Write the following method that returns the sum of all numbers
in an ArrayList:
public static double sum(ArrayList<Double> list)
Write a test program that prompts the user to enter 5 numbers, stores them in an
array list, and displays their sum. */

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Double> list = new ArrayList<>();
		
		// korisnik unosi brojeve u listu
		System.out.print("Unesite 5 brojeva: ");
		for(int i = 0; i < 5; i++){
			list.add(input.nextDouble());
		}
		
		// pozivanje metode i printanje rezultata
		System.out.printf("Zbir clanova liste je: %.4f", sum(list));
		input.close();

	}
	
	/** Metoda koja sabira clanove liste */
	public static double sum(ArrayList<Double> list){
		double sum = 0;
		
		for(Double d: list)
			sum += d;
		
		return sum;
	}

}
