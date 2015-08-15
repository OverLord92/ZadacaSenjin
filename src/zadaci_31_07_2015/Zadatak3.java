package zadaci_31_07_2015;

/**
 * Emirp brojevi (prime unazad) je nepalindromski prosti broj koji je prosti
 * broj i kada ispišemo naopako. Na primjer, broj 17 i broj 71 su prosti brojevi
 * tako da su brojevi i 17 i 71 emirp brojevi. Napisati program koji ispisuje
 * prvih 100 emirp brojeva, 10 brojeva po liniji.
 */

public class Zadatak3 {

	public static void main(String[] args) {

		// broj ispisanih brojeva po liniji
		int perLine = 10;
		
		// brojac za emirp brojeve
		int emirp = 0;
		
		// zanemarujemo jednocifrene brojeve
		int i = 10;

		System.out.println("  Prvi 100 emirp brojevi su:\n");
		
		
		// petlja koja printa emirp brojeve
		do {

			// uslov koji mora biti ispinjen da bi broj bio emirp
			if (isPrime(i) && !isPalindrome(i) && isPrime(reverse(i))) {
				emirp++;

				if (emirp % perLine == 0)
					System.out.printf("%5d\n", i);
				else
					System.out.printf("%5d ", i);

			}

			i++;
		} while (emirp < 100);

	}

	/** Metoda koja vraca true ukoliko je broj palindrome */
	public static boolean isPalindrome(int number) {

		if (number == reverse(number))
			return true;
		else
			return false;

	}

	/** Metoda koja provjerava da li je broj prost ili ne */
	public static boolean isPrime(int number) {
		if (number == 0 || number == 1)
			return false;
		else if (number == 2)
			return true;
		else
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					return false;
				}
			}
		return true;
	}

	/** Metoda koja vraca broj naopako ispisan */
	public static int reverse(int number) {

		// string u koji smijestamo proslijedjeni broj
		String numStr = number + "";

		// string u koji smijestamo broj ispisan naopako
		String revNumStr = "";

		for (int i = numStr.length() - 1; i >= 0; i--) {
			revNumStr += numStr.charAt(i);
		}

		return Integer.parseInt(revNumStr);
	}

}
