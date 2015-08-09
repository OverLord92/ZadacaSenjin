package zadaci_09_08_2015;

/**
 * Design a class named StopWatch. The class contains:
 * Private data fields startTime and endTime with getter methods. 
 * A no-arg constructor that initializes startTime with the current time. 
 * A method named start() that resets the startTime to the current time. 
 * A method named stop() that sets the endTime to the current time. 
 * A method named getElapsedTime() that returns the elapsed time for the 
 * stopwatch in milliseconds. 
 * Draw the UML diagram for the class and then implement the class. Write a test program that
 * measures the execution time of sorting 100,000 numbers using selection sort.
 */

public class Zadatak3 {

	public static void main(String[] args) {
		
		// niz koji sortiramo
		int[] array = new int[100000];
		
		// generisanje brojeva
		for(int i = 0; i < array.length; i++)
			array[i] = (int)(Math.random()*10);
		
		// kreiranje instance stopwach
		StopWatch sw = new StopWatch();
		
		// selection sort u opadajucem nizu
		int index, temp;
		for(int i = 0; i < array.length - 1; i++){
			index = i;
			for(int j = i + 1; j <array.length; j++){
				if(array [j] > array[index])
				index = j;
			}
			if(array[i] != array[index]){
				temp = array[i];
				array[i] = array[index];
				array[index] = array[temp];
			}
		
		}
		
		// postavljanje zavrsnog vremena
		sw.stop();

		// printanje rezultata
		System.out.println("Sortiranje 100000 brojeva je trajalo: " + sw.getElapsedTime() / 1000.0 + " sekundi.");

	}

}

class StopWatch {
	// pocetno i krajnje vrijeme
	private long startTime;
	private long endTime;

	// seteri i geteri
	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	// no-arg konstruktor
	public StopWatch() {
		this.startTime = System.currentTimeMillis();
	}

	
	/** Metoda za pokretanje stoperice */
	public void start() {
		this.startTime = System.currentTimeMillis();
	}

	/** Metoda za zaustavljanje stoperice */
	public void stop() {
		this.endTime = System.currentTimeMillis();
	}

	/** Metoda za racunanje proteklog vremena */
	public long getElapsedTime() {
		return this.endTime - this.startTime;
	}
}
