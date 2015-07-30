package zadaci_30_07_2015;

import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese dva cijela, pozitivna broja te
 * ispisuje najveći i najmanji zajednički djelilac za ta dva broja.
 */

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num1, num2;

		// gcd - najveci zajednicki djelilac
		int gcd = 1;
		
		// scd - najmanji zajednicki djelilac
		int scd = 1;

		// korisnik unosi brojeve
		System.out.print("Enter first number: ");
		num1 = input.nextInt();

		System.out.print("Enter second number: ");
		num2 = input.nextInt();
		
		
		// racunanje najveceg zajednickog djelioca
		for (int i = 2; i <= num1 && i <= num2; i++) {
			
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
			
		}

		// racunanje najmanjeg zajednickog djelioca
		for (int i = 2; i <= num1 && i <= num2; i++) {

			if (num1 % i == 0 && num2 % i == 0) {
				scd = i;
				break;
			}

		}

		
		// printanje rezultata
		if(scd == 1 && gcd == 1){
			System.out.println("The entered numbers dont have a common dividor.");
		}
		
		else if(scd == gcd){
			System.out.println("The greatest an the smallest common dividor is " + scd + ".");
		}else{
			System.out.println("The smallest common dividor is " + scd 
					+ ",\n and the greatest common dividor is " + gcd + ".");
		}
		

		input.close();

	}

}
