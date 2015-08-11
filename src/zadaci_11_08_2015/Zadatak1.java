package zadaci_11_08_2015;

/** Design a class named Fan to represent a fan. */

public class Zadatak1 {

	/** Test program */
	public static void main(String[] args) {

		// kreiramo dva Fan objekta
		Fan fan1 = new Fan();

		// postavljamo karakteristike
		fan1.setSpeed(Fan.FAST);
		fan1.setRadius(10);
		fan1.color = "yellow";
		fan1.setOn(true);

		Fan fan2 = new Fan();
		fan2.setRadius(5);
		fan2.color = "blue";

		// printamo objekte u konzoli
		System.out.println(fan1);
		System.out.println(fan2);

	}

}

class Fan {
	// konstante za brzinu
	final static int SLOW = 1;
	final static int MEDIUM = 2;
	final static int FAST = 3;

	// date field-s
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	String color = "blue";

	// no arg kontruktor
	public Fan() {

	}

	// geteri i seteri za private data fields
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// overrajdovana toString metoda
	@Override
	public String toString() {
		return (isOn() ? "fan speed: " + this.speed + ", fan color: "
				+ this.color + ", fan radius: " + this.radius : "fan color: "
				+ this.color + ", fan radius: " + this.radius + ", fan is off.");
	}

}
