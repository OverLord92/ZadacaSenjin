package zadaci_27_08_2015;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * *13.15 (Use BigInteger for the Rational class) Redesign and implement the
 * Rational class in Listing 13.13 using BigInteger for the numerator and
 * denominator.
 */

public class Zadatak2 {

	/** Kratki test program */
	public static void main(String[] args) {

		BigRational r1 = new BigRational(new BigInteger("16"), new BigInteger(
				"3"));
		BigRational r2 = new BigRational(new BigInteger("2"), new BigInteger(
				"3"));
		BigRational r3 = new BigRational(new BigInteger("16"), new BigInteger(
				"3"));

		BigRational r4 = r1.subtract(r2);
		
		System.out.println(r2 + " - " + r3 + " = " + r2.subtract(r3));

		System.out.println(r3 + " euqals " + r2 + "? " + r3.equals(r2));
		System.out.println(r3 + " euqals " + r1 + "? " + r3.equals(r1));
		
		System.out.println(r3 + " compare to " + r1 + "? " + r3.compareTo(r1));
		
		

	}

}

/** Klasa je prilagodjena radu s BigInegerima. Logika je ostala ista. */
class BigRational extends Number implements Comparable<BigRational> {
	// Niz sa brojiocem i imeniocem
	private BigInteger numerator;
	private BigInteger denominator;

	/** Construct a rational with default properties */
	public BigRational() {
		this(BigInteger.ZERO, BigInteger.ONE);
	}

	/** Construct a rational with specified numerator and denominator */
	public BigRational(BigInteger numerator, BigInteger denominator) {
		BigInteger gcd = numerator.gcd(denominator);
		this.numerator = ((denominator.compareTo(BigInteger.ZERO) == 1) ? BigInteger.ONE
				: new BigInteger("-1")).multiply(numerator).divide(gcd);
		this.denominator = denominator.abs().divide(gcd);
	}

	/** Find GCD of two numbers */
	// private static long gcd(long n, long d) {
	// metoda Rational.gcd vise nije potreba jer klasa BigInteger ima definisanu
	// gcd metodu

	/** Return numerator */
	public BigInteger getNumerator() {
		return numerator;
	}

	/** Return denominator */
	public BigInteger getDenominator() {
		return denominator;
	}

	/** Add a rational number to this rational */
	public BigRational add(BigRational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator()).add(
				denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new BigRational(n, d);
	}

	/** Subtract a rational number from this rational */
	public BigRational subtract(BigRational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator())
				.subtract(denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new BigRational(n, d);
	}

	/** Multiply a rational number by this rational */
	public BigRational multiply(BigRational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getNumerator());
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new BigRational(n, d);
	}

	/** Divide a rational number by this rational */
	public BigRational divide(BigRational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator());
		BigInteger d = denominator.multiply(secondRational.numerator);
		return new BigRational(n, d);
	}

	@Override
	public String toString() {
		if (denominator.compareTo(BigInteger.ONE) == 0)
			return numerator + "";
		else
			return numerator + "/" + denominator;
	}

	@Override
	// Override the equals method in the Object class
	public boolean equals(Object other) {
		if ((this.subtract((BigRational)(other))).getNumerator().compareTo(BigInteger.ZERO) == 0)
			return true;
		else
			return false;
	}

	@Override
	// Implement the abstract intValue method in Number
	public int intValue() {

		return (int) doubleValue();
	}

	@Override
	// Implement the abstract floatValue method in Number
	public float floatValue() {
		return (float) doubleValue();
	}

	@Override
	// Implement the doubleValue method in Number
	public double doubleValue() {
		BigDecimal bd = new BigDecimal(this.numerator);
		BigDecimal bdDoubleValue = bd.divide(new BigDecimal(denominator));
		return bdDoubleValue.doubleValue();
	}

	@Override
	// Implement the abstract longValue method in Number
	public long longValue() {
		return (long) doubleValue();
	}

	@Override
	// Implement the compareTo method in Comparable
	public int compareTo(BigRational o) {
		if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) == 1)
			return 1;
		else if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) == -1)
			return -1;
		else
			return 0;
	}
}
