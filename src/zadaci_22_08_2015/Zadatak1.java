package zadaci_22_08_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * **12.12 (Reformat Java source code) Write a program that converts the Java
 * source code from the next-line brace style to the end-of-line brace style.
 * For example, the following Java source in (a) uses the next-line brace style.
 */

public class Zadatak1 {

	public static void main(String[] args) throws Exception {

		// argument iz komandne linije msjestamo u string fileName
		String fileName = args[0].trim();
		
		// Kreiramo fajl
		File sourceFile = new File(fileName);

		StringBuilder sb = new StringBuilder();
		String currentLine;

		try {

			Scanner fileInput = new Scanner(sourceFile);
			while (fileInput.hasNextLine()) {
				currentLine = fileInput.nextLine();
				// string u koj smejstamo trimovani fajl kako bi originalni
				// String line ostao nepromjenje
				String lineTemp = currentLine.trim();

				// ukoliko je trimovana linija == "{" dodajemo trimovanu
				// liniju u trenutni red
				if (lineTemp.equals("{")) {
					sb.append(" " + lineTemp);
					// ako to nije slucaj prelazimo u sljedeci red i printamo
					// liniju
				} else {
					sb.append("\n" + currentLine);
				}
			}

			// dampujemo StringBuilder sb u fajl
			PrintWriter pw = new PrintWriter(sourceFile);
			pw.print(sb.toString());
			fileInput.close();
			pw.close();

			// ukoliko se pojavi IOEXception ili FileNotFound
			// ispisujemo poruku korisniku
		} catch (FileNotFoundException e) {
			System.out.println("Nepostojeca datoteka");
		}

	}

}
