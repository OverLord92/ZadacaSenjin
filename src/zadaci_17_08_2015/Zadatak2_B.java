package zadaci_17_08_2015;

import java.util.Date;

/** Ovu klasu sam stavio public kako bi s eodrzao redoslijed klasa u paketu */
public class Zadatak2_B {

}

/** Klasa employee definisana kao abstract */
abstract class Employee extends Person {
	private String office;
	private double sallary;
	private Date dateHired;

	/** Konstruktor */
	public Employee(String name, String address, String phoneNumber,
			String emailAddress, String office, double sallary) {
		super(name, address, phoneNumber, emailAddress);
		this.office = office;
		this.sallary = sallary;
		this.dateHired = new Date();
	}

	/** Overrajdovana toString metoda */
	public String toString() {
		return "Employee: " + getName();
	}
}


/** Klasa faculty */
class Faculty extends Employee {
	private double officeHours;
	private String rank;

	/** Konstruktor */
	public Faculty(String name, String address, String phoneNumber,
			String emailAddress, String office, double sallary,
			double officeHours, String rank) {
		super(name, address, phoneNumber, emailAddress, office, sallary);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	/** Overrajdovana toString metoda */
	public String toString() {
		return "Faculty:  " + getName();
	}
}


/** Klasa Staf */
class Staff extends Employee {
	private String title;

	/** Konstuktor */
	public Staff(String name, String address, String phoneNumber,
			String emailAddress, String office, double sallary, String title) {
		super(name, address, phoneNumber, emailAddress, office, sallary);
		this.title = title;
	}

	/** Overrajdovana toString metoda */
	public String toString() {
		return "Faculty:  " + getName();
	}
}

