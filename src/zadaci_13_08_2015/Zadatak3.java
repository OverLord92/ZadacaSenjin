package zadaci_13_08_2015;

/** 10.13 (Geometry: the MyRectangle2D class) Define the MyRectangle2D class */

public class Zadatak3 {

	/** Test program */
	public static void main(String[] args) {

		MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
		System.out.printf("r1 area: %.4f\n", r1.getArea());
		System.out.println("r1 perimeter: " + r1.getPerimeter());

		System.out.println("r1 contains (3,3)? " + r1.contains(3, 3));
		System.out.println("r1 contains MyRectangle2D(4, 5, 10.5, 3.2)? "
				+ r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
		System.out.println("r1 ovelaps MyRectangle2D(3, 5, 2.3, 5.4)? "
				+ r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));

	}

}

class MyRectangle2D {
	private double x = 0;
	private double y = 0;

	private double width = 1;
	private double height = 1;

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

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	MyRectangle2D() {

	}

	/** Konstruktor sa odredjenim parametrima */
	MyRectangle2D(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	/** Metoda koja vraca povrsinu pravougaonika */
	public double getArea() {
		return this.width * this.height;
	}

	/** Maetoda koja vraca obim pravougaonika */
	public double getPerimeter() {
		return 2 * (this.width + this.height);
	}

	/** Metoda koja provjerava da li se tacka x,y nalazi u pravougaoniku */
	public boolean contains(double x, double y) {
		if (x < this.x - width / 2 || x > this.x + width / 2)
			return false;

		if (y < this.y - height / 2 || y > this.y + height / 2)
			return false;
		return true;
	}

	/**
	 * Metoda koja provjerava da li se pravougaonik nalazi unutar drugog
	 * pravougaonika
	 */
	public boolean contains(MyRectangle2D rectangle) {
		if (!this.contains(rectangle.x - rectangle.width / 2, rectangle.y
				- rectangle.height / 2))
			return false;

		if (!this.contains(rectangle.x - rectangle.width / 2, rectangle.y
				+ rectangle.height / 2))
			return false;

		if (!this.contains(rectangle.x + rectangle.width / 2, rectangle.y
				- rectangle.height / 2))
			return false;

		if (!this.contains(rectangle.x + rectangle.width / 2, rectangle.y
				+ rectangle.height / 2))
			return false;

		return true;
	}

	/** MEtoda koja provjerava da li se pravougaonici poklapaju */
	public boolean overlaps(MyRectangle2D rectangle) {

		double Xdistance = Math.abs(this.x - rectangle.x);
		double Ydistance = Math.abs(this.y - rectangle.y);

		return (Xdistance <= (this.width + rectangle.width) / 2 && Ydistance <= (this.height + rectangle.height));
	}

}
