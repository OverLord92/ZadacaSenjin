package zadaci_30_07_2015;

/**
 * Pretpostavimo da se registarska tablica za auto sastoji od tri uppercase
 * karaktera i 4 broja u sljedećem formatu AAA-1234. Napisati program koji
 * nasumično generiše tablicu.
 */

public class Zadatak1 {

	public static void main(String[] args) {
		
		System.out.println("Program za generisanje tablice.");
		
		// string koji predstavlja tablicu
		String tablica = "";
		
		// dodavanje slova
		for(int i = 0; i < 3; i++){
			tablica += (char)(65 + Math.random() * 26);
		}
		
		tablica += "-";
		
		// dodavanje brojeva
		for(int i = 0; i < 3; i++){
			tablica += (char)(48 + Math.random() * 10);
		}
		
		// printanje rezultata
		System.out.println("Generisana tablica je: " + tablica);

	}

}
