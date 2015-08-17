package zadaci_17_08_2015;

/** 11.6 (Use ArrayList) Write a program that creates an ArrayList and adds a Loan
 object, a Date object, a string, and a Circle object to the list, and use a loop
 to display all the elements in the list by invoking the object’s toString()
 method. */

import java.util.ArrayList;
import java.util.Date;

import javafx.scene.shape.Circle;

import PomocneKlase.Loan;

public class Zadatak4 {

	public static void main(String[] args) {

		// ArrayList list == ArrayList<Object> list
		ArrayList list = new ArrayList();

		// dodavanje objekata u listu
		list.add(new Date());
		list.add(new Circle());
		list.add(new Loan());

		// printanje objekata
		for (Object o : list) {
			System.out.println(o);
		}
	}

}
