package zadaci_24_08_2015;

import java.util.ArrayList;

/**
 * *13.2 (Shuffle ArrayList) Write the following method that shuffles an
 * ArrayList of numbers: public static void shuffle(ArrayList<Number> list)
 */

public class Zadatak4 {

	public static void main(String[] args) {

		// probni lista
		ArrayList<Number> list = new ArrayList<>();

		// punjenje liste brojevima od 0 do 9
		for (int i = 0; i < 10; i++)
			list.add(i);
		
		// printanje liste prije mjesanja
		System.out.print("Lista prije mjesanja:   ");
		for(Number num: list)
		System.out.print(num + " ");

		// mjesanje liste
		shuffle(list);
		
		// printanjre liste poslije mjesanja
		System.out.print("\nLista poslije mjesanja: ");
		for(Number num: list)
		System.out.print(num + " ");

	}

	/** Metoda koja mjesa elemente liste sa Number objektima */
	public static void shuffle(ArrayList<Number> list) {
		
		for(int i = 0; i < list.size(); i++){
			
			int newIndex;
			
			// provjeravamo da li je novi index jednak starom indexu
			// ako jeste, generisemo novi newIndex sve dok je newIndex == i
			do{
				newIndex = (int)(Math.random()*list.size());
			}while(newIndex == i);
			
			// mjenjamo elemente na pozicijama i i newIndex
			Number temp = list.get(newIndex);
			list.set(newIndex, list.get(i));
			list.set(i, temp);
		}

	}

}
