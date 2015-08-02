package zadaci_02_08_2015;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/** Napisati metodu koja vraća datum i trenutačno vrijeme */

public class Zadatak4 {

	public static void main(String[] args) {

		// printanje datuma i vremena
		System.out.print("Datum i trenutno vrijeme: ");
		System.out.println(getDateAndTime());

	}

	/** Metoda koja vraca string sa datumom i vremenom */
	public static String getDateAndTime() {

		String result = "";

		// definisemo format datuma i vremena
		DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyy HH:mm:ss");
		
		// kreiramo novi Date objekat
		Date date = new Date();

		// dodajemo datum i vrijeme u string
		result += dateFormat.format(date);

		return result;
	}

}
