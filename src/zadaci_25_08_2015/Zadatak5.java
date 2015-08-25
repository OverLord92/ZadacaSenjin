package zadaci_25_08_2015;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

/**
 * *13.8 (Revise the MyStack class) Rewrite the MyStack class in Listing 11.10
 * to perform a deep copy of the list field.
 * 
 * 
 * Klasa MyStack je raw type sto znaci da je MyStack<Object>, pretrazio sam
 * desetak stranica i postove vezanih za deep copy pa sam na kraju koristio
 * najjednostavniju metodu. URL stranice s koje sam kopirao metodu se nalazi
 * iznad implementacije metode.
 */

public class Zadatak5 {

	public static void main(String[] args) {

		// kreiranje i punjenje steka objektima razlicitog tipa
		MyStack original = new MyStack();
		original.push(4);
		original.push("String");
		original.push(4.5);
		original.push(new Date());

		// kloniranje originala
		MyStack clone = (MyStack) original.clone();

		// izvrsicemo promjene na originalu kako bi pokazali da je zaista
		// odradjen deep copy

		original.list.set(0, 12);
		original.list.set(1, "Kloniranje");

		// printanje original steka
		System.out.println("Printanje sadrzaja original steka: ");
		while (!original.isEmpty())
			System.out.println(original.pop());

		System.out
				.println("\nIzvrsili smo promjene na originalni stek koje se nisu odrazile na klon."
						+ "\nDeep Copy.");

		// printanje klon steka
		System.out.println("\n\nPrintanje sadrzaja klon steka: ");
		while (!clone.isEmpty())
			System.out.println(clone.pop());

	}

}

class MyStack implements Cloneable {
	public ArrayList list = new ArrayList();

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int getSize() {
		return list.size();
	}

	public Object peek() {
		return list.get(getSize() - 1);
	}

	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	public void push(Object o) {
		list.add(o);
	}

	@Override
	public String toString() {
		return "stack: " + list.toString();
	}

	@Override
	/** Metoda koja kreira noci stek i klonira sve elemente original steka u klone */
	public Object clone() {
		MyStack clone = new MyStack();

		for (int i = 0; i < this.list.size(); i++) {
			clone.push(copy(this.list.get(i)));
		}

		return clone;
	}

	/**
	 * Metoda koja vrsi deep copy
	 * 
	 * Koristena je metoda s interneta:
	 * http://javatechniques.com/blog/faster-deep-copies-of-java-objects/
	 * 
	 * */
	public static Object copy(Object orig) {
		Object obj = null;
		try {
			// Write the object out to a byte array
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream out = new ObjectOutputStream(bos);
			out.writeObject(orig);
			out.flush();
			out.close();

			// Make an input stream from the byte array and read
			// a copy of the object back in.
			ObjectInputStream in = new ObjectInputStream(
					new ByteArrayInputStream(bos.toByteArray()));
			obj = in.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		return obj;
	}
}
