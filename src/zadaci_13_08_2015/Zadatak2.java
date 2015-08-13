package zadaci_13_08_2015;

/** ***10.12 (Geometry: the Triangle2D class) Define the Triangle2D class */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import PomocneKlase.IntersectingSegments;
import PomocneKlase.MyPoint;

public class Zadatak2 {

	/** Test program */
	public static void main(String[] args) {

		// kreiramo triangle objekat
		Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2),
				new MyPoint(4.2, 3), new MyPoint(5, 3.5));

		// provjeravamo da li trougao sadrzi tacku
		System.out.println("t1 contains (3,3)?  " + t1.contains(new MyPoint(3, 3)));

		// provjeracamo da li trougao t1 sadrzi dati trougao
		System.out.println("t1 contains triangle: (2.9,2), (4,1), (1, 3.4)? " + t1.contains(new Triangle2D(new MyPoint(2.9, 2),
				new MyPoint(4, 1), new MyPoint(1, 3.4))));
		
		// provjeravamo da li se trougao t1 pokplapa sa datim trouglom
		System.out.println("t1 overlap triangle: (2,5.5), (4,-3), (2, 6.5)? " + t1.overlaps(new Triangle2D(new MyPoint(2, 5.5),
				new MyPoint(4, -3), new MyPoint(2, 6.5))));

	}

}

class Triangle2D {

	private MyPoint p1;
	private MyPoint p2;
	private MyPoint p3;

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
		this.p1 = new MyPoint(0, 0);
		this.p2 = new MyPoint(1, 1);
		this.p3 = new MyPoint(2, 5);

	}

	Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	/** Metoda koja vraca povrsinu trougla */
	public double getTriangleArea() {
		// varijable za stranice
		double side1, side2, side3;

		// koristimo metodu distane iz MyPoint klase kako bi izracunali
		// duzinu stranica
		side1 = p1.distance(p2);
		// System.out.println(side1);
		side2 = p1.distance(p3);
		// System.out.println(side2);
		side3 = p2.distance(p3);
		// System.out.println(side3);

		// duzine stranica smjestamo u listu kako bi ih sortirali
		List<Double> sides = Arrays.asList(side1, side2, side3);
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

	/** MEtoda koja provjerava da li se tacka nalazi unutar trougla */
	public boolean contains(MyPoint p) {

		
		// ako se tacka nalazi unutar trougla onda je zbir povrsina tri
		// "podtrougla" p-p1-p2, p-p1-p3, p-p2-p3 jedana povrsini
		// trougla p1-p2-p3
		double mainArea = this.getTriangleArea();

		// racunanje povrsine prvog podtrougla
		Triangle2D subTrianlge12 = new Triangle2D(p, p1, p2);
		double subArea12 = subTrianlge12.getTriangleArea();

		// racunanje povrsine drugog podtrougla
		Triangle2D subTrianlge13 = new Triangle2D(p, p1, p3);
		double subArea13 = subTrianlge13.getTriangleArea();

		// racunanje povrsine treveg podtrougla
		Triangle2D subTrianlge23 = new Triangle2D(p, p2, p3);
		double subArea23 = subTrianlge23.getTriangleArea();

		// uslov koji pokazuje da li je tacka u trouglu
		return Math.abs(mainArea - subArea12 - subArea13 - subArea23) < 0.001;

	}

	/** Metoda koja provjerava da li se trougao nalazi unutar drugog trougla */
	public boolean contains(Triangle2D t) {
		// ako se sve tri tacke datog trougla t nalaze unutar trougla this onda se 
		// this sadrzi t trougao
		return this.contains(t.p1) && this.contains(t.p2)
				&& this.contains(t.p3);

	}

	/** Metoda koja provjerava da li se trouglovi poklapaju */
	public boolean overlaps(Triangle2D t) {

		// a1, a2, i a3 su stranice prvog trougla
		// b1, b2, i b3 su stranice drugog trougla

		// ako se bilo koje od ovih 6 stranica sijeku trouglovi se prekpalaju
		// i metoda vraca true

		// koristimo klasu koja radi sa duzima iz paketa pomocneKlase
		
		// da li se sijeku a1 i b1?
		IntersectingSegments a1b1 = new IntersectingSegments(this.p1, this.p2,
				t.p1, t.p2);
		if (a1b1.areSegmentsIntersecting())
			return true;
		
		// da li se sijeku a1 i b2?
		IntersectingSegments a1b2 = new IntersectingSegments(this.p1, this.p2,
				t.p2, t.p3);
		if (a1b2.areSegmentsIntersecting())
			return true;
		
		// da li se sijeku a1 i b3?
		IntersectingSegments a1b3 = new IntersectingSegments(this.p1, this.p2,
				t.p1, t.p3);
		if (a1b3.areSegmentsIntersecting())
			return true;
		
		
		// da li se sijeku a2 i b1?
		IntersectingSegments a2b1 = new IntersectingSegments(this.p2, this.p3,
				t.p1, t.p2);
		if (a2b1.areSegmentsIntersecting())
			return true;
		
		// da li se sijeku a2 i b2?
		IntersectingSegments a2b2 = new IntersectingSegments(this.p2, this.p3,
				t.p2, t.p3);
		if (a2b2.areSegmentsIntersecting())
			return true;
		
		// da li se sijeku a2 i b3?
		IntersectingSegments a2b3 = new IntersectingSegments(this.p2, this.p3,
				t.p1, t.p3);
		if (a2b3.areSegmentsIntersecting())
			return true;
		

		// da li se sijeku a3 i b1?
		IntersectingSegments a3b1 = new IntersectingSegments(this.p1, this.p3,
				t.p1, t.p2);
		if (a3b1.areSegmentsIntersecting())
			return true;
		
		// da li se sijeku a3 i b2?
		IntersectingSegments a3b2 = new IntersectingSegments(this.p1, this.p3,
				t.p2, t.p3);
		if (a3b2.areSegmentsIntersecting())
			return true;
		
		// da li se sijeku a3 i b3?
		IntersectingSegments a3b3 = new IntersectingSegments(this.p1, this.p3,
				t.p1, t.p3);
		if (a3b3.areSegmentsIntersecting())
			return true;

		return false;

	}
}
