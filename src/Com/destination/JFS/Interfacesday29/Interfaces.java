package Com.destination.JFS.Interfacesday29;

import java.util.Scanner;

//Define the interface
interface Shapes {
 void collectData();
 void calculate();
 void display();
}

//Circle class implementing Shapes
class Circle implements Shapes {
 private double radius;
 private double area;
 private double PI = 3.14159;

 @Override
 public void collectData() {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the radius:");
     radius = sc.nextDouble();
     System.out.println("Radius is: " + radius);
 }


 public void calculate() {
     area = PI * radius * radius;
 }


 public void display() {
     System.out.println("Area of the Circle is: " + area);
 }
}

//Rectangle class implementing Shapes
class Rectangle implements Shapes {
 private double length;
 private double breadth;
 private double area;

 @Override
 public void collectData() {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the length and breadth:");
     length = sc.nextDouble();
     breadth = sc.nextDouble();
     System.out.println("Rectangle dimensions are: length = " + length + ", breadth = " + breadth);
 }


 public void calculate() {
     area = length * breadth;
 }

 public void display() {
     System.out.println("Area of the Rectangle is: " + area);
 }
}

//Square class implementing Shapes
class Square implements Shapes {
 private double side;
 private double area;

 @Override
 public void collectData() {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the side length:");
     side = sc.nextDouble();
     System.out.println("Side length is: " + side);
 }


 public void calculate() {
     area = side * side;
 }


 public void display() {
     System.out.println("Area of the Square is: " + area);
 }
}

//Geometry class to work with shapes
class Geometry {
 void permit(Shapes shape) {
     shape.collectData();
     shape.calculate();
     shape.display();
 }
}


class Interfaceshapes {
	public static void main(String[] args) {
		 Circle c = new Circle();
	        Rectangle r = new Rectangle();
	        Square s = new Square();

	        Geometry g = new Geometry();

	        System.out.println("Circle");
	        g.permit(c);
	        System.out.println("-----------");
	        System.out.println("Rectangle");
	        g.permit(r);
	        System.out.println("-----------");
	        System.out.println("Square");
	        g.permit(s);
	        System.out.println("-----------");
	    }
	
	}





