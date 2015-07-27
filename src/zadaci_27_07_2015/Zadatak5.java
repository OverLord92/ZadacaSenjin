package zadaci_27_07_2015;

import java.util.Scanner;

/**
 * Napisati metodu koja pretavara milisekunde u sate, minute i sekunde. Metoda
 * treba da koristi sljedeći header: public static String convertMillis(long
 * millis). Metoda treba da vraća vrijeme kao string u formatu
 * sati:minute:sekunde. Na primjer convertMillis(100000) treba da vrati 0:1:40.
 */

public class Zadatak5 {

	public static final long MILLIS_PER_SECOND = 1000;
	public static final long MILLIS_PER_MINUTE = 60000;
	public static final long MILLIS_PER_HOUR = 3600000;
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of milliseconds: ");
		System.out.println(convertMillis(input.nextInt()));
		input.close();
		
	}

	public static String convertMillis(long millis) {

		String vrijeme = "";

		vrijeme += millis / MILLIS_PER_HOUR + ":";
		millis %= MILLIS_PER_HOUR;

		vrijeme += millis / MILLIS_PER_MINUTE + ":";
		millis %= MILLIS_PER_MINUTE;

		vrijeme += millis / MILLIS_PER_SECOND;

		return vrijeme;
	}

}
