package zadaci_27_08_2015;

import java.util.Scanner;

/**
 * *13.17 (Math: The Complex class) A complex number is a number in the form a +
 * bi, where a and b are real numbers and i is 2-1. The numbers a and b are
 * known as the real part and imaginary part of the complex number,
 * respectively.
 */

public class Zadatak4 {

	/** Test program */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// korisnik upisuje dva kompleksna broja
		System.out.print("Unesite prvi kompleksni broj: ");
		Complex c1 = new Complex(input.nextDouble(), input.nextDouble());

		System.out.print("Unesite drugi kompleksni broj: ");
		Complex c2 = new Complex(input.nextDouble(), input.nextDouble());

		// program printa rezultate operacija unjetim kompleksnim brojevima
		System.out.println(c1 + " + " + c2 + " = " + c1.add(c2));
		System.out.println(c1 + " - " + c2 + " = " + c1.subtract(c2));
		System.out.println(c1 + " * " + c2 + " = " + c1.multiply(c2));
		System.out.println(c1 + " / " + c2 + " = " + c1.divide(c2));
		System.out.println("|" + c1 + "| = " + c1.abs());
	}

}

class Complex implements Cloneable {
	private double a;
	private double b;

	/** No arg konstruktor */
	Complex() {
		this(0, 0);
	}

	/** Konstruktor koji desinise samo realni dio broja */
	Complex(double a) {
		this.a = a;
		this.b = 0;
	}

	/** Kontruktor koji definise i realni i imaginarni dio kompleksnog broja */
	Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}

	/** vraca realni dio broja */
	public double getRealPart() {
		return a;
	}

	/** vraca imaginarni dio broja */
	public double getImaginaryPart() {
		return b;
	}

	/**
	 * Metoda koja vraca novi kompleksni broj, koji je jenak zbiru proslijedjena
	 * dva broja
	 */
	public Complex add(Complex c1) {
		return new Complex(this.a + c1.a, this.b + c1.b);
	}

	/**
	 * Metoda koja vraca novi kompleksni broj, koji je jenak razlici
	 * proslijedjena dva broja
	 */
	public Complex subtract(Complex c1) {
		return new Complex(this.a - c1.a, this.b - c1.b);
	}

	/**
	 * Metoda koja vraca novi kompleksni broj, koji je jenak prozivodu
	 * proslijedjena dva broja
	 */
	public Complex multiply(Complex c1) {
		double realPart = this.a * c1.a - this.b * c1.b;
		double imaginaryPart = this.b * c1.a + this.a * c1.b;
		return new Complex(realPart, imaginaryPart);
	}

	/**
	 * Metoda koja vraca novi kompleksni broj, koji je jenak djeljenju
	 * proslijedjena dva broja
	 */
	public Complex divide(Complex c1) {

		double dividor = this.a * this.a + c1.b * c1.b;

		double realPart = (this.a * c1.a + this.b * c1.b) / dividor;
		double imaginaryPart = (this.b * c1.a - this.a * c1.b) / dividor;
		return new Complex(realPart, imaginaryPart);

	}

	/** Metoda koja vraca apsolutnu vrijednost kompleksnog broja */
	public double abs() {
		return Math.sqrt((a * a) + (b * b));
	}

	/** Metoda koja vraca String prezentaciju kompleksnog broja */
	public String toString() {
		if (b == 0)
			return a + "";
		else
			return "(" + a + " + " + b + "i)";
	}

	/** Implementacija Cloeanble interfejsa */
	public Complex clone() {
		return new Complex(this.a, this.b);
	}
}
