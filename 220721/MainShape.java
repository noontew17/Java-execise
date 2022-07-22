import java.lang.Math.*;
// Step 1
class Point{
	private double x;
	private double y;
	
	// Constructor 
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	// Setter 
	
	public void setX(double x){
		this.x = x;
	}

	public void setY(double y){
		this.y = y;
	}
	
	// Getter 
	
	public double getX(){
		return this.x;
	}

	public double getY(){
		return this.y;
	}
	
	public String toString(){
		return "x: "+ this.x + " " + "y: "+ this.y;
	}
}

// Step 2
abstract class Shape {
	private String name;
	private String colour;
	private double positionX1;
	private double positionX2;
	private double positionY1;
	private double positionY2;
	// Constructor 
	
	public Shape(String name, String colour, double positionX1, double positionX2, double positionY1, double positionY2){
		this.name = name;
		this.colour = colour;
		this.positionX1 = positionX1;
		this.positionX2 = positionX2;
		this.positionY1 = positionY1;
		this.positionY2 = positionY2;
	}
	
	// Setter 
	
	public void setName(String name){
		this.name = name;
	}

	public void setColour(String colour){
		this.colour = colour;
	}
	
	public void setPositionX1(double positionX1){
		this.positionX1 = positionX1;
	}
	
	public void setPositionX2(double positionX2){
		this.positionX2 = positionX2;
	}

	public void setPositionY1(double positionY1){
		this.positionY1 = positionY1;
	}
	
	public void setPositionY2(double positionY2){
		this.positionY2 = positionY2;
	}
	// Getter 
	
	public double getPositionX1(){
		return this.positionX1;
	}
	
	public double getPositionX2(){
		return this.positionX2;
	}

	public double getPositionY1(){
		return this.positionY1;
	}
	
	public double getPositionY2(){
		return this.positionY2;
	}
	
	public String toString(){
		return "Name: "+ this.name + " " + "Colour: "+ this.colour + " " + "x1: "+ this.positionX1 + " " + "x2: "+ this.positionX2 + " " + "y1: "+" " + this.positionY2+ "y2: "+ this.positionX2;
	}
	
	public abstract double getArea();
	
	public abstract Point getCentrePoint(); 
	
}


class Rectangle extends Shape{
	private double width;
	private double height;
	
	// Constructor
	public Rectangle(String name, String colour, double positionX1, double positionX2, double positionY1, double positionY2, double width, double height){
		super(name, colour, positionX1, positionX2, positionY1, positionY2);
		this.width = width;
		this.height = height;
	}
	
	// Setter
	
	public void setWidth(double width){
		this.width = width;
	}
	public void setHeight(double height){
		this.height = height;
	}
	
	
	// Getter 

	
	public double getWidth(){
		return this.width;
	}
	
	public double getHeight(){
		return this.height;
	}

	
	@Override
	public double getArea(){
		return this.width * this.height;
	}
	
	@Override
	public Point getCentrePoint(){
		return new Point( (super.getPositionX1() + super.getPositionX2())/2 , (super.getPositionY1()+ super.getPositionY2())/2);		
	}
	
	@Override
	public String toString(){
		return super.toString() + " " + "width: " + this.width +" "+ "height: "+ this.height + " " + "Area: " + getArea() + " Is it a square:" + isSquare()+ " " + "Centre point is:" + getCentrePoint();
	}
	// custom function
	public boolean isSquare(){
		if (this.width == this.height){
			return true;
		}
		else {
			return false;
		}
	}
	
	
}


class Circle extends Shape{
	private double radius;

	// Constructor
	public Circle(String name, String colour, double positionX1, double positionX2, double positionY1, double positionY2, double radius){
		super(name, colour, positionX1, positionX2, positionY1, positionY2);
		this.radius = radius;
	}
	// Setter

	public void setRadius(double radius){
		this.radius = radius;
	}
	
	// Getter 
	
	public double getRadius(){
		return this.radius;
	}
	

	@Override
	public double getArea(){
		return Math.PI* this.radius * this.radius;
	}
	
	@Override
	public Point getCentrePoint(){
		return new Point( (super.getPositionX1() + super.getPositionX2())/2 , (super.getPositionY1()+ super.getPositionY2())/2);		
	}
	
	@Override
	public String toString(){
		return super.toString() + " " + "radius: " + this.radius + " " + "Area: " + getArea() + " " + "Centre point is:" + getCentrePoint();
	}
	
}

class MainShape{
	public static void main(String[] args){
		// create rectangle
		Shape t1 = new Rectangle("Rec 1", " Red ", 10 , 5, 4,4, 2, 2);
		Shape t2 = new Rectangle("Rec 2", " Blue ", 14 , 10, 5, 6, 7, 2);
		Shape t3 = new Rectangle("Rec 3", " Green ", 5 , 5, 5, 6, 7, 4);
		System.out.println(t1.toString());
		
		Shape c1 = new Circle("Cir 1", " Red ", 10 , 5, 4,4, 2);
		Shape c2 = new Circle("Cir 2", " Blue ", 14 , 10, 5, 6, 7);
		Shape c3 = new Circle("Cir 3", " Green ", 5 , 5, 5, 6, 7);
		System.out.println(c1.toString());
		
	}

}