package zadaci_25_07_2015;

import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese neki string te mu ispisuje sve
 * karaktere koji se nalaze na neparnim pozicijama. Na primjer, ako korisnik
 * unese string Beijing Chicago, program vraća BiigCiao.
 */

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String line, result = "";
		
		//korisnik unosi string
		System.out.println("Enter a string: ");
		line = input.nextLine();
		
		//petla koja prolazi kroz neparne pozicije u stringu
		for(int i = 1; i < line.length(); i+=2){
			if(line.charAt(i) != ' '){
				result += line.charAt(i);
			}
		}
		
		//štampanje rezultata
		System.out.println("The resul string is : " + result + ".");
		
		input.close();

	}

}
