package zadaci_11_08_2015;

/** 
 * Suppose two line segments intersect. The two endpoints
 * for the first line segment are (x1, y1) and (x2, y2) and for the second line
 * segment are (x3, y3) and (x4, y4). Write a program that prompts the user to enter
 * these four endpoints and displays the intersecting point. 
 */

/**
 * (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1 
 * (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
 */

public class Zadatak5 {

	public static void main(String[] args) {

		IntersectingPoint intersection = new IntersectingPoint(-3, -4, -1, 0, 0, -2, 3, -3);

		// niz u koji smjestamo koordinate tacke presjeka
		double[] result = intersection.getIntersectingPoint();

		// ako je sistem jednacina nerjesiv izbacujemo poruku
		if (result == null) {
			System.out.println("Prave su paralelne. Nemaju tacku presjeka.");
		// ukoliko je sistem jednacina rjesiv program printa koordinate 
		// tacke presjeka
		} else {
			System.out.println("Prave se sjeku u tacci: (" + result[0] + ", "
					+ result[1] + ").");
		}

	}
}

class IntersectingPoint {
	// koordinate tacaka pravih
	private double x1, y1, x2, y2, x3, y3, x4, y4;

	// matrica u koju smjestamo varijable za racunanje sistema jednacina
	double[][] a;
	double[] b;

	// konstruktor
	IntersectingPoint(double x1, double y1, double x2, double y2, double x3,
			double y3, double x4, double y4) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.x4 = x4;
		this.y4 = y4;
	}

	/** Metoda koja vraca koordinate tacke presjeka pravih */
	public double[] getIntersectingPoint() {

		// definisanje matrica koristeci se formulom iz opisa zadatka
		a = new double[2][2];
		a[0][0] = y1 - y2;

		a[0][1] = (x1 - x2);
		if (a[0][1] != 0)
			a[0][1] *= -1;

		a[1][0] = y3 - y4;

		a[1][1] = (x3 - x4);
		if (a[1][1] != 0)
			a[1][1] *= -1;

		b = new double[2];
		b[0] = (y1 - y2) * x1 - (x1 - x2) * y1;
		b[1] = (y3 - y4) * x3 - (x3 - x4) * y3;

		// pozivamo metodu za rjesavanj sistema jednacina
		return linearEquation();
	}

	/** Metoda koja racuna rjesenje sistema jednacina */
	public double[] linearEquation() {

		// ukoliko jednacina nije rjesiva metoda vraca null
		// sto znaci da su prave paralelne
		if (a[0][0] * a[1][1] - a[0][1] * a[1][0] == 0)
			return null;

		// a * d - b * c se korsiti visestruko pa je ta vrijednost dodijeljena
		// varijabli dividor
		double dividor = (a[0][0] * a[1][1] - a[0][1] * a[1][0]);

		// racunanje x-a e * d - b * f / a * d - b * c
		double x = (b[0] * a[1][1] - a[0][1] * b[1]) / dividor;

		// racunanje y-a a * f - e * c / a * d - b * c
		double y = (a[0][0] * b[1] - b[0] * a[1][0]) / dividor;

		double[] result = { x, y };
		return result;
	}

}
