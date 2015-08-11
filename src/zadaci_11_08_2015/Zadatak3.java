package zadaci_11_08_2015;

/** 
 * Design a class named QuadraticEquation for
 * a quadratic equation ax2 + bx + x = 0. 
 */

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite a, b, c kvadratne jednacine: ");

		// kreiranje objekta QuadraticEquation
		QuadraticEquation qe = new QuadraticEquation(input.nextInt(),
				input.nextInt(), input.nextInt());
		// ptintanje rezultata
		qe.printResult();

		input.close();
	}

}

/** Klasa za rjesavanje kvadratne jednacine */
class QuadraticEquation {
	private double a, b, c;

	// konstruktor
	QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	/** Metoda koja vraca podkorjenu velicinu kvadratne jednacine */
	public double getDiscriminant() {
		return Math.pow(b, 2) - 4 * a * c;
	}

	/** Metoda koja vraca prvo rjesenje jendacine */
	public double getRoot1() {
		if (getDiscriminant() < 0) 
			return 0;
		
		return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
		
	}

	/** Metoda koja vraca drugo rjesenje jednacine */
	public double getRoot2() {

		if (getDiscriminant() < 0)
			return 0;

		return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
	}

	/** Printanje rjesenja jednacine */
	public void printResult() {

		if (getDiscriminant() < 0)
			System.out.println("Rjesenja jednacine su konjugovano kompleksna.");
		else if (getDiscriminant() == 0)
			System.out.println("Rjesenje jednacine je: " + getRoot1() + ".");
		else
			System.out.println("Rjesenja jednacine su: " + getRoot1() + " "
					+ getRoot2() + ".");
	}
}
