package PomocneKlase;

public class Rectangle extends GeometricObject{
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

	public Rectangle() {
	}

	/** Konstruktor sa odredjenim parametrima */
	public Rectangle(double x, double y, double width, double height) {
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
	
}
