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

		// array list which holds the employee objects  
		ArrayList<Employee> employees = new ArrayList<>();

		// matrix with working hours
		double[][] workHours = { 
				{ 1, 2, 3, 4, 5, 6, 7 }, 
				{ 1, 2, 3, 4, 5, 6, 5 },
				{ 1, 2, 3, 4, 5, 6, 4 },
				{ 1, 2, 3, 4, 5, 6, 7 },
				{ 1, 2, 3, 4, 5, 6, 2 }, 
				{ 1, 2, 3, 4, 5, 6, 7 },
				{ 1, 2, 3, 4, 5, 6, 7 }, 
				{ 1, 2, 3, 4, 5, 6, 1 }
		};

		double hoursSum;

		// sum hours in a column
		for (int rowIndex = 0; rowIndex < workHours.length; rowIndex++) {
			
			hoursSum = sumRow(workHours, rowIndex);
		
			// and create an employee object with the sum
			employees.add(new Employee("Employee" + rowIndex, hoursSum));
		}

		// sort in ascending order
		Collections.sort(employees);
		// reverse the list to get descending order
		Collections.reverse(employees);

		// print result
		System.out.println("\tEmloyees sorted by working hours:\n");
		for (Employee e : employees) {
			System.out.println(e);
		}

	}
	
	/** Sums elements of forwarded row */
	public static double sumRow(double[][] m, int rowIndex) {

		double rowSum = 0;
		
		// sum elements of the row
		for(int columnIndex = 0; columnIndex < m[0].length; columnIndex++){
			rowSum += m[rowIndex][columnIndex];
		}
		
		return rowSum;
	}
}

/** Class which represents employee */
class Employee implements Comparable<Employee> {
	
	public String name;
	public double hours;

	// constructor
	Employee(String name, double hours) {
		this.name = name;
		this.hours = hours;
	}

	// implementation of the Comparable interface
	@Override
	public int compareTo(Employee e) {
		
		if (this.hours > e.hours)
			return 1;
		else
			return -1;
	}
	
	@Override
	public String toString(){
		return "\t" + name + "\t" + hours;
	}

}
