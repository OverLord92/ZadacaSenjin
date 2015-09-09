package zadaci_01_09_2015;

/**
 * *18.3 (Compute greatest common divisor using recursion) The gcd(m, n) can
 * also be defined recursively as follows: - If m % n is 0, gcd(m, n) is n. -
 * Otherwise, gcd(m, n) is gcd(n, m % n). Write a recursive method to find the
 * GCD. Write a test program that prompts the user to enter two integers and
 * displays their GCD.
 */

public class Zadatak2 {

	/** Test program */
	public static void main(String[] args) {

		// prints the gcd of two numbers
		System.out.println(gcd(27, 72));

	}

	/** Calculates gcd for numbers m and n */
	public static int gcd(int m, int n) {
		
		// if the number m is divisible with n gcd is n
		if (m % n == 0)
			return n;
		else {
			// if this is not the case, call the method again with n and m % n
			return gcd(n, m % n);
		}
	}

}
