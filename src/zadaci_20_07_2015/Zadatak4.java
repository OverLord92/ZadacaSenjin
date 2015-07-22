package zadaci_20_07_2015;

public class Zadatak4 {

	/**
	 * Napišite program koji generiše 100 nasumičnih cijelih brojeva između 0 i
	 * 9 te ispisuje koliko se puta koji broj ponovio.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = new int[10];

		// brojimo koliko je se puta koji broj ponovio
		for (int i = 0; i < 100; i++) {
			num[(int) (Math.random() * 10)]++;
		}

		// stampamo u konzolu koliko je se koji broj puta ponovio
		for (int i = 0; i < 10; i++) {
			System.out.println("The number " + i + " occurred " + num[i] + ".");

		}

	}

}
