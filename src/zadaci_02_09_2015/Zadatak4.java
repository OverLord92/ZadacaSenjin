package zadaci_02_09_2015;

/**
 * *18.11 (Sum the digits in an integer using recursion) Write a recursive
 * method that computes the sum of the digits in an integer. Use the following
 * method header: public static int sumDigits(long n)
 */

public class Zadatak4 {

	/** Test program */
	public static void main(String[] args) {
		
		System.out.println(sumDigits(1024));

	}
	
	/** Sabira cifre cijelog broja n */
	public static int sumDigits(long n){
		int sum = 0;
		
		if(n == 0) // base case
			return sum;
		
		else{
			// dodajemo sumi zadnju cifru broja
			sum += n % 10;
			// ponovno pozivanje metode
			return sum + sumDigits(n / 10);
		}
	}

}
