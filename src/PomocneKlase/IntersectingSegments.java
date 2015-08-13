package PomocneKlase;

/** 
 Klasa koja provjerava da li se dvije DUZI sijeku
 */

/**
 * sistema jendacina
 * za racunanje tacke presjeka
 * (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
 * 
 *  (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
 *  
 *  u matricu a ubacujemo lijeve strane jednakosti
 *  a u matricu b desne strane jednakosti
 */


public class IntersectingSegments {
	// koordinate tacaka pravih
	private MyPoint p1, p2, p3, p4;

	// matrica u koju smjestamo varijable za racunanje sistema jednacina
	double[][] a;
	double[] b;

	// konstruktor
	public IntersectingSegments(MyPoint p1, MyPoint p2, MyPoint p3, MyPoint p4) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}

	/** Metoda vraca true ukoliko se DUZI sijeku */
	public boolean areSegmentsIntersecting() {

		// definisanje matrica koristeci se formulom iz opisa zadatka
		a = new double[2][2];
		a[0][0] = p1.y - p2.y;

		a[0][1] = (p1.x - p2.x);
		if (a[0][1] != 0)
			a[0][1] *= -1;

		a[1][0] = p3.y - p4.y;

		a[1][1] = (p3.x - p4.x);
		if (a[1][1] != 0)
			a[1][1] *= -1;

		b = new double[2];
		b[0] = (p1.y - p2.y) * p1.x - (p1.x - p2.x) * p1.y;
		b[1] = (p3.y - p4.y) * p3.x - (p3.x - p4.x) * p3.y;

		// pozivamo metodu za rjesavanj sistema jednacina
		return isSolvable();
	}

	/** Metoda koja racuna rjesenje sistema jednacina */
	public boolean isSolvable() {

		// ukoliko jednacina nije rjesiva metoda vraca false
		// sto znaci da su prave paralelne tj da se ne sjeku
		if (a[0][0] * a[1][1] - a[0][1] * a[1][0] == 0)
			return false;

		// a * d - b * c se korsiti visestruko pa je ta vrijednost dodijeljena
		// varijabli dividor
		double dividor = (a[0][0] * a[1][1] - a[0][1] * a[1][0]);

		// racunanje x = a e * d - b * f / a * d - b * c
		double x = (b[0] * a[1][1] - a[0][1] * b[1]) / dividor;

		// racunanje y = a a * f - e * c / a * d - b * c
		double y = (a[0][0] * b[1] - b[0] * a[1][0]) / dividor;
		
		
		// provjeravamo da li se tacka presjeka nalazi na prvoj duzi
		// ako se prave sijeku izvan duzi znaci da se duzi ne sjeku
		boolean greaterX = x > p1.x
				&& x > p2.x;
				
		boolean greaterY = y > p1.y
				&& y > p2.y;
				
		boolean smallerX = x < p1.x
				&& x < p2.x;
				
		boolean smallerY = y < p1.y
				&& y < p2.y;
				
	
		// ako je to slucaj metoda vraca false
		if (greaterX || greaterY || smallerX || smallerY) {
			return false;
		} else
			return true;

	}

}
