package zadaci_07_08_2015;

/**
 * Write a program that generates 100 random integers between 0 and 9 and
 * displays the count for each number. (Hint: Use an array of ten integers, say
 * counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
 */

public class Zadatak1 {

	public static void main(String[] args) {
		// niz u u kojem brojimo ponavljanja brojeva
		int[] countNumbers = new int[10];

		// generisanje brojeva
		for(int i = 0; i < 100; i++){
			countNumbers[(int)(Math.random()*10)]++;
		}
		
		// printanje rezultata
		for(int i = 0; i < 10; i++){
		System.out.println("Broj " + i + " je se pojavio " + countNumbers[i] + " puta.");
		}
	}

}
