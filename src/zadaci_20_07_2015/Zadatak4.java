package zadaci_20_07_2015;

import java.util.Arrays;

public class Zadatak4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = new int[10];

		
		//brojimo koliko je se puta koji broj ponovio
		for (int i = 0; i < 100; i++) {
			num[(int) (Math.random() * 10)]++;
		}
		
		// stampamo u konzolu koliko je se koji broj puta ponovio
		for (int i = 0; i < 10; i++) {
			System.out.println("The number " + i + " occurred " + num[i]);

		}

	}

}
