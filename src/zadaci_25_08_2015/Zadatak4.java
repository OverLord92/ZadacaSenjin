package zadaci_25_08_2015;

import PomocneKlase.Circle;

/**
 * *13.7 (The Colorable interface) Design an interface named Colorable with a
 * void method named howToColor(). Every class of a colorable object must
 * implement the Colorable interface. Design a class named Square that extends
 * GeometricObject and implements Colorable. Implement howToColor to display the
 * message Color all four sides. Draw a UML diagram that involves Colorable,
 * Square, and GeometricObject. Write a test program that creates an array of
 * five GeometricObjects. For each object in the array, display its area and
 * invoke its howToColor method if it is colorable.
 * 
 * Circle i Square sam implementirao kao PomocneKlase.GeoemtricObject > Circle i
 * kao PomocneKlase.GeometricObject > Square
 */

public class Zadatak4 {
	public static void main(String[] args) {

		// punimo arrayj sa GeoemtricObjectima
		PomocneKlase.GeometricObject[] objects = new PomocneKlase.GeometricObject[5];
		objects[0] = new Circle(5);
		objects[1] = new Square(5);
		objects[2] = new Circle(7);
		objects[3] = new Square(4);
		objects[4] = new Square(7);

		// printanje povrsine objekata i howToColor metode ukoliko
		// objekata implementira Colorable interfejs
		for (int i = 0; i < objects.length; i++) {
			System.out.print(objects[i].getArea() + "\t");

			if (objects[i] instanceof Colorable) {
				((Colorable) objects[i]).howToColor();
			} else
				System.out.println();
		}
	}

}

/** Klasa Square */
class Square extends PomocneKlase.GeometricObject implements Colorable {
	private double side;

	public Square(double side) {
		this.side = side;
	}

	@Override
	/** Implementacija Colorable interfejsa */
	public void howToColor() {
		System.out.println("Color all four sides.");
	}

	@Override
	/** Metoda za racunanje povrsine kvadrata */
	public double getArea() {
		return side * side;
	}

	@Override
	/** Metoda za racunanje obima kvadrata */
	public double getPerimeter() {
		return side * 4;
	}

	public String toString() {
		return getArea() + "";
	}

}
