package zadaci_22_08_2015;

/** *12.24 (Create large dataset) Create a data file with 1,000 lines. Each line in the file
 consists of a faculty member’s first name, last name, rank, and salary. The
 faculty member’s first name and last name for the ith line are FirstNamei and
 LastNamei. The rank is randomly generated as assistant, associate, and full.
 The salary is randomly generated as a number with two digits after the decimal
 point. The salary for an assistant professor should be in the range from 50,000
 to 80,000, for associate professor from 60,000 to 110,000, and for full professor
 from 75,000 to 130,000. Save the file in Salary.txt. Here are some sample data:
 FirstName1 LastName1 assistant 60055.95
 FirstName2 LastName2 associate 81112.45
 . . .
 FirstName1000 LastName1000 full 92255.21 */
 

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Zadatak5OOP {

	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<Employee> listaZaposlenih = new ArrayList<>();
		
		// fajl u koji printamo spisak
		File file = new File(
				"C:\\Users\\pvc\\git\\ZadacaSenjin\\src\\zadaci_22_08_2015\\largeFileZadatak5.txt");
		PrintWriter pw = new PrintWriter(file);
		try {
			// ukoliko ne postoji fajl pod datim imenom kreiramo fajl
			if (!file.exists()) {
				file.createNewFile();
			}

			// printam 1000 puta profesore sa proizvoljnim zvanjem i
			// odgovarajucim platama
			for (int i = 1; i <= 1000; i++) {

				// generisanje first i last name
				String firstName = "FirstName" + i;
				String lastName = "LastName" + i;
				
				Employee employee = new Employee(firstName, lastName);
				listaZaposlenih.add(employee);
				
				// printanje podataka zapsolenog u fajl
				pw.print(employee.toString() + "\n");
			}
			pw.close();
		} catch (IOException e) {
			System.out.println("Nastali su problemi tokom upisivanja u fajl.");
		}

	}

}

class Employee {
	// niz sa zvanjem profesora
	private static String[] ranks = { "assistant", "associate", "full" };
	// niz sa donjim granicama plata
	private static double[] lowerLimit = { 50_000, 60_000, 75_000 };
	// niz sa razlikom gornje i donje granice plate
	private static double[] difference = { 30_000, 50_000, 55_000 };

	private String firstName;
	private String lastName;
	private String rank;
	private double sallary;

	/**
	 * Konstruktor koji generice objekat sa zadatim prvim i zadnjim imenom, i
	 * proizvoljnim rankom i platom
	 */
	public Employee(String firstName, String lastName) {

		int chooseRank = (int) (Math.random() * 3);

		this.firstName = firstName;
		this.lastName = lastName;
		this.rank = ranks[chooseRank];
		// parovanje plate iz stringa u double
		this.sallary = lowerLimit[chooseRank] + Math.random()
				* difference[chooseRank];
	}
	
	public String toString(){
		return firstName + " " + lastName + " " + rank + " " + sallary;
	}

}
