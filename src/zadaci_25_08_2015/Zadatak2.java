package zadaci_25_08_2015;

import java.util.Date;

/**
 * *13.5 (Enable GeometricObject comparable) Modify the GeometricObject class to
 * implement the Comparable interface, and define a static max method in the
 * GeometricObject class for finding the larger of two GeometricObject objects.
 */

public class Zadatak2 {
	public static void main(String[] args) {
	}
}

abstract class GeometricObject implements Comparable<GeometricObject> {
	private String color = "white";
	private boolean filled = false;
	private Date dateCreated;

	/** Construct a default geometric object */
	protected GeometricObject() {
		dateCreated = new Date();
	}

	/** Construct a geometric object with color and filled value */
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new Date();
		this.color = color;
		this.filled = filled;
	}

	/** Return color */
	public String getColor() {
		return color;
	}

	/** Set a new color */
	public void setColor(String color) {
		this.color = color;
	}

	/** Return filled */
	public boolean isFilled() {
		return filled;
	}

	/** Set a new filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** Return dateCreated */
	public Date getDateCreated() {
		return dateCreated;
	}

	/** Abstract method getArea */
	public abstract double getArea();

	/** Abstract method getPerimeter */
	public abstract double getPerimeter();
	

	// implementacija compareTo i max metode

	/** Metoda koja uporedjuje 2 geometricObject-a kotisteci njihovu povrsinu */
	public int compareTo(GeometricObject go) {
		if (this.getArea() > go.getArea())
			return 1;
		else if (this.getArea() < go.getArea())
			return -1;
		else
			return 0;
	}

	/** Metoda koja vraca veci od dva prosliejedjena GeometricObject-a.
	 * Za poredjenje koristi povrsinu. */
	public static GeometricObject max(GeometricObject go1, GeometricObject go2) {
		if (go1.compareTo(go2) == 1)
			return go1;
		else
			return go2;
	}
}
