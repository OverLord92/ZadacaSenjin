package zadaci_13_08_2015;

/** Zadatak 10.11. Define the Circle2D class */

/**
 * Write a test program that creates a Circle2D object 
 * c1 (new Circle2D(2, 2, 5.5)), displays its area and perimeter, 
 * and displays the result of c1.contains(3,3), 
 * c1.contains(new Circle2D(4, 5, 10.5)), and 
 * c1.overlaps(new Circle2D(3, 5, 2.3)). 
 */

import PomocneKlase.MyPoint;

public class Zadatak1 {

	/** Test program */
	public static void main(String[] args) {
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		System.out.println("Area: " + c1.getArea());
		System.out.println("Perimeter: " + c1.getPerimeter());
		System.out.println("c1 contains point (3, 3)? " + c1.contains(3, 3));
		System.out.println("c1 contains circle(4, 5, 10.5)? "
				+ c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println("c1 overlaps circle(3, 5, 2.3)? "
				+ c1.overlaps(new Circle2D(3, 5, 2.3)));

	}

}

class Circle2D {
	private double x = 0;
	private double y = 0;
	private double radius = 1;

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getRadius() {
		return radius;
	}

	Circle2D() {

	}

	Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	/** Metoda koja provjerava da li je tacka unutar kruga */
	public boolean contains(double x, double y) {

		// da bi tacka bila unutar kruga rastojanje tacke od centra kruga mora
		// biti manja od poluprecnika kruga
		MyPoint circleCenter = new MyPoint(this.x, this.y);
		MyPoint pointXY = new MyPoint(x, y);

		// provjeravamo da li je rastojanje manje od polprecnika
		double distance = circleCenter.distance(pointXY);

		return distance <= this.radius;
	}

	/** Metoda koja provjerava da li se Circle2D sadrzi dati krug */
	public boolean contains(Circle2D circle) {

		// kruga ne moze sadrzati ktug koji je veci od njega
		if (this.radius < circle.radius) {
			return false;
		}

		// provejrava da li se tacke 3, 6, 9, 12 kruznice circle
		// nalaze unutar kruga.
		// da bi se krug circle nalazio unutar this kruga sve cetiri
		// ove tacke se moraju nalaziti unuta kruga this
		return this.contains(x, y + circle.radius)
				&& this.contains(x + circle.radius, y)
				&& this.contains(x, y - circle.radius)
				&& this.contains(x - circle.radius, y);

	}

	/** Metoda koja provjerava da li se dva kurga poklapaju */
	public boolean overlaps(Circle2D circle) {
		MyPoint circleCenter1 = new MyPoint(this.x, this.y);
		MyPoint circleCenter2 = new MyPoint(circle.x, circle.y);

		// ako je rastojanje centara kruznica manji od zbira njihovih
		// poluprecnika
		// krugovi se preklapaju
		double distance = circleCenter1.distance(circleCenter2);

		return (distance <= this.radius + circle.radius);
	}

}
