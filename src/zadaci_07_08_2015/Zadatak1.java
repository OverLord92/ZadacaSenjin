package zadaci_07_08_2015;

/**
 * Write a program that generates 100 random integers between 0 and 9 and
 * displays the count for each number. (Hint: Use an array of ten integers, say
 * counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
 */

public class Zadatak1 {

	public static void main(String[] args) {
		
		// array which counts the occurrences of the numbers 0-9
		int[] countNumbers = new int[10];

		// generate 100 random numbers from 0-9
		for(int i = 0; i < 100; i++){
			countNumbers[(int)(Math.random()*10)]++;
		}
		
		// print result
		for(int i = 0; i < 10; i++){
		System.out.println("Number " + i + " has occurred " + countNumbers[i] + " times.");
		}
	}

}
