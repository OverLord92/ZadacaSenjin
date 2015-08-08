package zadaci_08_08_2015;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Suppose the weekly hours for all employees are stored in a two-dimensional
 * array. Each row records an employee’s seven-day work hours with seven
 * columns. For example, the following array stores the work hours for eight
 * employees. Write a program that displays employees and their total hours in
 * decreasing order of the total hours.
 */

public class Zadatak1 {

	public static void main(String[] args) {

		// ArrayList u koji smjestamo uposlene
		ArrayList<Employee> employees = new ArrayList<>();

		// matrica sa satima uposlenih
		int[][] workHours = { 
				{ 1, 2, 3, 4, 5, 6, 7 }, 
				{ 1, 2, 3, 4, 5, 6, 5 },
				{ 1, 2, 3, 4, 5, 6, 4 },
				{ 1, 2, 3, 4, 5, 6, 7 },
				{ 1, 2, 3, 4, 5, 6, 2 }, 
				{ 1, 2, 3, 4, 5, 6, 7 },
				{ 1, 2, 3, 4, 5, 6, 7 }, 
				{ 1, 2, 3, 4, 5, 6, 1 }
		};

		int sum;

		// sabiramo sate u svakoj koloni
		for (int i = 0; i < workHours.length; i++) {
			sum = 0;
			for (int j = 0; j < workHours[0].length; j++) {
				sum += workHours[i][j];
			}
			// i dodjeljujemo ju Employee objektu
			employees.add(new Employee("Employee" + i, sum));
		}

		// sortiramo listu u rastucem nizu
		Collections.sort(employees);
		// obrtanje liste kako bi se dobio opadajuci niz
		Collections.reverse(employees);

		// printanje rezultata
		
		System.out.println("\tRadnici printani po broju radnih sati u opadajucem nizu:\n");
		for (Employee e : employees) {
			System.out.println("\t" + e.name + "\t" + e.hours);
		}

	}
}

// klasa za employee objekat
class Employee implements Comparable<Employee> {
	public String name;
	public int hours;

	// konstruktor
	Employee(String name, int hours) {
		this.name = name;
		this.hours = hours;
	}

	// overidovana metoda it comparable interface-a
	@Override
	public int compareTo(Employee e) {
		if (this.hours > e.hours)
			return 1;
		else
			return -1;
	}

}
