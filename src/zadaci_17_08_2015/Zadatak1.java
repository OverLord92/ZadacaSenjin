package zadaci_17_08_2015;

import java.util.Date;
import java.util.Scanner;

/**
 * 11.1 (The Triangle class) Design a class named Triangle that extends
 * GeometricObject.
 */

public class Zadatak1 {

	/** Test program */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter tree sides of the triangle: ");
		Triangle tr = new Triangle(input.nextDouble(), input.nextDouble(), input.nextDouble());
		System.out.print("The color od the triangle? ");
		tr.setColor(input.next());
		System.out.print("Is the triangle filled(true or false)? ");
		tr.setFilled(input.nextBoolean());
		
		System.out.printf("\ntr area: %.4f\n", tr.getArea());
		System.out.println("tr perimeter: " + tr.getPerimeter());
		System.out.println("tr color: " + tr.getColor());
		System.out.println("tr isFilled? " + tr.isFilled());
		
		input.close();
	}

}

/** sub class */
class Triangle extends GeometricObject {
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;

	Triangle() {

	}

	Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	Triangle(String color, boolean isFilled, double side1, double side2, double side3) {
		super(color, isFilled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	//geteri i seteri za strainice 
	
	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	/** Metoda koja vraca povrsinu trougla */
	public double getArea() {
		double s = getPerimeter() / 2;

		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	/** Metoda koja vraca obim trougla */
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	/** Overrajdovana to string metoda */
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = "
				+ side3;
	}

}

/** super class */
class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	public GeometricObject() {
		dateCreated = new Date();
	}

	/** Konstruktor */
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	
	// geteri i seteri
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color
				+ " and filled: " + filled;
	}
}
