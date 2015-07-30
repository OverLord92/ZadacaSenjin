package zadaci_30_07_2015;

import java.util.Scanner;

/**
 * Napisati program koji učitava cijele brojeve u rasponu od 1 do 100 te broji i
 * ispisuje koliko je koji broj puta unijet. Pretpostavimo da nula prekida unos
 * brojeva. Ukoliko unesemo sljedeći niz brojeva 2 5 6 23 42 58 2 6 0 program nam
 * ispisuje da se broj 2 ponavlja 2 puta, broj 5 jednom, broj 6 2 puta, broj 23
 * jednom, itd.
 */

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		
		// niz u koji smjestamo koliko je se puta koji broj ponovio 
		int[] niz = new int[101];
		
		System.out.print("Enter an array of integers: ");
		
		// korisnik unosi brojeve
		do{
			num = input.nextInt();
			
			niz[num]++;
			
		}while(num  != 0);
		
		// printanje rezultata
		for(int i = 1; i <= 100; i++){
			if(niz[i] != 0)
				System.out.printf("The number %3d  ocurrs %3d  times.\n", i, niz[i]);
		}
		
		input.close();
		
	}

}
