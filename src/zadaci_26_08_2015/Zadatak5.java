package zadaci_26_08_2015;

import java.util.Arrays;

/**
 * *13.13 (Enable the Course class cloneable) Rewrite the Course class in
 * Listing 10.6 to add a clone method to perform a deep copy on the students
 * field.
 */

public class Zadatak5 {

	/** Kratki test rpogram */
	public static void main(String[] args) {
		
		Course c1 = new Course("Matematika");
		c1.addStudent("Tamagochi");
		c1.addStudent("NekoMakoSako");
		c1.addStudent("Aristotel");
		
		Course c2 = (Course)c1.clone();
		c2.dropStudent("Aristotel");
		
		
		System.out.println("\tUcenici prvog kursa:");
		String[] c1Students = c1.getStudents();
		for(int i = 0; i < c1.getNumberOfStudents(); i++){
			System.out.println("\t\t" + c1Students[i]);
		}
		
		System.out.println("\n	Ucenici drugog kursa:");
		String[] c2Students = c2.getStudents();
		for(int i = 0; i < c2.getNumberOfStudents(); i++){
			System.out.println("\t\t" + c2Students[i]);
		}

	}

}

class Course implements Cloneable{
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	/** Metoda koja izbacuje studenta iz kursa */
	public void dropStudent(String student) {
		
		if(!Arrays.asList(students).contains(student)){
			System.out.println("Ime studenta koje ste unjeli ne pohadja ovaj kurs.");
		return;
		}
		
		int i;
		// trazimo index po kojim se student nalazi
		for(i = 0; i < numberOfStudents; i++){
			if(student.equals(students[i]))
			break;
		}
		
		// sve studente poslije njega pomjeramo za jedno mjesto lijevo
		for(int j = i; j < numberOfStudents; j++){
			students[j]  = students[j + 1];
		}
		
		// smanjujemo broj studenata
		numberOfStudents--;
	}
	
	/** Implementacija Cloneable interfejsa. Metoda vrsi deep copy objekta Course */
		public Object clone(){
			
		Course clone = new Course(new String(this.courseName));
		clone.students = new String[100];
		
		for(int i = 0; i < this.numberOfStudents; i++){
			clone.students[i] = new String(this.students[i]);	
		}
		
		clone.numberOfStudents = this.numberOfStudents;
		
		return clone;
	}
}
