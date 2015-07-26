package zadaci_26_07_2015;

/**
 * Pozitivni cijeli broj je savršen broj ukoliko je jednak zbiru svih svojih
 * pozitivnih djelilaca, isključujući sebe. Na primjer, 6 je prvi savršeni broj
 * jer 6 = 3 + 2 + 1. Sljedeći savršeni broj je 28 jer 28 = 14 + 7 + 4 + 2 + 1.
 * Samo 4 savršena broja postoje u rasponu od 0 do 10.000. Napišite program koji
 * ispisuje sva 4.
 */

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ispisivanje rezultata
		System.out.println("The perfect numbers smaller or equal to 10000 are:\n");
		for (int i = 1; i <= 10000; i++) {
			if (isPerfect(i))
				System.out.print(i + "  ");
		}

	}

	/** Metoda koja vraca true ukoliko je broj savršen*/
	public static boolean isPerfect(int number) {

		int sum = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0)
				sum += i;
		}

		if (sum == number)
			return true;
		else
			return false;
	}

}
