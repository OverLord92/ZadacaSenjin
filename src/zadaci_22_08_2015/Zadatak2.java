package zadaci_22_08_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * **12.18 (Add package statement) Suppose you have Java source files under the
 * directories chapter1, chapter2, . . . , chapter34. Write a program to insert
 * the statement package chapteri; as the first line for each Java source file
 * under the directory chapteri. Suppose chapter1, chapter2, . . . , chapter34
 * are under the root directory srcRootDirectory. The root directory and
 * chapteri directory may contain other folders and files. Use the following
 * command to run the program: java Exercise12_18 srcRootDirectory
 */

public class Zadatak2 {

	public static void main(String[] args) {

		
		String fileName = args[0].trim();
		File file = new File(fileName);
		
		
		File[] files = file.listFiles();

		// za svaki fajl u root folderu pozivamo traverse metodu
		for (int i = 0; i < files.length; i++) {
			
			// string koji dodajemo na fajlove kao naziv paketa
			String packageName = files[i].getName();
			
			traverseFile(files[i], packageName);
		}

	}

	/**
	 * Metoda koja pomocu rekurzije prolazi kroe sve foldere i fajlove i za
	 * svaki java fajl poziva addPackageDeclaration()
	 */
	public static void traverseFile(File file, String packageName) {

		// ukoliko je fajl folder rastavljamo ga u niz
		if (file.isDirectory()) {
			
			File[] files = file.listFiles();
			// i za svaki fajl u nizu pozivamo traverse metodu
			for (int i = 0; i < files.length; i++)
				traverseFile(files[i], packageName);
			
			// ukoliko je fajl datoteka, provjeravamo koristeci regex
			// da li se radi o java fajlu
		} else if (file.getName().matches(".*.java")) // base case
			// ako je java fajl dodajemo naziv paketa na pocetku fajla
			addPackageDeclaration(file, packageName);

	}

	/**
	 * Metoda kojoj proslijedjujemo fajl i naziv paketa metoda na pocetku fajla
	 * dodaje text "package packageName;" "
	 */
	public static void addPackageDeclaration(File file, String packageName) {

		StringBuilder sb = new StringBuilder();

		// u stringbuilder dodajemo liniju package name;
		sb.append("package " + packageName + ";");
		// iz nekog razloga "\n" nije prebacivalo u sljedeci red
		// pa sam koristio System.lineSeparator()
		sb.append(System.lineSeparator());
		// u stringbuilder dodajemo sadrzaj iz fajla
		Scanner fileInput = null;
		try {
			fileInput = new Scanner(file);
			while (fileInput.hasNextLine()) {
				sb.append(fileInput.nextLine());
			}
			// printamo sadrzaj s fajla zajedno za package deklaracijom u fajl
			PrintWriter pw = new PrintWriter(file);
			pw.print(sb.toString());
			pw.close();

			// printanje poruke ukoliko fajl ne postoji ili je doslo do neke
			// druge greske
		} catch (FileNotFoundException e) {
			System.out.println("Ne postoji datoteka pod tim imenom.");
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}
	}

}
