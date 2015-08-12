package zadaci_12_08_2015;

/** Zadatak 10.3 Design a class named MyInteger. */

public class Zadatak2 {
	
	/** Test program */
	public static void main(String[] args){
		
		MyInteger mint1 = new MyInteger(5);
		MyInteger mint2 = new MyInteger(6);
		
		System.out.println("mint1 is even? " + mint1.isEven());
		System.out.println("mint2 is odd? " + mint2.isOdd());
		
		System.out.println(MyInteger.isPrime(mint1.value));
		
		System.out.println("mint1 == 3? " + mint1.equals(3));
		System.out.println("mint1 == 5? " + mint1.equals(5));
		
		System.out.println("mint1 equals mint2? " + mint1.equals(mint2));
		
		
		
	}

}

class MyInteger {
	int value;

	/** Konstruktor */
	public MyInteger(int value) {
		this.value = value;
	}

	/** Metoda koja vraca da li je vrijednost integera parna */
	public boolean isEven() {
		return isEven(value);
	}

	/** Metoda koja vraca da li je vrijednost integera neparna */
	public boolean isOdd() {
		return isOdd(value);
	}

	/** Metoda koja provjerava da li je vrijednost integera prosta ili ne */
	public boolean isPrime() {
		return isPrime(value);
	}

	/** static metode za parnost */
	public static boolean isEven(int number) {
		return number % 2 == 0;
	}

	/** static metode za neparnost */
	public static boolean isOdd(int number) {
		return number % 2 == 1;
	}

	/** Static metoda koja provjerava da li je broj prost ili ne */
	public static boolean isPrime(int number) {

		if (number == 0 || number == 1)
			return false;
		else if (number == 2)
			return true;
		else
			for (int i = 3; i < number; i += 2) {
				if (number % i == 0) {
					return false;
				}
			}
		return true;
	}

	/** static metoda koja vraca da li je vrijednost integera parna */
	public static boolean isEven(MyInteger myInt) {
		return isEven(myInt.value);
	}

	/** static metoda koja vraca da li je vrijednost integera neparna */
	public static boolean isOdd(MyInteger myInt) {
		return isOdd(myInt.value);
	}

	/** Static metoda koja provjerava da li je vrijednost integera prosta ili ne */
	public static boolean isPrime(MyInteger myInt) {
		return isPrime(myInt.value);
	}

	/** Metoda koja provjerava da li je vrijednost integera jednaka nekom broju */
	public boolean equals(int number) {
		return value == number ? true : false;
	}
	
	/** Metoda koja provjerava da li su vrijednost dva integera jednake */
	public boolean equals(MyInteger myInt){
		return this.equals(myInt.value);
	}

}
