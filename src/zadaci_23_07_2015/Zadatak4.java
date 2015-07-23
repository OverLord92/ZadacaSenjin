package zadaci_23_07_2015;

/**
 * Napisati metodu koja printa 100 nasumičnih uppercase karaktera i 100
 * nasumičnih brojeva, 10 po liniji.
 */

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printRandom();
	}

	/** Metoda za printanje 100 nsaumicnih karaktera i 100 nasumicnih brojeva */
	public static void printRandom() {
		int counter = 1;
		int intChar = 0;
		char currentChar;
		int perLine = 10;
		System.out.println("100 nasumičnih upper case karaktera: \n");
		// petlja za printanje uppercase karaktera
		for (int i = 0; i < 100; i++) {

			// upper case karakteri su pomoci ASCII-a definisani sa brojevima
			// od 65 do 90
			intChar = (int) (65 + Math.random() * 26);
			currentChar = (char) intChar;

			// uslov za prelazak u sljedeci red
			if (counter % perLine == 0) {

				System.out.println(currentChar + " ");
			} else {
				System.out.print(currentChar + " ");
			}
			counter++;
		}

		System.out.println("\n\n");

		System.out.println("100 nasumičnih cifara: \n");
		// petlja za printanje cifara
		for (int i = 0; i < 100; i++) {

			// cifara su pomoci ASCII-a definisani sa brojevima
			// od 48 do 57
			intChar = (int) (48 + Math.random() * 10);
			currentChar = (char) intChar;

			// uslov za prelazak u sljedeci red
			if (counter % perLine == 0) {

				System.out.println(currentChar + " ");
			} else {
				System.out.print(currentChar + " ");
			}
			counter++;
		}

	}

}
