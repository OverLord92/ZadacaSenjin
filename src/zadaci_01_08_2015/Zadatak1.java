package zadaci_01_08_2015;

/**
 * Napisati program koji nasumično generiše cijeli broj između 1 i 12 te
 * ispisuje ime mjeseca za taj broj. (Januar za 1, Ferbruar za 2....)
 */

public class Zadatak1 {

	public static void main(String[] args) {

		// niz za imenima mjeseci sa "zero" na poziciji 0
		String[] monthNames = { "Zero", "Januar", "Februar", "Mart", "April",
				"Maj", "Juni", "Juli", "August", "Septembar", "Oktobar",
				"Novembar", "Decembar" };

		// generisanje nasumicnog broja
		int month = (int) (1 + Math.random() * 12);

		// printanje rezultata
		System.out.println("The generatd  number is " + month
				+ " and the coresponding month is " + monthNames[month] + ".");

	}

}
