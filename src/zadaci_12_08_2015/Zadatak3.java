package zadaci_12_08_2015;

/**
 * Zadatak 10.4 Design a class named MyPoint to represent a point with x- and
 * y-coordinates.
 */

public class Zadatak3 {

	/** test program */
	public static void main(String[] args) {

		MyPoint point1 = new MyPoint();

		MyPoint point2 = new MyPoint(10, 30.5);

		System.out.printf("The distance between point1 and point2 is: %.4f",
				point1.distance(point2));

	}

}

/** Klasa za racunanje rastojanja izmedju tacaka */
class MyPoint {

	// koordinate tacke
	double x = 0, y = 0;

	// konstruktori
	public MyPoint() {

	}

	// konstruktor sa specificnim x i y
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/** Metoda za racunanje razmaka izmedju dva MyPoint-a */
	public double distance(MyPoint point) {

		return Math.sqrt(Math.pow(point.x - this.x, 2)
				+ Math.pow(point.y - this.y, 2));
	}

	/**
	 * MEtoda koja racuna rastojanje izmedju MyPoint objekta i tacke odredjenih
	 * koordinata
	 */
	public double distance(double x, double y) {
		return this.distance(new MyPoint(x, y));
	}
}
