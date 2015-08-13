package zadaci_13_08_2015;

/** A bounding rectangle is the minimum rectangle
 that encloses a set of points in a two-dimensional plane, as shown in
 Figure 10.24d. Write a method that returns a bounding rectangle for a set of
 points in a two-dimensional plane, as follows:
 public static MyRectangle2D getRectangle(double[][] points) */

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// promptamo korisniku poruku da unese koordinate tacaka
		System.out.println("Unesite 5 tacaka: ");

		// korisnik unosi koordinate 5 tacaka koje smjestam u matricu
		double[][] points = new double[5][2];
		for (int i = 0; i < points.length; i++) {
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}

		// matricu proslijedjujemo metodi
		MyRectangle2D rectangle = getRectangle(points);

		// printanje rezultata
		System.out.println("Kordinate centra pravougaonika su: "
				+ rectangle.getX() + " " + rectangle.getY());

		System.out.println("Dimenzije pravougaonika su: "
				+ rectangle.getWidth() + " " + rectangle.getHeight());

		input.close();

	}

	/**
	 * Metoda koja vraca pravougaonik koji sadrzi sve tacke koje su
	 * proslijedjene metodi
	 */
	public static MyRectangle2D getRectangle(double[][] points) {

		// varijable u koje smejstamo minimalnu i maksimalnu x koordinatu
		// koje su donja i gornja granica pravougaonika
		double maxX = points[0][0];
		double minX = points[0][0];

		// varijable u koje smjestamo minimalnu i maksimalnu y koordinatu
		// koje su lijeva i desna granica pravougaonika
		double maxY = points[0][1];
		double minY = points[0][1];

		// pronalazimo minX maxX, minY i maxY u matrici points
		for (int i = 0; i < points.length; i++) {
			if (points[i][0] > maxX) {
				maxX = points[i][0];
			}
			if (points[i][0] < minX) {
				minX = points[i][0];
			}
			if (points[i][1] > maxY) {
				maxY = points[i][1];
			}
			if (points[i][1] < minY) {
				minY = points[i][1];
			}
		}

		// sirina i visina pravougaonika
		double width, height;

		width = maxX - minX;
		height = maxY - minY;

		// centar pravougaonika
		double x, y;

		x = maxX - width / 2;
		y = maxY - height / 2;

		// vracamo pravougaonik koji sadrzi sve tacke
		return new MyRectangle2D(x, y, width, height);
	}
}
