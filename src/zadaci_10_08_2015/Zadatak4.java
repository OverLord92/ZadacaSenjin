package zadaci_10_08_2015;

import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Write a method that returns the area of a triangle using the following
 * header: public static double getTriangleArea(double[][] points)
 */

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// korisnik unosi koordinate tacaka trougla
		System.out.println("Unesite koordinate tacaka trougla: ");
		double[][] points = enterMatrix(3,2, input);
		
		// racunanje povrdine trougla
		double area = getTriangleArea(points);
		
		// ptintanje rezultata
		System.out.println("Povrsina trougla je " + area + ".");
		
	}
	
	/** Metoda koja vraca povrsinu trougla */
	public static double getTriangleArea(double[][] points){
		// varijable za stranice
		double side1, side2, side3;
		
		// za svaki par koordinata it matrice konstruisemo Point2D tacku
		Point2D.Double point1 = new Point2D.Double(points[0][0], points[0][1]);
		Point2D.Double point2 = new Point2D.Double(points[1][0], points[1][1]);
		Point2D.Double point3 = new Point2D.Double(points[2][0], points[2][1]);
		
		// koristimo metodu distane iz Point2D klase kako bi izracunali
		// duzinu stranica
		side1 = point1.distance(point2);
		side2 = point1.distance(point3);
		side3 = point2.distance(point3);
		
		
		// duzine stranica smjestamo u listu kako bi ih sortirali
		List<Double> sides = Arrays.asList(side1, side2, side3);
		Collections.sort(sides);
		
		// provjeravamo da li je najveca stranica veca od zbira manje dvije
		// sto je sulov za "izvodljivost" trougla
		// ako su tacke na istoj pravoj mjetoda vraca povrsinu 0
		if(sides.get(2) >= sides.get(0) + sides.get(1)){
			return 0;
		}
		
		// racunanje poluobima koji se koristi za racunanje povrsine trougla
		double s = (side1 + side2 + side3) / 2;
		
		// racunanje povrsine
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
				
		// printanje rezultata
		return area;
		
	}
	
	/** Metoda za unos matrice od strane korisnika */
	public static double[][] enterMatrix(int rows, int columns, Scanner input) {
		double[][] matrix = new double[rows][columns];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		return matrix;
	}

}
