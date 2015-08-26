package zadaci_26_08_2015;

/**
 * *13.9 (Enable Circle comparable) Rewrite the Circle class in Listing 13.2 to
 * extend GeometricObject and implement the Comparable interface. Override the
 * equals method in the Object class. Two Circle objects are equal if their
 * radii are the same. Draw the UML diagram that involves Circle,
 * GeometricObject, and Comparable.
 */

public class Zadatak1 {

	/** Kratki test program */
	public static void main(String[] args) {
		
		Circle c1 = new Circle(4);
		Circle c2 = new Circle(6);
		
		System.out.println("c1 compareTo c1 == " + c1.compareTo(c2));
		
		System.out.println("c1 euquals c2? " + c1.equals(c2));
		

	}

}

class Circle extends PomocneKlase.Circle implements Comparable<Circle>{
	
	/** Konstruktor koji poziva konsturktor superklase */
	Circle(){
	}
	
	/** Konstruktor koji poziva konsturktor superklase sa zadanim poluprecnikom */
	Circle(double radius){
		super(radius);
	}
	
	
	@Override
	/** Implementacija compareTo metode Comparable interfejsa */
	public int compareTo(Circle c){
		
		if(this.getRadius() > c.getRadius())
			return 1;
		else if(this.getRadius() < c.getRadius())
			return -1;
		else 
			return 0;
		
	}
	
	
	/** Metoda koja vraca true ukoliko je radius this objekta i prosliejdjenog objekta jednaki */
	public boolean equals(Circle c){
		if(this.getRadius() == c.getRadius())
			return true;
		else
			return false;
	}
	
}
