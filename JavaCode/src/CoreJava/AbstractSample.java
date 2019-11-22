package CoreJava;

abstract class Shape{
	
	double dim1;
	double dim2;
	
	Shape(double dimension1, double dimension2){
		
		dim1 = dimension1;
		dim2 = dimension2;
		
	}
	
	abstract double area(); //Abstract Method
	
	//concrete method 
	void display() {
		
		System.out.println("Inside Shape Class.");
	}
	
}

class Rectangle extends Shape{
	
	Rectangle(double length , double width){
		
		super(length,width);
	}
	
	//Overriding the abstract method 
	double area() {
		
		System.out.println("Inside Area for Rectangle.");
		return dim1*dim2;
		
	}
	
}

class Triangle extends Shape{
	
	Triangle(double side1, double side2){
		
		super(side1,side2);
		
	}
	
	//Overriding the abstract method 
	double area() {
		
		System.out.println("Inside Area for Triangle.");
		return (dim1*dim2)/2;
		
	}
	
}

public class AbstractSample {

	public static void main(String[] args) {
		
		Shape shape;
		Rectangle rectangle = new Rectangle(2,3);
		Triangle triangle = new Triangle(3,3);
		
		shape = rectangle;
		shape.display();
		System.out.println("Area is : "+shape.area());
		
		shape = triangle;
		System.out.println("Area is : "+shape.area());  

	}

}
