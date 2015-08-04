package zadaci_04_08_2015;

import java.util.Scanner;

/**
 * Napisati metodu sa sljedećim headerom: public static String format(int
 * number, int width) koja vraća string broja sa prefiksom od jedne ili više
 * nula. Veličina stringa je width argument. Na primjer, ukoliko pozovemo metodu
 * format(34, 4) metoda vraća 0034, ukoliko pozovemo format(34, 5) metoda vraća
 * 00034. Ukoliko je uneseni broj veći nego width argument, metoda vraća samo
 * string broja. Npr. ukoliko pozovemo format(34, 1) metoda vraća 34.
 */

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// korisnik unosi broj i duzinu
		System.out.print("Unesite broj i zeljenu duzinu zapisa: ");
		
		// printanje rezultata
		System.out.println(format(input.nextInt(), input.nextInt()));

		input.close();
		
	}
	
	/** Metoda koja vraca broj sa vodecim nulama */
	public static String format(int number, int width){
		
		// smjestamo broj u string
		String num = number + "";
		String result = "";
		
		// printanje vodecih nula
		for(int i = 0; i < width-num.length(); i++){
			result += "0";
		}
		
		// dodavanje broja u string
		result += num;
		
		return result;
	}

}
