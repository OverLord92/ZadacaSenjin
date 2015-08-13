package zadaci_13_08_2015;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import PomocneKlase.MyPoint;

public class Zadatak2 {

	public static void main(String[] args) {

	}

}

class Triangle2D {
	private MyPoint p1 = new MyPoint(0, 0);
	private MyPoint p2 = new MyPoint(1, 1);
	private MyPoint p3 = new MyPoint(2, 5);

	public MyPoint getP1() {
		return p1;
	}

	public void setP1(MyPoint p1) {
		this.p1 = p1;
	}

	public MyPoint getP2() {
		return p2;
	}

	public void setP2(MyPoint p2) {
		this.p2 = p2;
	}

	public MyPoint getP() {
		return p3;
	}

	public void setP(MyPoint p3) {
		this.p3 = p3;
	}

	Triangle2D() {

	}

	Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {

	}

	/** Metoda koja vraca povrsinu trougla */
	public double getTriangleArea() {
		// varijable za stranice
		double side1, side2, side3;

		// koristimo metodu distane iz MyPoint klase kako bi izracunali
		// duzinu stranica
		side1 = p1.distance(p2);
		side2 = p1.distance(p3);
		side3 = p2.distance(p3);

		// duzine stranica smjestamo u listu kako bi ih sortirali
		List<Double> sides = Arrays.asList(side1, side3, side3);
		Collections.sort(sides);

		// provjeravamo da li je najveca stranica veca od zbira manje dvije
		// sto je sulov za "izvodljivost" trougla
		// ako su tacke na istoj pravoj mjetoda vraca povrsinu 0
		if (sides.get(2) >= sides.get(0) + sides.get(1)) {
			return 0;
		}

		// racunanje poluobima koji se koristi za racunanje povrsine trougla
		double s = (side1 + side2 + side3) / 2;

		// racunanje povrsine
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

		// printanje rezultata
		return area;

	}

	/** Metoda koja racuna obim trougla */
	public double getPerimeter() {
		
		return p1.distance(p2) + p1.distance(p3) + p2.distance(p3);
	}
	
	/** MEtoda koja provjerava da li se tacka nalazi unutar trougla*/
//	public boolean contains(MyPoint p){
//		
//	}

}
