package zadaci_15_08_2015;

/**
 * (Implement the String class) The String class is provided in the Java
 * library. Provide your own implementation for the following methods (name the
 * new class MyString1): 
 * public MyString1(char[] chars); 
 * public char charAt(int index); 
 * public int length(); 
 * public MyString1 substring(int begin, int end);
 * public MyString1 toLowerCase(); 
 * public boolean equals(MyString1 s); 
 * public static MyString1 valueOf(int i);
 */

public class Zadatak1 {

	/** Test program */
	public static void main(String[] args) {

		// nekoliko testnih slucajeva

		MyString1 str0 = MyString1.valueOf(256);
		System.out.println("valueOf 256? " + str0);

		char[] karakteri = { '0', '1', '2', '3', '4', '5' };
		MyString1 str1 = new MyString1(karakteri);

		System.out.println("str1 " + str1);

		MyString1 str2 = str1.substring(1, 2);

		System.out.println("substring of str1(1,2)? " + str2);

		char[] karakteri2 = { 'z', 'A', '4', 'G', 'g', 'O' };

		MyString1 str3 = new MyString1(karakteri2);

		System.out.println("str3 " + str3);

		MyString1 str4 = str3.toLowerCase();

		System.out.println("str3 to lower case" + str4);

		System.out.println("str1 = str2? " + str1.equals(str2));

		System.out.println("str3 = str4? " + str3.equals(str4));

		str3 = str3.toLowerCase();

		System.out.println("str3 = str4 after toLowerCase? "
				+ str3.equals(str4));
	}

}

class MyString1 {
	char[] chars;

	/** Konstruktor koji uzima niz karaktera */
	MyString1(char[] chars) {
		this.chars = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
			this.chars[i] = chars[i];
		}
	}

	/** Metoda koja vraca char na odredjenoj poziciji */
	public char charAt(int index) {
		return this.chars[index];
	}

	/** Metoda koja vraca duzinu MyString1 */
	public int length() {
		return chars.length;
	}

	/** Metoda koja vraca substring */
	public MyString1 substring(int begin, int end) {
		char[] chars = new char[end - begin];
		for (int i = 0; i < chars.length; i++) {
			chars[i] = this.chars[i + begin];
		}

		return new MyString1(chars);
	}

	/** Metoda koja vrac astring sa malim slovima */
	public MyString1 toLowerCase() {
		char[] chars = new char[this.chars.length];
		for (int i = 0; i < chars.length; i++)
			chars[i] = Character.toLowerCase(this.chars[i]);
		return new MyString1(chars);
	}

	/** Metoda koja provjerava da li su tringovi identicni */
	public boolean equals(MyString1 s) {
		if (s.length() != this.length()) {
			return false;
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.chars[i] != this.chars[i]) {
				return false;
			}
		}
		return true;
	}

	/** Metoda koja vraca int u obliku stringa */
	public static MyString1 valueOf(int i) {

		// vrijednost i dodjeljujemo varijabli number
		// kako bi i ostalo nepromjenjeno u prvom dijelu
		// metode
		int number = i;

		// brojac za duzinu broja
		int counter = 1;
		// petlja u kojoj racunamo koliko broj ima cifara
		while (number >= 10) {
			number /= 10;
			counter++;
		}

		// pravimo char niz velicine broja cifara u broju
		char[] chars = new char[counter];

		// petlja pomocu koje cifre broja ubacujemo u nizide s desna na lijevo
		// jer cifre iz broja i
		// "vadimo" takodje s desna na lijevo
		for (int j = chars.length - 1; j >= 0; j--) {
			if (i >= 10) {
				chars[j] = (char) ('0' + i % 10);
				i /= 10;
			} else {
				chars[j] = (char) ('0' + i);
			}
		}

		// metoda vraca MyString1 sa vrijedosti proslijedjenog broja
		return new MyString1(chars);

	}

	/** Overrajdovana tostring metoda */
	public String toString() {
		String result = "";
		for (int i = 0; i < this.chars.length; i++) {
			result += this.chars[i];
		}
		return result;
	}
}
