package zadaci_26_08_2015;

import PomocneKlase.GeometricObject;

/**
 * *13.12 (Sum the areas of geometric objects) Write a method that sums the
 * areas of all the geometric objects in an array. The method signature is:
 * public static double sumArea(GeometricObject[] a)
 */

public class Zadatak4 {

	/** Kratki test program */
	public static void main(String[] args) {

		GeometricObject[] a = new GeometricObject[4];

		a[0] = new Circle(5);
		a[1] = new Circle(6);
		a[2] = new Rectangle(0, 0, 3, 4);
		a[3] = new Rectangle(0, 0, 6, 7);
		
		System.out.println(sumArea(a));

	}

	public static double sumArea(GeometricObject[] a) {

		double areaSum = 0;

		for (int i = 0; i < a.length; i++) {
			areaSum += a[i].getArea();
		}

		return areaSum;
	}

}
