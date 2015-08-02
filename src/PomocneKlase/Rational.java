package PomocneKlase;

/** Klasa koja radi sa razlomcima na koju sam naletio dok sam citao lekcije iz knjige */


public class Rational extends Number implements Comparable<Rational> {
	private long numerator = 0;
	private long denominator = 1;

	Rational() {

	}

	 public Rational(long numerator, long denominator) {
		long gcd = gcd(numerator, denominator);
		this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
		this.denominator = Math.abs(denominator) / gcd;
	}

	public long getNumerator() {
		return numerator;
	}

	public long getDenominator() {
		return denominator;
	}

	private static long gcd(long rational1, long rational2) {
		rational1 = Math.abs(rational1);
		rational2 = Math.abs(rational2);
		int gcd = 1;
		for (int i = 2; i <= rational1 && i <= rational2; i++) {
			if (rational1 % i == 0 && rational2 % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}

	public Rational add(Rational rational) {
		long n = this.numerator * rational.denominator + rational.numerator
				* this.denominator;
		long d = this.denominator * rational.denominator;
		return new Rational(n, d);
	}

	public Rational sub(Rational rational) {
		long n = this.numerator * rational.denominator - rational.numerator
				* this.denominator;
		long d = this.denominator * rational.denominator;
		return new Rational(n, d);
	}

	public Rational multiply(Rational rational) {
		long n = this.numerator * rational.numerator;
		long d = this.denominator * rational.denominator;
		return new Rational(n, d);
	}

	public Rational divide(Rational rational) {
		long n = this.numerator * rational.denominator;
		long d = rational.numerator * this.denominator;
		return new Rational(n, d);
	}

	public String toString() {
		if (denominator == 1)
			return numerator + "";
		else if (numerator == 0)
			return "0";
		else if (numerator == denominator)
			return "1";
		else if (numerator == (-1) * denominator)
			return "-1";
		else
			return numerator + "/" + denominator;
	}

	@Override
	public boolean equals(Object o) {
		return this.sub((Rational) (o)).getNumerator() == 0 ? true : false;
	}

	@Override
	public int compareTo(Rational rational) {
		if (this.sub(rational).getNumerator() > 0)
			return 1;
		else if (this.sub(rational).getNumerator() < 0)
			return -1;
		else
			return 0;
	}

	/** Ova metoda nije potreba, cisto onako */
	public static long scd(Rational rational1, Rational rational2) {
		long brojac = 1;
		do {
			brojac++;
		} while (brojac % rational1.denominator != 0
				|| brojac % rational2.denominator != 0);
		return brojac;
	}
	
	@Override
	public int intValue(){
		return (int)doubleValue();
	}
	
	@Override
	public long longValue(){
		return (long)doubleValue();
	}
	
	@Override
	public float floatValue(){
		return (float)doubleValue();
	}
	
	@Override
	public double doubleValue(){
		return numerator * 1.0 / denominator;
	}

}
