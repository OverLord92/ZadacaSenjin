package zadaci_15_08_2015;

import java.util.ArrayList;

/**
 * (Implement the StringBuilder class) The StringBuilder class is provided in
 * the Java library. Provide your own implementation for the following methods
 * (name the new class MyStringBuilder1): public MyStringBuilder1(String s);
 * public MyStringBuilder1 append(MyStringBuilder1 s); public MyStringBuilder1
 * append(int i); public int length(); public char charAt(int index); public
 * MyStringBuilder1 toLowerCase(); public MyStringBuilder1 substring(int begin,
 * int end); public String toString();
 */

public class Zadatak5 {
	/** Main method */
	public static void main(String[] args) {
		
		//testiranjem metoda
		
		MyStringBuilder1 str1 = new MyStringBuilder1("STRING");
		System.out.println("sustring(1,4) stringa STRING je " + str1.substring(1, 4));
		
		MyStringBuilder1 str2 = new MyStringBuilder1("drugi string");
		str2.append(str1);
		System.out.println("Dodavanjem sadrzaja str1 u str2 dobijamo: " + str2);
		
		str2.append(200);
		System.out.println("Poslije dodavanje broja 100 u str2 dobijamo: " + str2);
		
		System.out.println("Duzina str2 = " + str2.length());
		
		MyStringBuilder1 str3 = str1.toLowerCase();
		System.out.println("str1.toLowerCase = " + str3);
		
		System.out.println("Karakter na poziciji 2 u str3 je " + str3.charAt(2));

	}
}

class MyStringBuilder1 {
	//arraylist u koji mozemo dodavati karaktere
	ArrayList<Character> chars = new ArrayList<>();

	public MyStringBuilder1() {

	}

	/** Konstruktor koji od stringa pravi stringbuilder */
	public MyStringBuilder1(String s) {
		for (int i = 0; i < s.length(); i++) {
			chars.add(s.charAt(i));
		}
	}

	/** Metoda koja na stringbuilder dodaje sadrzaj drugog string buildera */
	public MyStringBuilder1 append(MyStringBuilder1 s) {

		for (int i = 0; i < s.length(); i++) {
			this.chars.add(s.chars.get(i));
		}
		return this;
	}

	/** Metoda koja na stringbuilder dodaje integer */
	public MyStringBuilder1 append(int i) {
		MyStringBuilder1 appendInt = new MyStringBuilder1(i + "");
		this.append(appendInt);
		return this;
	}

	/** Metoda koja vraca duzinu stringbuildera */
	public int length() {
		return chars.size();
	}

	/** Metoda koja vraca karakter na odredjenoj poziciji */
	public char charAt(int index) {
		return this.chars.get(index);
	}

	/** Metoda koja sva slova u stringbuilderu prebacuje u lower case */
	public MyStringBuilder1 toLowerCase() {

		for (int i = 0; i < this.length(); i++) {
			this.chars.set(i, Character.toLowerCase(this.chars.get(i)));
		}

		return this;

	}

	/** Metoda koja vraca substring string buildera */
	public MyStringBuilder1 substring(int begin, int end) {
		MyStringBuilder1 result = new MyStringBuilder1();
		for(int i = begin; i < end; i++){
			result.chars.add(this.chars.get(i));
		}
		
		return result;
	}
	
	/** Overrajdovana toString metoda */
	public String toString(){
		String result = "";
		for(int i = 0; i < this.length(); i++)
			result += this.chars.get(i);
		return result;
	}

}
