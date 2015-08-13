package PomocneKlase;

/** Klasa za racunanje rastojanja izmedju tacaka */
public class MyPoint {

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
