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
	
	/** Adds the digits of an integer and returns the sum */
	public static int sumDigits(long number){
		
		int sum = 0;
		
		// if the number is zero the method returns the result
		if(number == 0)
			return sum;
		
		// else the method continues
		else{
			// add the last digits from right to sum
			sum += number % 10;
			// call the method again with number excluding the last digit
			return sum + sumDigits(number / 10);
		}
	}

}
