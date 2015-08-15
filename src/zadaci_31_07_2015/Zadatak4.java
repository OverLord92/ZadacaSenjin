package zadaci_31_07_2015;

/**
 * Palindrome prime je prosti broj koji je također i palindrom. Na primjer, 131
 * je palindrome prime, kao i brojevi 313 i 757. Napisati program koji ispisuje
 * prvih 100 palindrome prime brojeva, 10 brojeva po liniji.
 */

public class Zadatak4 {

	public static void main(String[] args) {
		
		// broj ispisanih brojeva po liniji
		int perLine = 10;
		
		// brojac za proste palindrome
		int PalPrime = 0;
		
		// zanemarujemo jednocifrene brojeve
		int i = 10;
		
	
		System.out.println("  Prvih 100 prostih palindroma su: \n");
		
		// petlja koja printa prvih 100 prostih palindroma
		do{
			
			if(isPrime(i) && isPalindrome(i)){
				PalPrime++;
				
				if(PalPrime % perLine == 0)
					System.out.printf("%5d\n", i);
				else
				System.out.printf("%5d ", i);
				
			}
			
			i++;
		}while(PalPrime < 100);
		

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
	

	/** Metoda koja vraca true ukoliko je broj palindrome */
	public static boolean isPalindrome(int number) {

		if (number == reverse(number))
			return true;
		else
			return false;

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
