package zadaci_02_09_2015;

/**
 * *18.13 (Find the largest number in an array) Write a recursive method that
 * returns the largest integer in an array. Write a test program that prompts
 * the user to enter a list of eight integers and displays the largest element.
 */

public class Zadatak5 {

	/** Test program */
	public static void main(String[] args) {

		int[] arr = { 5, 99, 1, 98, 102, 2 };

		System.out.println(max(arr));		

	}
	

	/** Helper Method which calls the main max */
	public static int max(int[] arr) {

		// check if the array in empty or equal to null
		if (arr == null || arr.length == 0) {
			// if so the method returns -1
			return -1;
		} else {
			// if the array is not empty the helper method calls the max method
			return max(arr, arr.length - 1);
		}
	}

	/** Method which returns the max value in an array */
	public static int max(int[] arr, int index) {

		// we define the max value as the first element in the array
		int max = arr[0];

		// base case - if the index < 0 the metho return the max value
		if (index < 0) // base case
			return max;

		else {
			// check if the element at the current index is greater than max
			if (arr[index] > max) {
				max = arr[index];
				return max;
			} 	
		}
		// call the method with the next index
		return max(arr, index - 1);
	}

}
