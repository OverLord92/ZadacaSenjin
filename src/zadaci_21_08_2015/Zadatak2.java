package zadaci_21_08_2015;

import java.util.ArrayList;

/**
 * *12.10 (OutOfMemoryError) Write a program that causes the JVM to throw an
 * OutOfMemoryError and catches and handles this error.
 */

public class Zadatak2 {

	public static void main(String[] args) {
		
		try{
		napraviOutOfMemoryError();
		}
		// hvatamo error i printamo korisniku poruku
		catch(OutOfMemoryError e){
			System.out.println("System is out of memory.");
		}
		
	}

	/** Metoda koja prouzrokuje OutOfMemoryError */
	public static void napraviOutOfMemoryError(){
		
		ArrayList<Long> list = new ArrayList<>();
		// beskonacna petlja
		for(;;){
			// dodajemo nove elemente u listu sve dok 
			// program ne izbaci OOM
			list.add(11L);
		}
	}

}
