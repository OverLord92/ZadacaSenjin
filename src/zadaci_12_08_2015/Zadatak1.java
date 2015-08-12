package zadaci_12_08_2015;

/** Zadatak 10.1 Design a class named Time.  */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Zadatak1 {

	/** Test program */
	public static void main(String[] args) {

		Time time1 = new Time();
		System.out.println("time1: " + time1);

		Time time2 = new Time(555550000);
		System.out.println("time2: " + time2);
	}

}

class Time {
	int hour, minute, second;

	/** Konstruktor koji pravi kreira objekat sa trenutnim vremenom */
	public Time() {
		Calendar calendar = new GregorianCalendar();
		this.hour = calendar.get(Calendar.HOUR_OF_DAY);
		this.minute = calendar.get(Calendar.MINUTE);
		this.second = calendar.get(Calendar.SECOND);
	}

	/**
	 * Konsturktor koji kreira objekat sa definisanim vremenom proteklim 
	 * od 1.1.1970 u milisekundama.
	 */
	public Time(long elapsedTime) {
		this.setTime(elapsedTime);
	}

	/** Konstruktor koji kreira objekat sa odredjenim satima, minutama 
	 * i sekundama */
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	/** Metoda koja postavlja vrijeme */
	public void setTime(long elapsedTime) {
		this.hour = (int) (elapsedTime / 3600_000 % 24);
		elapsedTime %= 3600_000;
		this.minute = (int) (elapsedTime / 60_000);
		elapsedTime %= 60_000;
		this.second = (int) (elapsedTime / 1000);
	}

	/** Overrajdovana toStirng metoda */
	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
}
