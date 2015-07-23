package zadaci_23_07_2015;

import java.util.Scanner;

/**
 * Napisati program koji učitava neodređeni broj cijelih brojeva (nula prekida
 * unos) te ispisuje koliko je brojeva bilo iznad ili jednako prosjeku svih
 * unešenih brojeva a koliko je bilo brojeva ispod prosjeka. Pretpostavimo da je
 * maksimalan niz brojeva koje korisnik može unijeti 100.
 */

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out
				.println("Unesite brojeve. Unosom nule prekidate daljni unos: ");
		Scanner input = new Scanner(System.in);
		
		//Unesene brojeve smjestamo  u niz
		double[] niz = new double[100];
		int brojac = 0;
		double unos = input.nextDouble();
		
		while ((unos != 0) || (brojac == 100)) {
			niz[brojac] = unos;
			brojac++;
			unos = input.nextDouble();
		}

		//racunanje prosjeka
		double sum = 0;
		for (int i = 0; i < brojac; i++) {
			sum += niz[i];
		}

		double average = sum / brojac;

		int iznad = 0;
		int ispod = 0;

		//brojanje clanova niza koji su iznad ili ispod prosjeka
		for (int i = 0; i < brojac; i++) {
			if (niz[i] > average) {
				iznad++;
			} else {
				ispod++;
			}
		}
		
		//printanje rezultata
		System.out.printf("Prosjek unesenih brojeva je %-7.2f\n", average);
		System.out.println("Unjeli ste " + brojac + " brojeva od kojih je: ");
		System.out.println("  - " + ispod + " ispod prosjeka, a");
		System.out.println("  - " + iznad + " iznad prosjeka.");
		input.close();
	}

}
