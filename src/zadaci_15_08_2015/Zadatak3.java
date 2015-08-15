package zadaci_15_08_2015;

/**
 * 10.24 (Implement the Character class) The Character class is provided in the
 * Java library. Provide your own implementation for this class. Name the new
 * class MyCharacter.
 */

public class Zadatak3 {

	/** Test program */
	public static void main(String[] args) {
		
		// testiranje toUpperCase metode
		MyCharacter c1 = new MyCharacter('a');
		System.out.println(c1.toUpperCase());
		
		// testiranje toLowerCase metode
		MyCharacter c2 = new MyCharacter('Z');
		System.out.println(c2.toLowerCase());

	}

}

class MyCharacter{
	char data;
	
	MyCharacter(char c){
		this.data = c;
	}
	
	/** Metoda koja vraca lowercase MyCharacter */
	public MyCharacter toLowerCase(){
		if(this.data >= 65 && this.data <= 90){
			return new MyCharacter((char)((int)this.data + 32));
		}
		else{
			return new MyCharacter(this.data);
		}
	}
	
	/** Metoda koja vraca uppercase MyCharacter */
	public MyCharacter toUpperCase(){
		if(this.data >= 97 && this.data <= 122){
			return new MyCharacter((char)((int)this.data - 32));
		}
		else{
			return new MyCharacter(this.data);
		}
	}
	
	/** Overrajdovana tostring metoda */
	public String toString(){
		return this.data + "";
	}
}
