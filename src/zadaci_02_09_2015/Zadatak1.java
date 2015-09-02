package zadaci_02_09_2015;

/**
 * *18.8 (Print the digits in an integer reversely) Write a recursive method
 * that displays an int value reversely on the console using the following
 * header: public static void reverseDisplay(int value)
 */

public class Zadatak1 {

	/** Test program */
	public static void main(String[] args) {
		
		reverseDisplay(1024);

	}

	/** Printa cifre cijelog broja u obrnutom redoslijedu */
	public static void reverseDisplay(int value) {
		if(value == 0) // base case
			return;
		else{
			System.out.print(value % 10); // printamo zadnju cifru s desna
			reverseDisplay(value / 10); // ponovno pozivanje metode
		}
	}

}
