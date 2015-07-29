package zadaci_29_07_2015;

import java.util.*;

/**
 * Napisati program koji pita korisnika da unese imena tri grada te ih ispiše u
 * abecednom redu. Na primjer, ukoliko korisnik unese Chicago, Los Angeles i
 * Atlanta kao gradove, program vraća Atlanta, Chicago, Los Angeles.
 */

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// zadatak rijesen koristeci ArrayList
		ArrayList<String> lista = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			System.out.print("Enter a string: ");
			lista.add(input.nextLine());
		}

		Collections.sort(lista);

		System.out.println("\n" + lista + "\n");

		// zadatak rjesen koristeci PriorityQueue
		PriorityQueue<String> queue = new PriorityQueue<>();

		for (int i = 0; i < 3; i++) {
			System.out.print("Enter a string: ");
			queue.offer(input.nextLine());
		}

		System.out.println("\nThe strings sorted alphabeticaly: ");

		while (queue.size() > 0) {
			System.out.print(queue.remove() + " ");
		}

		input.close();

	}

}
