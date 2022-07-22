abstract class Shape{
	private String name;
	private String desc;
	private String colour;
	private int vertices;
	private double area;


	
	// Constructor
	public Shape(int vertices){
		this.vertices = 0;
	}
	
	public Shape(String name, String desc, String colour, int vertices){
		this.name = name;
		this.desc = desc;
		this.colour = colour;
		this.vertices = vertices;
		
	}
	
	// Setter
	public void setName(String name){
		this.name = name;
	}

	public void setDesc(String desc){
		this.desc = desc;
	}
	
	public void setColour(String colour){
		this.colour = colour;
	}
	
	public void setVertices(int vertices){
		this.vertices = vertices;
	}
	
	public void setArea(double area){
		this.area = area;
	}
	
	// Getter
	public String getName(){
		return this.name;
	}
	
	public String getDesc(){
		return this.desc;
	}
	
	public String getColour(){
		return this.colour;
	}
	
	public int getVertices(){
		return this.vertices;
	}
	
	public abstract double getArea();
	
	public String getShapeDetails(){
		return "Name: " + this.name + " " + "Description: " + this.desc + " " + "Colour: "+ this.colour + " " + " Vertices" + this.vertices + " ";
		
	}
}

class Circle extends Shape{
	private double radius;
	private double diameter;
	private double area;
	
	//Constructors
	
	public Circle(String name, String desc, String colour, int vertices, double radius){
		super(name, desc, colour, vertices);
		this.radius = radius;
		this.diameter = 2 * radius;
	
	}
	
	// Setter
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	// Getter 
	
	public double getRadius(){
		return this.radius;
	}
	
	public double getDiameter(){
		return this.diameter;
	}

	
	public double getArea(){
		area = 3.142 * this.radius * this.radius;
		return area;
	}

	
	public String getShapeDetails(){
		return super.getShapeDetails() + "Radius: " + getRadius() + "Diameter: " + getDiameter() + " " + "Area: " +getArea();
	}
}

/* class Rectangle{}

class Traingle{} */

class ShapesInfo{
	public static void main(String[] args){
		Circle c1 = new Circle("Circle","Round shaped","Red", 5, 12);
		System.out.println(c1.getShapeDetails());
		c1.setVertices(3);
		System.out.println(c1.getShapeDetails());
	}
}