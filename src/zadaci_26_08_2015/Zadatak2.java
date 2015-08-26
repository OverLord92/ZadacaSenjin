package zadaci_26_08_2015;

/**
 * *13.10 (Enable Rectangle comparable) Rewrite the Rectangle class in Listing
 * 13.3 to extend GeometricObject and implement the Comparable interface.
 * Override the equals method in the Object class. Two Rectangle objects are
 * equal if their areas are the same. Draw the UML diagram that involves
 * Rectangle, GeometricObject, and Comparable.
 */

public class Zadatak2 {

	/** Kratki test program */
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(0, 0, 2, 2);
		Rectangle r2 = new Rectangle(0, 0, 1, 4);
		
		System.out.println("r1 compareTo r2 == " + r1.compareTo(r2));
		System.out.println("r1 ewuals r2? " + r1.equals(r2));

		

	}

}

class Rectangle extends PomocneKlase.Rectangle implements Comparable<Rectangle> {

	/** No arg konstruktor koji poziva konstruktor iz superklase */
	Rectangle() {
	}

	/**
	 * Konstruktor koji poziva konstruktor iz superklase za definisanim
	 * koordinata centra pravougaonika x, y i duzinom i visinom
	 */
	Rectangle(double x, double y, double width, double length) {
		super(x, y, width, length);
	}
	
	/** Implementacija Comparable interfejsa */
	public int compareTo(Rectangle r){
		if(this.getArea() > r.getArea())
			return 1;
		else if(this.getArea() < r.getArea())
			return -1;
		else 
			return 0;
			
	}	
	
	/** Override-ovana equals methoda, koja kao sredstvo poredjenja koristi povrsinu pravougaonika */
	public boolean equals(Rectangle r){
		if(this.getArea() == r.getArea())
			return true;
		else 
			return false;
	}
}
