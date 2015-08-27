package zadaci_27_08_2015;

/**
 * *13.16 (Create a rational-number calculator) Write a program similar to
 * Listing 7.9, Calculator.java. Instead of using integers, use rationals, as
 * shown in Figure 13.10a. You will need to use the split method in the String
 * class, introduced in Section 10.10.3, Replacing and Splitting Strings, to
 * retrieve the numerator string and denominator string, and convert strings
 * into integers using the Integer.parseInt method.
 */

public class Zadatak3 {

	public static void main(String[] args) {
		
		// splitujemo prvi argument s komandne linije
		String[] op1 = args[0].split("/");
		// parsujemo numetaro i denominator prvog operanda
		long op1Numerator = Long.parseLong(op1[0]);
		long op1Denominator = Long.parseLong(op1[1]);
		// kreiramo razlomak
		Rational operand1 = new Rational(op1Numerator, op1Denominator);

		// uzimamo prvi karakter drugog argumenta s komandne linije
		char operator = args[1].charAt(0);

		// splitujemo treci argument s komandne linije
		// kako bi kreirali drugi operand
		String[] op2 = args[2].split("/");
		long op2Numerator = Long.parseLong(op2[0]);
		long op2Denominator = Long.parseLong(op2[1]);
		Rational operand2 = new Rational(op2Numerator, op2Denominator);

		// razlomak u koji smejstamo rezultat
		Rational result = new Rational();

		// proces racunanja rjesen switch-em
		switch (operator) {
		case '+':
			result = operand1.add(operand2);
			break;
		case '-':
			result = operand1.divide(operand2);
			break;
		case 'x':
			result = operand1.multiply(operand2);
			break;
		case '/':
			result = operand1.divide(operand2);
			break;
		default:
			System.out.println("Ne podrzan operator.");
			System.exit(1);
		}

		// printanje rezultata
		System.out.println(result);
	}

}
