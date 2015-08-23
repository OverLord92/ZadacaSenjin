package zadaci_22_08_2015;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * *12.19 (Count words) Write a program that counts the number of words in
 * President Abraham Lincoln’s Gettysburg address from
 * http://cs.armstrong.edu/liang/data/Lincoln.txt.
 */

public class Zadatak3 {

	public static void main(String[] args) {
		
		// string sa urlom
		String urlName = "http://cs.armstrong.edu/liang/data/Lincoln.txt";
		
		try {
			// url obejakt
			URL url = new URL(urlName);
			int count = 0;
			Scanner input = new Scanner(url.openStream());
			
			// brojanjee rijeci u textu 
			// ova petlja zanemaruje zadnju rijec
			while(input.hasNext()){
				input.next();
				count++;
			}
			
			// printenje rezultata
			System.out.println("Text na unesenom url-u ima " + count + " rijeci.");
			
			input.close();
		} catch (MalformedURLException e) {
			System.out.println("Problem sa URL-om.");
		} catch (IOException e) {
			System.out.println("Problem sa URL-om.");
		}
	}

}
