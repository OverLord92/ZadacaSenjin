package zadaci_01_08_2015;


/**
 * Write a program tha adds the sollowing series: 1/3 + 3/5 + 5/7 + 7/9 + 9/11 +
 * 11/13 ..... + 95/97 + 97/99.
 */

public class Zadatak3 {

	public static void main(String[] args) {

		double sum = 0;

		// loop which adds the elements of the series
		for (int i = 1; i <= 97; i += 2) {

			sum += (double) i / (i + 2);

		}

		// print result
		System.out.println(sum);


	}

}
