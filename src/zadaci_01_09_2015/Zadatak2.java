package zadaci_01_09_2015;

/**
 * *18.3 (Compute greatest common divisor using recursion) The gcd(m, n) can
 * also be defined recursively as follows: - If m % n is 0, gcd(m, n) is n. -
 * Otherwise, gcd(m, n) is gcd(n, m % n). Write a recursive method to find the
 * GCD. Write a test program that prompts the user to enter two integers and
 * displays their GCD.
 */

public class Zadatak2 {

	/** Kratki test program */
	public static void main(String[] args) {

		// printanje najveceg zajednicog sadrzaoca dva broja
		System.out.println(gcd(27, 72));

	}

	/** Metoda koja racuna najveci zajednicki sadrzalac dva broja */
	public static int gcd(int m, int n) {
		System.out.println(m + " " + n);
		// ukoliko je broj m djeljiv sa n gcd je n
		if (m % n == 0)
			return n;
		else {
			// ako to nije slucaj ponovo pozivamo metodu gcd
			return gcd(n, m % n);
		}
	}

}
