package zadaci_01_09_2015;

import java.util.Scanner;

/**
 * *18.2 (Fibonacci numbers) Rewrite the fib method in Listing 18.2 using
 * iterations.
 */

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int f0 = 0; // first number of fib array
		int f1 = 1; // second number of fib array

		// user enter the index of the fib number
		System.out.print("Enter index: ");
		int n = input.nextInt();
		input.close();

		// the start value of the fib number
		int currentFib = 0;

		// calculating the fib number in the n-th position
		for (int i = 2; i <= n; i++) {
			
			// adding the two previous fib numbers
			currentFib = f0 + f1;
			
			// f0 becomes f1 of the previous calculation
			f0 = f1;
			// f1 becomes the result of the previous calculation
			f1 = currentFib;

		}

		// print result
		System.out.println("fib(" + n + ") is " + currentFib + ".");

	}

}
