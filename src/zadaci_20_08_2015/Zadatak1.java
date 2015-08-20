package zadaci_20_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

import PomocneKlase.MyPoint;
import PomocneKlase.MyTriangle;

/**
 * *11.15 (Area of a convex polygon) A polygon is convex if it contains any line
 * segments that connects two points of the polygon. Write a program that
 * prompts the user to enter the number of points in a convex polygon, then
 * enter the points clockwise, and display the area of the polygon.
 * 
 * Povrsina n-tostranog poligona ce se racunati tako sto ce se poligon pomovu
 * dijagonala podijeliti na n - 1 trouglova. Sabiranjem tih trouglova dobice se
 * povrsina poligona
 * 
 * 
 * Klase MyPoint i MyTriangle koje sam koristio u primjeru se nalaze u paketu
 * PomocneKlase
 * 
 * Napisan program a i metoda pa sta vise odgovara.
 */

public class Zadatak1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// lista u koju smjestamo MyPoint objekte koje kreiramo
		// od parova x i y koordinate svake tacke
		ArrayList<MyPoint> tacke = new ArrayList<>();

		// promptamo korisnika da unese broj stranica
		System.out.print("Unesite broj stranica: ");
		int n = input.nextInt();
		// korisnik unosi koordinate
		System.out.println("Unesite koordinate: ");

		// unos tacaka MyPoint u listu
		for (int i = 0; i < n; i++)
			tacke.add(new MyPoint(input.nextDouble(), input.nextDouble()));

		// pocetna vrijednost za povrsinu mnogougla
		double polygonArea = 0;
		// MyTriangle varijabla u koju smjestamo trenutni trougao za
		// koji racunamo povrsinu
		MyTriangle currentTriangle;

		// racunamo povrsinu za svaki pojedinacni trougao koristeci
		// getTriangleArea() metodu
		for (int i = 1; i < tacke.size() - 1; i++) {
			currentTriangle = new MyTriangle(tacke.get(0), tacke.get(i),
					tacke.get(i + 1));
			// i dodajemo povrsinu ukupnoj povrsini mnogougla
			polygonArea += currentTriangle.getTriangleArea();
		}

		// printanje rezultata
		System.out.printf("Povrsina mnogougla je: %.3f", polygonArea);

		double povrsina = getPolygonArea(tacke);
		System.out.printf(
				"\n\n\nIzracunata povrsina mnogougla koristeci metodu: %.3f",
				povrsina);
		
		input.close();

	}

	/**
	 * Metoda kojoj prosljedjujemo listu sa tackama mnogougla, koja vraca
	 * povrsinu mnogougla kojeg te tacke sacinjavaju
	 */
	public static double getPolygonArea(ArrayList<MyPoint> tacke) {

		// pocetna vrijednost za povrsinu mnogougla
		double polygonArea = 0;
		// MyTriangle varijabla u koju smjestamo trenutni trougao za
		// koji racunamo povrsinu
		MyTriangle currentTriangle;

		// racunamo povrsinu za svaki pojedinacni trougao koristeci
		// getTriangleArea() metodu
		for (int i = 1; i < tacke.size() - 1; i++) {
			currentTriangle = new MyTriangle(tacke.get(0), tacke.get(i),
					tacke.get(i + 1));
			// i dodajemo povrsinu ukupnoj povrsini mnogougla
			polygonArea += currentTriangle.getTriangleArea();
		}

		return polygonArea;

	}
}
