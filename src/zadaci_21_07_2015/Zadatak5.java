package zadaci_21_07_2015;

import java.util.Scanner;

/**
 * Napisati metodu koja prima jedan argument te simulira bacanje novčića toliko
 * puta. Nakon što se simulacija završi, program ispisuje koliko puta je novčić
 * pokazao glavu a koliko puta pismo.
 */

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("You are playing flip a coin. Enter the number of throws:  ");
		flipACoin(input.nextInt());
		input.close();
	}
	
	public static void flipACoin(int n){
		int heads = 0;
		for(int i = 0; i < n; i++){
			if((int)(Math.random()*2) == 0){
				heads++;
			}
		}
		System.out.println("Heads: " + heads);
		System.out.println("Tails: " + (n - heads));
	}

}
