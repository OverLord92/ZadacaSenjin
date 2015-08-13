package zadaci_13_08_2015;

/** 10.14 (The MyDate class) Design a class named MyDate. The class */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Zadatak4 {

	/** Test program */
	public static void main(String[] args) {

		MyDate date1 = new MyDate();
		System.out.println("date1  " + date1);

		MyDate date2 = new MyDate(34355555133101L);
		System.out.println("date2  " + date2);

	}

}

class MyDate {
	int year;
	int month;
	int day;

	/** Konstruktor koji kreira danasnji datum */
	MyDate() {
		Calendar calendar = new GregorianCalendar();
		this.year = calendar.get(Calendar.YEAR);
		this.month = calendar.get(Calendar.MONTH) + 1;
		this.day = calendar.get(Calendar.DAY_OF_MONTH);
	}

	/** Konstruktor koji kreira datum uz pomoc milisekundi 
	 * proteklih od 1.1.1970 */
	MyDate(long elapsedTime) {
		this.setElapsedTime(elapsedTime);
	}

	/** konsturkto koji kreira datum sa odredjenim datumom */
	MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	/** Metoda koja postavlja vrijeme proteklo od 1.1.1970 */
	public void setElapsedTime(long elapsedTime) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(elapsedTime);
		this.year = calendar.get(Calendar.YEAR);
		this.month = calendar.get(Calendar.MONTH) + 1;
		this.day = calendar.get(Calendar.DAY_OF_MONTH);
	}

	public String toString() {
		return this.day + "." + this.month + "." + this.year;
	}
}
