package zadaci_24_08_2015;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * *12.25 (Process large dataset) A university posts its employees’ salaries at
 * http:// cs.armstrong.edu/liang/data/Salary.txt. Each line in the file
 * consists of a faculty member’s first name, last name, rank, and salary (see
 * Programming Exercise 12.24). Write a program to display the total salary for
 * assistant professors, associate professors, full professors, and all faculty,
 * respectively, and display the average salary for assistant professors,
 * associate professors, full professors, and all faculty, respectively.
 * 
 * 
 * 
 * Prvi zadatak rjesen koristeci OO pristup.
 * Jednostavnije rjesenje se nalazi u Zadatak1
 */

public class Zadatak1OOP {

	public static void main(String[] args) {

		URL url;
		try {
			// objekat sa urlom stranice sa koje citamo podatke
			url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
			Scanner input = new Scanner(url.openStream());

			// brojac i suma za asistente
			int assistantCount = 0;
			double assistantSum = 0;

			// brojac i suma za associate
			int associateCount = 0;
			double associateSum = 0;

			// brojac i suma za full
			int fullCount = 0;
			double fullSum = 0;

			while (input.hasNextLine()) {

				// kreiramo objekat emloyee sa podacima u trenutnoj liniji
				Employee employee = new Employee(input.next(), input.next(),
						input.next(), input.next());

				// pomocu switcha brojimo profesore pojedinik rangova i racunamo
				// sumu plata
				switch (employee.getRank()) {
				case "assistant": {
					assistantCount++;
					assistantSum += employee.getSallary();
				}
					;
					break;
				case "associate": {
					associateCount++;
					associateSum += employee.getSallary();
				}
					;
					break;
				case "full": {
					fullCount++;
					fullSum += employee.getSallary();
				}
				}
			}

			// printanje rezultata za pojedine rangove
			
			// assistant
			System.out.printf("Zbir plata asistenata je: %.2f \n",
					assistantSum);
			double assistantAverrage = assistantSum / assistantCount;
			System.out.printf("Prosjek plate asistenta je: %.2f \n\n",
					assistantAverrage);

			// associate
			System.out.printf("Zbir plata associate je: %.2f \n",
					associateSum);
			double associateAverrage = associateSum / associateCount;
			System.out.printf("Prosjek plate associate je: %.2f \n\n",
					associateAverrage);

			// full
			System.out.printf("Zbir plata full profesora je: %.2f \n",
					fullSum);
			double fullAverrage = fullSum / fullCount;
			System.out.printf("Prosjek plate full proesora je: %.2f \n",
					fullAverrage);

			
			// printanje ukupnih rezultata
			int countAll = assistantCount + associateCount + fullCount;
			double sumAll = assistantSum + associateSum + fullSum;
			
			System.out.printf("\nUkupan zbir plata svih je: %.2f \n",
					sumAll);
			double averrageAll = sumAll / countAll;
			System.out.printf("Prosjecna plata profesora je: %.2f \n",
					averrageAll);

			input.close();

			// Exception handeling
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class Employee {

	private String firstName;
	private String lastName;
	private String rank;
	private double sallary;

	/** Vraca rank profesora */
	public String getRank() {
		return rank;
	}

	/** Vraca platu prosfesora */
	public double getSallary() {
		return sallary;
	}

	/** Konstruktor koji uzima cetiri stringa kao argumente */
	public Employee(String firstName, String lastName, String rank,
			String sallary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.rank = rank;
		// parovanje plate iz stringa u double
		this.sallary = Double.parseDouble(sallary);
	}

}
