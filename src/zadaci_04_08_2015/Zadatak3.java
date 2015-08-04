package zadaci_04_08_2015;

import java.util.Scanner;

/**
 * U javi, short vrijednost se sprema u samo 16 bita. Napisati program koji pita
 * korisnika da unese short broj te mu ispiše svih 16 bita za dati cijeli broj.
 * Na primjer, ukoliko korisnik unese broj 5 - program mu ispisuje
 * 0000000000000101
 */

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// korisnik unosi broj
		System.out.print("\n  Unesite broj: ");
		short broj = input.nextShort();
		
		// broj u binarnom obliku smjestamo u stirng
		String binNum = toBinary(broj);
		
		// parsujemo strin u long kako bi ga moglo proslijediti metodi format
		long result = Long.parseLong(binNum);
		
		
		// printanje rezultata
		System.out.println("  Svih 16 bita broja: " + format(result, 16));
		
		input.close();
		
		
	}
	
	
	/** Overloadovana metoda iz Zadatak4 */
	public static String format(long number, int width){
		
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
	
	/** Metoda koja vraca broj u binarnom zapisu */
	public static String toBinary(short broj){
		String result = "";
		
		// integer kojem dodjeljujemo vrijednost unesenog broja
				// koristi se za racunanje duzine binarnog broja
				// da bi uneseni broj ostao nepromjenjen
				int number = broj;

				// najveci stepen na 2 manji od unesenog broja
				int najveciStepen = 0;

				// odredjujemo najveci stepen odnosno duzinu binarnog broja
				while (number > 0) {
					number /= 2;
					if (number != 0) {
						najveciStepen++;
					}
				}
				

				// petlja za printanje binarnog broja
				for (int i = najveciStepen; i >= 0; i--) {
					// ako je 2 na i manje od preostalog broja pisemo 1
					// i oduzimamo 2 na i od broja
					if (Math.pow(2, i) <= broj) {
						result += "1";
						broj -= Math.pow(2, i);
						// u suprotnom slučaju pišemo 0
					} else {
						result += "0";
					}
				}
				
			return result;	

	}

}
