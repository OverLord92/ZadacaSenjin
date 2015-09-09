package zadaci_03_08_2015;

/**
 * The anual tuition fee is 10.000 and increases every year by 5%. How much will
 * the tuition fee be in 10 years.
 */

public class Zadatak5 {

	public static void main(String[] args) {

		double anualTuitionFee = 10_000;
		double tuitionFeeIncrease = 1.05;

		// print result
		for (int year = 1; year <= 10; year++) {
			
			anualTuitionFee *= tuitionFeeIncrease;
			printPriceAfterYears(year, anualTuitionFee);
		}

	}

	/** Prints the price after certain years */
	public static void printPriceAfterYears(int year, double anualTuitionFee) {

		System.out.printf("After %2d " + (year == 1 ? "year" : "years")
				+ " the tuition fee wil be %.2f.\n", year, anualTuitionFee);

	}

}
