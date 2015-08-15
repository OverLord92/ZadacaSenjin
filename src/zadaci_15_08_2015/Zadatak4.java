package zadaci_15_08_2015;

/** **10.25 (New string split method) The split method in the String class returns an
 array of strings consisting of the substrings split by the delimiters. However, the
 delimiters are not returned. Implement the following new method that returns
 an array of strings consisting of the substrings split by the matching delimiters,
 including the matching delimiters.
 public static String[] split(String s, String regex)
 For example, split("ab#12#453", "#") returns ab, #, 12, #, 453 in an
 array of String, and split("a?b?gf#e", "[?#]") returns a, b, ?, b, gf,
 #, and e in an array of String. */

import java.util.ArrayList;

public class Zadatak4 {

	public static void main(String[] args) {

		/** Test program */
		String[] splited = split("124#123$$fdsf#213#fds#", "#$");

		for (String s : splited)
			System.out.print(s + " ");

	}

	/** Metoda koja splita string u string[], ukljucujuci i regeks karaktere */
	public static String[] split(String s, String regex) {
		
		// arraylista u koju ubacujemo clanove niza
		// koje cemo kasnije ubaciti u array
		ArrayList<String> splited = new ArrayList<>();
		
		String currentString = "";

		// za svaki karakter u stringu provjeravamo da li
		// se nalazi u regex stringu
		for (int j = 0; j < s.length(); j++) {

			// ako se trenutni karakter nalazi u regex
			if (contains(s.charAt(j), regex)) {
				// i ako je trenutni string duzi od 0
				if (currentString.length() != 0)
					// dodajemo string u arraylistu
					splited.add(currentString);
				// dodavanje regex karaktera u arraylist
				splited.add(s.charAt(j) + "");
				// resetujemo currenString
				currentString = "";
			} else {
				// ako se trenutni karakter ne nalazi u regexu
				// dodajemo ga na trenutni string
				currentString += s.charAt(j);
			}
		}

		// prebacujemo ArrayList u array
		String[] str = new String[splited.size()];
		for (int i = 0; i < str.length; i++) {
			str[i] = splited.get(i);
		}
		return str;
	}

	/** Metoda koja provjerava da li se char nalazi u stringu */
	public static boolean contains(char c, String s) {
		for (int i = 0; i < s.length(); i++) {
			if (c == s.charAt(i))
				return true;
		}
		return false;
	}
}
