package zadaci_27_07_2015;

import java.util.Scanner;

/**
 * Great circle distance predstavlja udaljenost između dvije tačke na površine
 * sfere. Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku širinu i dužinu
 * dvije tačke. Great circle distance između ove dvije tačke može biti
 * izračunata koristeći se sljedećom formulom: d = radius * arccos (sin(x1) X
 * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)). Napisati program koij pita
 * korisnika da unese geografsku širinu i dužinu u stepenima dvije tačke na
 * površini zemlje te mu ispisuje great circle distance. Prosječni radius zemlje
 * je 6.371.01 km. Stepene koje korisnik unese trebamo promijeniti u radianse
 * koristeći se Math.toRadians metodom jer Java trigonometrijske metode koriste
 * radianse. Širina i dužina u ovoj formuli se odnose na zapad i sjever.
 * Koristimo negativne vrijednosti da označimo istok i jug.
 */

public class Zadatak2 {

	// poluprecnik zemlje definisan kao konstanta
	public static final double RADIUS = 6_371.01;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double x1, y1, x2, y2, distance;

		// korisnik unosi geografsku sirinu i duzinu prve tačke
		System.out.println("Unesite geografsku sirinu i duzinu prve tacke: ");
		x1 = input.nextDouble();
		x1 = Math.toRadians(x1);

		y1 = input.nextDouble();
		y1 = Math.toRadians(y1);

		// korisnik unosi geografsku sirinu i duzinu druge tačke
		System.out.println("Unesite geografsku sirinu i duzinu druge tacke: ");
		x2 = input.nextDouble();
		x2 = Math.toRadians(x2);

		y2 = input.nextDouble();
		y2 = Math.toRadians(y2);

		// formula za racunanje rastojanja izmedju tačaka
		distance = RADIUS
				* Math.acos((Math.sin(x1) * Math.sin(x2))
						+ (Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));
		
		// printanje rezultata
		System.out.printf("Rastojanje između tačaka je: %.4f km.", distance);
		
		input.close();

	}

}
