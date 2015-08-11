package zadaci_11_08_2015;

/**
 * In an n-sided regular polygon, all sides have the same length and all angles
 * have the same degree (i.e., the polygon is both equilateral and equiangular).
 * Design a class named RegularPolygon
 */

public class Zadatak2 {

	public static void main(String[] args) {

		// kreiranje dva RegularPolygon objekta i printanje njihovih povrsina i
		// obima
		RegularPolygon rp1 = new RegularPolygon(6, 4);

		System.out.println("The area of the first polygon " + rp1.getArea()
				+ ", and the perimeter is: " + rp1.getPerimeter() + ".");

		RegularPolygon rp2 = new RegularPolygon(10, 4, 5.6, 7.8);

		System.out.println("The area of the second polygon " + rp2.getArea()
				+ ", and the perimeter is: " + rp2.getPerimeter() + ".");

	}

}

class RegularPolygon {
	
	// data fields
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;

	// konsturktori
	public RegularPolygon() {

	}

	public RegularPolygon(int n, double side) {
		this.n = n;
		this.side = side;
	}

	public RegularPolygon(int n, double side, double x, double y) {
		this(n, side);
		this.x = x;
		this.y = y;
	}

	// geteri i seteri
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	/** Metoda za racunanje obima */
	public double getPerimeter() {
		return this.n + this.side;
	}

	/** MEtoda za racunanje povrsine*/
	public double getArea() {
		return n * Math.pow(this.side, 2) / (4 * Math.tan(Math.PI / n));
	}
}
