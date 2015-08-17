package zadaci_17_08_2015;

import java.util.Date;

/**
 * 11.2 (The Person, Student, Employee, Faculty, and Staff classes) Design a
 * class named Person and its two subclasses named Student and Employee. Make
 * Faculty and Staff subclasses of Employee.
 */

public class Zadatak2_A {

	public static void main(String[] args) {

		Student student = new Student("imeStudenta", "adresa",
				"brojtelefona123", "email@", 3);
		System.out.println(student);

		Faculty faculty = new Faculty("imePredavaca", "adresa",
				"brojtelefona234", "email@", "office101", 26000, 100, "Dekan");
		System.out.println(faculty);

		Staff staff = new Staff("imeStafa", "adresa", "brojtelefona123", "email@",
				"office201", 1000, "Sekretarica");
		System.out.println(staff);

	}

}

/** Klasa Person*/
abstract class Person {
	private String name;
	private String address;
	private String phoneNumber;
	private String emailAddress;

	public Person() {

	}

	/** Konsturktor */
	public Person(String name, String address, String phoneNumber,
			String emailAddress) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}

	/** toString metoda */
	public String toString() {
		return "Person: " + name;
	}

	/** getter Metoda za name */
	public String getName() {
		return name;
	}
}

/** Klasa student */
class Student extends Person {
	private final static String[] STATUSES = { "freshman", "sophomore",
			"junior", "senior" };

	// final niz u koji smjestamo statuse studenata
	private String status = STATUSES[0];

	/** Student je po defaultu freshman */
	public Student() {

	}

	// konstruktori
	public Student(int status) {
		this.status = STATUSES[status];
	}

	public Student(String name, String address, String phoneNumber,
			String emailAddress, int status) {
		super(name, address, phoneNumber, emailAddress);
		this.status = STATUSES[status];
	}

	/** Metoda toString */
	public String toString() {
		return "Student: " + getName();
	}

}

