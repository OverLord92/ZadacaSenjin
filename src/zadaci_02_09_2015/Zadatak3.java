package zadaci_02_09_2015;

/**
 * *18.10 (Occurrences of a specified character in a string) Write a recursive
 * method that finds the number of occurrences of a specified letter in a string
 * using the following method header: public static int count(String str, char
 * a)
 */

public class Zadatak3 {

	/** Test program */
	public static void main(String[] args) {

		System.out.println(count("baraba ", 'a'));

	}

	/** Counts the occurrence of a char in the string */
	public static int count(String str, char a) {

		int count = 0;

		// if the string.length is 0 the method returns the count
		if (str.length() == 0)
			return count;

		// if the string.length is 1 or greater the method continues
		else {

			// check if the last character of the string is equal to char a
			if (a == str.charAt(str.length() - 1)) {
				count++;
			}
			
			// recursive call with the substring of the current string excluding the last character
			str = str.substring(0, str.length() - 1);
			return count + count(str, a);
		}

	}

}
