package zadaci_25_07_2015;

import java.util.Scanner;

/**
 * Ako imamo ubrzanje aviona a te brzinu pri kojoj avion uzlijeće v, možemo
 * izračunati minimalnu dužinu piste potrebne da avion uzleti koristeći se
 * sljedećom formulom: dužina = v * v / 2a. Napisati program koji pita korisnika
 * da unese v u m/s i a u m/s² te ispisuje korisniku minimalnu dužinu piste.
 * (Primjer: ukoliko unesemo 60 za brzinu i 3.5 za ubrzanje dužina piste je
 * 514.286)
 */

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double speed, acceleration, length;
		
		//korisnik unosi podatke 
		System.out.print("Enter the required speed: ");
		speed = input.nextDouble();
		
		System.out.print("Enter acceleration: ");
		acceleration = input.nextDouble();
		
		length = calculateLength(speed, acceleration);
		System.out.printf("The required length is %.3f", length);
		input.close();

	}
	
	/** Metoda koja racuna potrebnu duzinu piste. */
	public static double calculateLength(double speed, double acceleration){
		return (speed * speed) / (2 * acceleration);
	}

}
