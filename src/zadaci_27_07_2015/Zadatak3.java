package zadaci_27_07_2015;

/**
 * Napišite program koji ispisuje sve brojeve, od 100 do 1000, 10 brojeva po
 * liniji, koji su djeljivi i sa 5 i sa 6. Razmak između brojeva treba biti
 * tačno jedan space.
 */

public class Zadatak3 {

	public static void main(String[] args) {
		
		int counter = 0;
		
		// broj ispisanih brojeva po liniji
		int perLine = 10;
		
		
		System.out.println("Brojevi od 100 do 1000 koji su djeljivi sa i 5 i sa 6 su: ");
		
		for(int i = 100; i <=1000; i++){
			
			if(i%5 == 0 && i%6==0){
				System.out.print(counter%perLine == 0? "\n" + i :" "+i);
				counter++;
			}
		}
	}
}
