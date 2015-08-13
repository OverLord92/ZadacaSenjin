package zadaci_13_08_2015;

// treba metoda overlap

public class Zadatak3 {

}

class MyRectangle2D{
	private double x = 0;
	private double y= 0;
	
	private double width = 1;
	private double height = 1;
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	MyRectangle2D(){
		
	}
	
	MyRectangle2D(double x, double y, double width, double height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public double getArea(){
		return this.width * this.height;
	}
	
	public double getPerimeter(){
		return 2 * (this.width + this.height);
	}
	
	public boolean contains(double x, double y){
		if(x < this.x - width / 2 || x > this.x + width / 2)
			return false;
		
		if(y < this.y - height / 2 || y > this.y + height / 2)
			return false;
		return true;
	}
	
	public boolean contains(MyRectangle2D rectangle){
		if(!this.contains(rectangle.x - rectangle.width/2, rectangle.y - rectangle.height / 2))
			return false;
		
		if(!this.contains(rectangle.x - rectangle.width/2, rectangle.y + rectangle.height / 2))
			return false;
		
		if(!this.contains(rectangle.x + rectangle.width/2, rectangle.y - rectangle.height / 2))
			return false;
		
		if(!this.contains(rectangle.x + rectangle.width/2, rectangle.y + rectangle.height / 2))
			return false;
		
		return true;
	}
	
}
