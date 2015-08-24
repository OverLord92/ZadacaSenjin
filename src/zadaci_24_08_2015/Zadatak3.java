package zadaci_24_08_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * *12.31 (Baby name popularity ranking) The popularity ranking of baby names
 * from years 2001 to 2010 is downloaded from www.ssa.gov/oact/babynames and
 * stored in files named babynameranking2001.txt, babynameranking2002.txt, . . .
 * , babynameranking2010.txt. Each file contains one thousand lines. Each line
 * contains a ranking, a boy’s name, number for the boy’s name, a girl’s name,
 * and number for the girl’s name.
 * 
 * u direktoriju projekta posotji fajl babynameranking2010.txt koji se moze
 * koristiti za testiranje programa
 */

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {

			// korisnik unosi godinu
			System.out.print("Unesite godinu(2000 - 2010): ");
			int year = input.nextInt();

			// ukoliko godina nije u rasponu raspolozivim datoteka printamo
			// poruku
			if (year < 2000 || year > 2010) {
				System.out
						.println("Spiskovi imena postoje samo za godine 2000 - 2010.");
				System.out.println("Restartujte program i pokusajte ponovo.");
				System.exit(1);
			}

			String fileName = "babynameranking" + year + ".txt";
			File file = new File(fileName);

			// korisnik unosi pol
			System.out.print("Unesite pol: ");
			char gender = input.next().charAt(0);
			// char gender prebacujemo u lowercase kako bi program bio case
			// insensitive
			gender = Character.toLowerCase(gender);

			// ako char gender nije ni 'm' ni 'f' ispisujemo poruku da je unjet
			// nepostojeci gender
			if (gender != 'm' && gender != 'f') {
				System.out.println("Ne posoji pol: " + gender + ".");
				System.out.println("Restartujte program i pokusajte ponovo.");
				System.exit(1);
			}

			// korisnik unosi ime
			System.out.print("Unesite ime: ");
			String name = input.next();

			// varijabla u koju smjestamo rank
			int rank;
			rank = findRank(file, name, gender);

			// ispisivanje rezultata pretreagea
			// ukoliko ime nije pronadjeno metoda vraca -1
			if (rank <= 0)
				System.out.println("Ime " + name + " se ne nalazi na listi "
						+ year + ".");
			else {
				// ako je ime pronadjeno ispoisujemo rezultat
				System.out.println("Ime " + name + " se nalazi na poziciji #"
						+ rank + " na listi " + year + ".");
			}

		} catch (FileNotFoundException e) {
			System.out.println("Datoteka nije pronadjena.");
		}
	}

	/**
	 * Metoda kojoj proslijedjujemo fajl i String name i char gender. Ukoliko se
	 * String name nalazi u fajlu, metoda vraca rank. Ukoliko string nije
	 * pronadjen u fajlu metoda vraca -1
	 */
	public static int findRank(File file, String name, char gender)
			throws FileNotFoundException {
		Scanner fileInput = new Scanner(file);

		// kolona u kojoj trazimo ime
		int column = 0;

		// ako trazimo musko ime pretrazujemo kolonu 1
		if (gender == 'm') {
			column = 1;
		} else {
			// ako trazimo zensko ime pretrazujemo kolonu 3
			column = 3;
		}
		
		// string koji drzi trenutnu liniju
		String currentLine;
		
		while (fileInput.hasNextLine()) {

			// splitamo trenutnu liniju u niz data
			currentLine = fileInput.nextLine();
			String[] data = currentLine.split(" ");

			// ako je ime pronadnjeno u trenutnoj liniji vracamo rank
			if (name.equals(data[column]))
				return Integer.parseInt(data[0]);
		}
		
		// ako se ime ne nalazi u trazenoj koloni metoda vraca -1
		return -1;
	}

}
