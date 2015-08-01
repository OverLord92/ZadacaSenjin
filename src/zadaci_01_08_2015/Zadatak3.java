package zadaci_01_08_2015;

import PomocneKlase.Rational;

/**
 * Napisati program koji sabira sljedeću seriju 1/3 + 3/5 + 5/7 + 7/9 + 9/11 +
 * 11/13 ..... + 95/97 + 97/99.
 */

public class Zadatak3 {

	public static void main(String[] args) {
		
		double sum = 0;
		
		// petlja koja sabira clanove niza
		for(int i = 1; i <= 97; i+=2){
			
			sum += (double) i / (i + 2);
					
		}
		
		// printanje rezultata
		System.out.println(sum);
		
		
		// Pokusaj rjesenja zadatka sa klasom Rational koja radi sa razlomcima
		// klasa se nalazi u paketu PomocneKlase
		
		// Rational result = new Rational(1,3);
		//
		// for(int i = 3; i <= 97; i+=2){
		// System.out.println(i);
		// result = result.add(new Rational(i, i+2));
		// System.out.println(result);
		// }
		//
		// System.out.println(result);

	}

}
