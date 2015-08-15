package zadaci_15_08_2015;

/**
 * **10.23 (Implement the String class) The String class is provided in the Java
 * library. Provide your own implementation for the following methods (name the
 * new class MyString2): 
 * public MyString2(String s); 
 * public int compare(Strings); 
 * public MyString2 substring(int begin); 
 * public MyString2 toUpperCase();
 * public char[] toChars(); 
 * public static MyString2 valueOf(boolean b);
 * 
 * 
 * moglo je se namjestiti da MyString2 extends MyString1, ali u zadatku nije
 * pisalo nista u tom smislu
 */

public class Zadatak2 {

	/** Test program */
	public static void main(String[] args) {

		// testiranje subtring metode
		MyString2 str1 = new MyString2("Druga Metoda");
		System.out.println("Druga Metoda substring(6) " + str1.substring(6));

		// testiranje compare metode
		System.out.println("senjin = sanjin? "
				+ new MyString2("senjin").compare("sanjin"));

		System.out.println("Java = java? "
				+ new MyString2("Java").compare("java"));

		System.out.println("daft = Punk? "
				+ new MyString2("daft").compare("Punk"));

		System.out.println("Kafa = Kafa? "
				+ new MyString2("Kafa").compare("Kafa"));

	}

}

class MyString2 {
	char[] chars;

	
	/** Konstruktor */
	public MyString2(String s) {
		this.chars = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			this.chars[i] = s.charAt(i);
		}

	}

	/** Metoda koja uporedjuje dva MyString2 objekta */
	public int compare(String s) {
		if (this.chars.length > s.length())
			return 1;
		else if (this.chars.length < s.length())
			return -1;
		else {
			for (int i = 0; i < s.length(); i++) {
				if (this.chars[i] > s.charAt(i)) {
					return 1;
				} else if (this.chars[i] < s.charAt(i)) {
					return -1;
				}
			}
			return 0;
		}

	}

	/** Metoda koja vraca substring */
	public MyString1 substring(int begin) {
		char[] chars = new char[this.chars.length - begin];
		for (int i = 0; i < chars.length; i++) {
			chars[i] = this.chars[i + begin];
		}

		return new MyString1(chars);

	}

	/** Metoda koja vraca string sa velikim slovima */
	public MyString1 toUpperCase() {
		char[] chars = new char[this.chars.length];
		for (int i = 0; i < chars.length; i++)
			chars[i] = Character.toUpperCase(this.chars[i]);
		return new MyString1(chars);
	}

	/** Metoda koja vraca niz sa karakterima stringa */
	public char[] toChars() {
		// nisam returnao this.chars zato sto nisam bio siguran da li
		// ce se promjene na vracenom nizu odraziti na MyString2 objekat
		char[] chars = new char[this.chars.length];
		System.arraycopy(this.chars, 0, chars, 0, this.chars.length);
		return chars;
	}
	
	/** Metoda koja vraca boolean u MyString2 obliku */
	public static MyString2 valueOf(Boolean b){
		if(b == true)
			return new MyString2("true");
		else{
			return new MyString2("false");
		}
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
