package zadaci_25_08_2015;

import PomocneKlase.Circle;

/**
 * *13.6 (The ComparableCircle class) Define a class named ComparableCircle that
 * extends Circle and implements Comparable. Draw the UML diagram and implement
 * the compareTo method to compare the circles on the basis of area. Write a
 * test class to find the larger of two instances of ComparableCircle objects.
 * 
 * Klase GeoemtricObject i Circle se nalaze u paketu PomocneKlase
 */


public class Zadatak3 {

	/** Kratak test program */
	public static void main(String[] args) {

		ComparableCircle c1 = new ComparableCircle(3);
		ComparableCircle c2 = new ComparableCircle(4);

		System.out.println(c1.compareTo(c2));

	}

}

/** Implementacija Comparable interfejsa */
class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

	/** Konstruktor koji poziva konstruktor iz superklase */
	public ComparableCircle(double radius) {
		super(radius);
	}

	/**
	 * Metoda koja poredi dva ComparableCircle objekta koristeci njihovu
	 * povrsinu
	 */
	public int compareTo(ComparableCircle cc) {
		if (this.getArea() > cc.getArea())
			return 1;
		else if (this.getArea() < cc.getArea())
			return -1;
		else
			return 0;
	}

}
