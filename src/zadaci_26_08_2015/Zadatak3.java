package zadaci_26_08_2015;

/**
 * *13.11 (The Octagon class) Write a class named Octagon that extends
 * GeometricObject and implements the Comparable and Cloneable interfaces.
 * Assume that all eight sides of the octagon are of equal length. The area can
 * be computed using the following formula:
 * 
 * area = (2 + 4/22)* side * side
 */

public class Zadatak3 {

	/** Krratki test program */
	public static void main(String[] args) {

		Octagon o1 = new Octagon(4);
		try {
			Octagon o2 = (Octagon) o1.clone();
			o2.setSide(6);
			
			System.out.println("o1: " + o1);
			System.out.println("o2: " + o2);
			
		} catch (CloneNotSupportedException e) {
			System.out.println("Kloniranje nije podrzano.");
		}

	}

}

class Octagon extends PomocneKlase.GeometricObject implements
		Comparable<Octagon>, Cloneable {

	private double side;
	
	public void setSide(double newSide){
		this.side = newSide;
	}

	Octagon() {
	}

	Octagon(double side) {
		this.side = side;
	}

	/** Metoda za racunanje obima oktagona. */
	public double getPerimeter() {
		return 8 * side;
	}

	/** Metoda za racunanje povrsine oktagona */
	public double getArea() {
		return (2 + 4 * Math.sqrt(2)) * side * side;
	}

	/** Implementacija Comparable interfejsa */
	public int compareTo(Octagon o) {
		if (this.getArea() > o.getArea())
			return 1;
		else if (this.getArea() < o.getArea())
			return -1;
		else
			return 0;

	}
	
	public String toString(){
		return this.getArea() + " " + this.getPerimeter();
	}

	@Override
	/** Override metode clone koju smo definisali u klasi PomocneKlase.GeoemtricObject */
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
