package zadaci_02_08_2015;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/** Write a method that return current date and time */

public class Zadatak4 {

	public static void main(String[] args) {

		// print current date and time
		System.out.print("Current date and time: " + getDateAndTime());

	}

	/** Returns a string with current date and time */
	public static String getDateAndTime() {

		String result = "";

		// define a format for date and time
		DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyy HH:mm:ss");
		
		// create a new date object
		Date date = new Date();

		// adds the date and time to the result string
		result += dateFormat.format(date);

		return result;
	}

}
