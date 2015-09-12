package zadaci_07_08_2015;

import java.util.Scanner;

/**
 * Write the following method that tests whether the array has four consecutive
 * numbers with the same value. public static boolean isConsecutiveFour(int[]
 * values)
 */

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// create an array of defined length
		System.out.print("Enter the number of values: ");
		int[] values = new int[input.nextInt()];

		// input integers into array
		System.out.print("Enter the values: ");
		for (int i = 0; i < values.length; i++) {
			values[i] = input.nextInt();
		}

		// print result
		System.out
				.println(isConsecutiveFour(values) ? "The list has consecutive fours"
						: "The list has NO consecutive fours");

		input.close();

	}

	/** Checks if array has four consecutive numbers with the same value */
	public static boolean isConsecutiveFour(int[] values) {
		
		boolean isConFour = false;
		
		// initial counted number is the first number of the array
		int currentNum = values[0];
		int count = 1;
		
		for (int i = 1; i < values.length; i++) {
			
			// if the numbers has the same value increase counter
			if (values[i] == currentNum) {
				count++;
				
				// else change counted number and reset counter
			} else {
				currentNum = values[i];
				count = 1;
			}
			
			// if the counter reaches 4 the array has four consecutive numbers 
			if (count == 4) {
				isConFour = true;
				break;
			}

		}
		return isConFour;

	}

}
