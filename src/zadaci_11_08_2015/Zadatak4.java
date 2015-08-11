package zadaci_11_08_2015;

/**
 * Design a class named LinearEquation for a 2 * 2 system of linear equations.
 */

public class Zadatak4 {

	/** Test program */
	public static void main(String[] args) {
		
		// kreiranje linearne jednacine le
		LinearEquation le = new LinearEquation(1, 2, 3, 4, 5, 6);
		
		// printanje rezultata
		if(le.isSolvable()){
			System.out.println("Rjesenja jednacine su " + le.getX() + ", " + le.getY() + ".");
		}else{
			System.out.println("Jednacina nije rjesiva.");
		}

	}

}

/** Klasa za rjesavanje sistema linearnih jednacina */
class LinearEquation {
	private double a, b, c, d, e, f;

	// konstruktor 
	LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	// geteri i seteri
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}

	/** Metoda koja provjeraca da li je jednacina rjesiva */
	public boolean isSolvable() {
		return a * d - b * c != 0;
	}
	
	/** Metoda koja vraca x */
	public double getX(){
		return (e * d - b * f) / (a * d - b * c);
	}
	
	/** Metoda koja vraca y */
	public double getY(){
		return (a * f - e * c) / (a * d - b * c);
	}

}
